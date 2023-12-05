
package signup;

import java.awt.Color;

/**
 *
 * @author Aditya
 */
public class Dashboard extends javax.swing.JFrame {

    public String user;
    public Dashboard(String Username) {
        initComponents();
        setBackground(new Color(0,0,0,0));
        user=Username;
        jLabel1.setText(user);
        jLabel4.setText("Hi "+user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new components.PanelBorder();
        background1 = new components.Background();
        jLabel2 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        kButton6 = new com.k33ptoo.components.KButton();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        card1 = new components.Card();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        card_Square1 = new components.Card_Square();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        card_Orange1 = new components.Card_Orange();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        card_Red1 = new components.Card_Red();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Credecio");

        kButton1.setText("Update Profile");
        kButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton1.setkBorderRadius(0);
        kButton1.setkEndColor(new Color(0,0,0,0));
        kButton1.setkHoverEndColor(new Color(0,0,0,50));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new Color(0,0,0,50));
        kButton1.setkStartColor(new Color(0,0,0,0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setText("Log out");
        kButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton2.setkBorderRadius(0);
        kButton2.setkEndColor(new Color(0,0,0,0));
        kButton2.setkHoverEndColor(new Color(0,0,0,50));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new Color(0,0,0,50));
        kButton2.setkStartColor(new Color(0,0,0,0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        kButton3.setText("Check Balance");
        kButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton3.setkBorderRadius(0);
        kButton3.setkEndColor(new Color(0,0,0,0));
        kButton3.setkHoverEndColor(new Color(0,0,0,50));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new Color(0,0,0,50));
        kButton3.setkStartColor(new Color(0,0,0,0));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        kButton4.setText("Transfer");
        kButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton4.setkBorderRadius(0);
        kButton4.setkEndColor(new Color(0,0,0,0));
        kButton4.setkHoverEndColor(new Color(0,0,0,50));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkHoverStartColor(new Color(0,0,0,50));
        kButton4.setkStartColor(new Color(0,0,0,0));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });

        kButton5.setText("History");
        kButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton5.setkBorderRadius(0);
        kButton5.setkEndColor(new Color(0,0,0,0));
        kButton5.setkHoverEndColor(new Color(0,0,0,50));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton5.setkHoverStartColor(new Color(0,0,0,50));
        kButton5.setkStartColor(new Color(0,0,0,0));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });

        kButton6.setText("Complaints");
        kButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton6.setkBorderRadius(0);
        kButton6.setkEndColor(new Color(0,0,0,0));
        kButton6.setkHoverEndColor(new Color(0,0,0,50));
        kButton6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton6.setkHoverStartColor(new Color(0,0,0,50));
        kButton6.setkStartColor(new Color(0,0,0,0));
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Every transaction counts");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addComponent(kButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        panelBorder1.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        kGradientPanel2.setAutoscrolls(true);
        kGradientPanel2.setkBorderRadius(15);
        kGradientPanel2.setkEndColor(new java.awt.Color(153, 255, 153));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("friendly interface and cutting-edge security features, Credecio empowers users to manage their finances seamlessly");
        jLabel6.setToolTipText("");
        card1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 910, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("from the comfort of their devices.");
        jLabel7.setToolTipText("");
        card1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 910, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("We thank you for joining the Credecio Team and we hope we can your every transaction count.");
        jLabel8.setToolTipText("");
        card1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 910, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Credecio: an innovative net banking system designed to streamline and enhance your financial experience. With a user");
        jLabel9.setToolTipText("");
        card1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 920, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Credecio: an innovative net banking system designed to streamline and enhance your financial experience. With a user");
        jLabel10.setToolTipText("");
        card1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 920, -1));

        kGradientPanel2.add(card1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 101, 940, 190));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("<html>This November get awesome<br>cashback offers on your<br>favourite brands upto 30%</html>");
        jLabel3.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Maha Cashback Offer");
        jLabel11.setToolTipText("");

        javax.swing.GroupLayout card_Square1Layout = new javax.swing.GroupLayout(card_Square1);
        card_Square1.setLayout(card_Square1Layout);
        card_Square1Layout.setHorizontalGroup(
            card_Square1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_Square1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(card_Square1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        card_Square1Layout.setVerticalGroup(
            card_Square1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_Square1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        kGradientPanel2.add(card_Square1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 300, 300));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Double Delight Savings");
        jLabel14.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("<html>Save and Earn! Get double<br>interest on your savings this season<br>Limited time offer, act now!</html>");
        jLabel15.setToolTipText("");

        javax.swing.GroupLayout card_Orange1Layout = new javax.swing.GroupLayout(card_Orange1);
        card_Orange1.setLayout(card_Orange1Layout);
        card_Orange1Layout.setHorizontalGroup(
            card_Orange1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_Orange1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(card_Orange1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(card_Orange1Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );
        card_Orange1Layout.setVerticalGroup(
            card_Orange1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_Orange1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(card_Orange1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(card_Orange1Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(171, Short.MAX_VALUE)))
        );

        kGradientPanel2.add(card_Orange1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 300, 300));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Festival Funds Frenzy");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("<html>Celebrate with Cash! Open a<br>savings account and receive an extra<br>$50 festival bonus. Don't miss out!</html>");
        jLabel13.setToolTipText("");

        javax.swing.GroupLayout card_Red1Layout = new javax.swing.GroupLayout(card_Red1);
        card_Red1.setLayout(card_Red1Layout);
        card_Red1Layout.setHorizontalGroup(
            card_Red1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_Red1Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(card_Red1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        card_Red1Layout.setVerticalGroup(
            card_Red1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_Red1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        kGradientPanel2.add(card_Red1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 300, 300));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Hi Username!");
        kGradientPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 26, 213, -1));

        panelBorder1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 1010, 660));

        kGradientPanel1.setkBorderRadius(15);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("UserName");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(915, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBorder1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1010, 70));

        getContentPane().add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        Dashboard_Balance balance = new Dashboard_Balance(user);
        balance.setLocationRelativeTo(null);
        balance.setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        Dashboard_History history = new Dashboard_History(user);
        history.setLocationRelativeTo(null);
        history.setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        Dashboard_Profile profile =  new Dashboard_Profile(user);
        profile.setLocationRelativeTo(null);
        profile.setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        Dashboard_Transfer transfer = new Dashboard_Transfer(user);
        transfer.setLocationRelativeTo(null);
        transfer.setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        Dashboard_Complaint complaint = new Dashboard_Complaint(user);
        complaint.setLocationRelativeTo(null);
        complaint.setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton6ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        SignUp sig = new SignUp();
        sig.setLocationRelativeTo(null); // Centering the Login frame on the screen
        sig.setVisible(true);
        dispose();
    }//GEN-LAST:event_kButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.Background background1;
    private components.Card card1;
    private components.Card_Orange card_Orange1;
    private components.Card_Red card_Red1;
    private components.Card_Square card_Square1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private components.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
