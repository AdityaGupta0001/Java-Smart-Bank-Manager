/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package signup;

import java.sql.*;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

/**
 *
 * @author Aditya
 */
public class databaseHandler {
    private Connection connection;
    
    private void createDatabaseIfNotExists() {
        try {
            Connection tempConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "12345");
            Statement statement = tempConnection.createStatement();
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS credecio");
            statement.executeUpdate("USE credecio");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS user(Username VARCHAR(50) PRIMARY KEY, Password VARCHAR(50) NOT NULL)");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS admin(Username VARCHAR(50) PRIMARY KEY, Password VARCHAR(50) NOT NULL)");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS UserData(FirstName VARCHAR(50), LastName VARCHAR(50), DateOfBirth DATE, Address VARCHAR(255) , ContactNumber VARCHAR(20) , EmailAddress VARCHAR(255) , Username VARCHAR(50) PRIMARY KEY, Password VARCHAR(50) , AccountNumber INT UNIQUE, Balance DECIMAL(18,2) DEFAULT 1000.00, AccountStatus VARCHAR(50) , DateCreated DATE )");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS complaints(ComplaintID VARCHAR(50),Username VARCHAR(50), Complaint VARCHAR(255), Date DATE, Time TIME, Status VARCHAR(50));");
            tempConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public databaseHandler(){
        try {
            createDatabaseIfNotExists();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/credecio", "root", "12345");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void newUser(String data) {
        try {
            Statement statement = connection.createStatement();
            Random rand = new Random();
            int accNo = rand.nextInt(100000000, 999999999);
            
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(currentDate);
            
            String username = data.substring(1, data.indexOf(',')-1);
            statement.executeUpdate("INSERT INTO user (Username,Password) VALUES (" + data + ");");
            statement.executeUpdate("INSERT INTO UserData(Username,Password,AccountStatus,AccountNumber,DateCreated) VALUES (" + data + ",'ACTIVE',"+accNo+",'"+formattedDate+"');");
            statement.executeUpdate("CREATE TABLE "+username+"_transactions(TransID VARCHAR(50), Recipient VARCHAR(50), Amount DECIMAL(18,2), Date DATE, Time TIME);");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean checkExistingUser(String username){
        boolean return_val=false;
        try{
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM user WHERE Username = '" + username + "'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                // Process the retrieved record here
                String user = resultSet.getString("username");
                if (username.equals(user)){
                    return_val=true;
                    break;
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return return_val;
        
    }
    public boolean loginExistingUser(String username, String password) {
        boolean isLoggedIn = false;
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM user WHERE Username = '" + username + "'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                // Process the retrieved record here
                String getPassword = resultSet.getString("password");
                if (getPassword.equals(password)){
                    isLoggedIn = true;
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isLoggedIn;
    }
    
    public String[] getUserData(String username){
        String[] rowData = null;
        try{
            Statement statement;
            statement = connection.createStatement();
            String query = "SELECT * FROM userdata WHERE Username = '" + username + "';";
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()){
                int columnCount = resultSet.getMetaData().getColumnCount();
                rowData = new String[columnCount];
                
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = resultSet.getString(i);
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return rowData;
        
    }
    
    public void updateUserData(String field, String value, String username){
        try{
            Statement statement;
            statement = connection.createStatement();
            String query = "UPDATE UserData SET "+field+"='"+value+"' WHERE username = '"+username+"';";
            int rowsAffected = statement.executeUpdate(query);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
        public void updateUserData(String field, SimpleDateFormat date, String username){
        try{
            Statement statement;
            statement = connection.createStatement();
            String query = "UPDATE UserData SET "+field+"="+date+" WHERE username = '"+username+"';";
            int rowsAffected = statement.executeUpdate(query);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
    public void transferFunds(String sender, String receiver, double amount){
        try{
            Statement statement;
            statement = connection.createStatement();
            String query1 = "UPDATE UserData SET balance=balance+"+amount+" WHERE username = '"+receiver+"';";
            String query2 = "UPDATE UserData SET balance=balance-"+amount+" WHERE username = '"+sender+"';";
            
            Random rand = new Random();
            int TransID = rand.nextInt(10000, 99999);
            
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(currentDate);
            
            LocalTime currentTime = LocalTime.now();
            java.sql.Time sqlTime = java.sql.Time.valueOf(currentTime);
            
            String query3 = "INSERT INTO "+sender+"_transactions VALUES('"+TransID+"','"+receiver+"',"+amount+",'"+formattedDate+"','"+sqlTime+"'"+");";
            int rowsAffected1 = statement.executeUpdate(query1);
            int rowsAffected2 = statement.executeUpdate(query2);
            int rowsAffected3 = statement.executeUpdate(query3);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        
        
    }
    public int countTransactions(String username){
        int recordCount = 0;
        try{
            Statement statement;
            statement = connection.createStatement();
            String query = "SELECT COUNT(*) AS recordCount FROM "+username+"_transactions;";
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()){
                recordCount = resultSet.getInt("recordCount");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return recordCount;
    }
    
    public String[][] getTransactionData(String username, int noOfTransactions){
        String[][] transactions = new String[noOfTransactions][5];
        int ctr = 0;
        try{
            Statement statement;
            statement = connection.createStatement();
            String query = "SELECT * FROM "+username+"_transactions ORDER BY Date DESC, Time DESC";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next() && ctr!=noOfTransactions){
                transactions[ctr][0] = resultSet.getString("TransID");
                transactions[ctr][1] = resultSet.getString("Recipient");
                transactions[ctr][2] = resultSet.getString("Amount");
                transactions[ctr][3] = resultSet.getString("Date");
                transactions[ctr][4] = resultSet.getString("Time");
                
                ctr=ctr+1;
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return transactions;
    }
    
    public void createComplaint(String username, String complaint){
        try{
            
            Random rand = new Random();
            int CompID = rand.nextInt(10000, 99999);
            
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(currentDate);
            
            LocalTime currentTime = LocalTime.now();
            java.sql.Time sqlTime = java.sql.Time.valueOf(currentTime);
            
            Statement statement;
            statement = connection.createStatement();
            String query = "INSERT INTO complaints VALUES('"+CompID+"','"+username+"','"+complaint+"','"+formattedDate+"','"+sqlTime+"','UNRESOLVED');";
            int rowsAffected = statement.executeUpdate(query);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
