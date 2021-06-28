package Employee;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Deposit extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    MyConnection me = new MyConnection();
    private final Image img_back = new ImageIcon(Login.class.getResource("img/back.png")).getImage().getScaledInstance(40, 20, Image.SCALE_SMOOTH);
    private final Image img_find = new ImageIcon(Login.class.getResource("img/find.png")).getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);
    private final Image img_confirm = new ImageIcon(Login.class.getResource("img/confirm.png")).getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);

    public Deposit() {
        initComponents();
        BtnRetourDeposit_Home.setIcon(new ImageIcon(img_back));
        BtnFind.setIcon(new ImageIcon(img_find));
        BtnConfirm.setIcon(new ImageIcon(img_confirm));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Forme_deposit = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BtnRetourDeposit_Home = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAcc_id = new javax.swing.JTextField();
        txtWithdraw_amount = new javax.swing.JTextField();
        lblCust_name = new javax.swing.JLabel();
        lblAccount_Balance = new javax.swing.JLabel();
        BtnConfirm = new javax.swing.JButton();
        BtnFind = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Forme_deposit.setBackground(new java.awt.Color(38, 67, 72));

        jPanel1.setBackground(new java.awt.Color(38, 67, 72));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deposit", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        BtnRetourDeposit_Home.setBackground(new java.awt.Color(51, 51, 51));
        BtnRetourDeposit_Home.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnRetourDeposit_Home.setForeground(new java.awt.Color(255, 255, 255));
        BtnRetourDeposit_Home.setText("Back");
        BtnRetourDeposit_Home.setToolTipText("");
        BtnRetourDeposit_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRetourDeposit_HomeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Account ID :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Balance :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Deposit Amount  :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer Full Name :");

        txtAcc_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcc_idActionPerformed(evt);
            }
        });

        txtWithdraw_amount.setBackground(new java.awt.Color(153, 0, 0));
        txtWithdraw_amount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtWithdraw_amount.setForeground(new java.awt.Color(204, 204, 204));
        txtWithdraw_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWithdraw_amountActionPerformed(evt);
            }
        });

        lblCust_name.setForeground(new java.awt.Color(153, 255, 255));
        lblCust_name.setText("Customer Name");

        lblAccount_Balance.setForeground(new java.awt.Color(153, 255, 255));
        lblAccount_Balance.setText("Account Balance");

        BtnConfirm.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.caretForeground"));
        BtnConfirm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        BtnConfirm.setText("Confirm");
        BtnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnConfirmMouseClicked(evt);
            }
        });

        BtnFind.setBackground(new java.awt.Color(51, 51, 51));
        BtnFind.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnFind.setForeground(new java.awt.Color(204, 204, 204));
        BtnFind.setText("Find");
        BtnFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnFindMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWithdraw_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCust_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAcc_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAccount_Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnFind)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnRetourDeposit_Home, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(BtnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAcc_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnFind))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lblCust_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3))
                            .addComponent(lblAccount_Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtWithdraw_amount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(202, 202, 202)
                            .addComponent(BtnRetourDeposit_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(BtnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(253, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Deposit");

        javax.swing.GroupLayout Forme_depositLayout = new javax.swing.GroupLayout(Forme_deposit);
        Forme_deposit.setLayout(Forme_depositLayout);
        Forme_depositLayout.setHorizontalGroup(
            Forme_depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Forme_depositLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1166, Short.MAX_VALUE)
        );
        Forme_depositLayout.setVerticalGroup(
            Forme_depositLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Forme_depositLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Forme_deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Forme_deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRetourDeposit_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRetourDeposit_HomeMouseClicked

        Home home = new Home();

        if (Forme_deposit.isShowing()) {

            Forme_deposit.removeAll();
        }
        Forme_deposit.removeAll();
        Forme_deposit.repaint();
        Forme_deposit.setLayout(new BorderLayout());
        Forme_deposit.revalidate();
        Forme_deposit.add(home.Forme_Home, BorderLayout.CENTER);
    }//GEN-LAST:event_BtnRetourDeposit_HomeMouseClicked

    private void txtAcc_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcc_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcc_idActionPerformed

    private void txtWithdraw_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWithdraw_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWithdraw_amountActionPerformed

    private void BtnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnConfirmMouseClicked
        me.DepositAccount(txtAcc_id, txtWithdraw_amount, lblCust_name, lblAccount_Balance);
    }//GEN-LAST:event_BtnConfirmMouseClicked

    private void BtnFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFindMouseClicked
        me.FindAccount(txtAcc_id, lblCust_name, lblAccount_Balance);
    }//GEN-LAST:event_BtnFindMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnConfirm;
    public javax.swing.JButton BtnFind;
    public javax.swing.JButton BtnRetourDeposit_Home;
    public javax.swing.JPanel Forme_deposit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblAccount_Balance;
    public javax.swing.JLabel lblCust_name;
    public javax.swing.JTextField txtAcc_id;
    public javax.swing.JTextField txtWithdraw_amount;
    // End of variables declaration//GEN-END:variables
}
