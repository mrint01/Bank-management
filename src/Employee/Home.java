package Employee;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author MR-INT
 */
public class Home extends javax.swing.JFrame {

    Withdraw withdraw = new Withdraw();
    Deposit deposit = new Deposit();
    Transfer transfer = new Transfer();
    MyConnection me = new MyConnection();

    private static final long serialVersionUID = 1L;
    private final Image img_dollar = new ImageIcon(Login.class.getResource("img/wu.png")).getImage().getScaledInstance(100, 70, Image.SCALE_SMOOTH);
    private final Image img_deposit = new ImageIcon(Login.class.getResource("img/deposit.png")).getImage().getScaledInstance(60, 40, Image.SCALE_SMOOTH);
    private final Image img_withdraw = new ImageIcon(Login.class.getResource("img/withdraw.png")).getImage().getScaledInstance(60, 40, Image.SCALE_SMOOTH);
    private final Image img_transfer = new ImageIcon(Login.class.getResource("img/transfer.png")).getImage().getScaledInstance(60, 40, Image.SCALE_SMOOTH);
    private final Image img_account = new ImageIcon(Login.class.getResource("img/accounts.png")).getImage().getScaledInstance(60, 40, Image.SCALE_SMOOTH);
    private final Image img_cust = new ImageIcon(Login.class.getResource("img/user.png")).getImage().getScaledInstance(60, 40, Image.SCALE_SMOOTH);
    private final Image img_employee = new ImageIcon(Login.class.getResource("img/employee.png")).getImage().getScaledInstance(60, 40, Image.SCALE_SMOOTH);

    public Home() {

        initComponents();
        lbllogo.setIcon(new ImageIcon(img_dollar));
        BtnWithdraw.setIcon(new ImageIcon(img_withdraw));
        BtnDeposit1.setIcon(new ImageIcon(img_deposit));
        BtnTransfert.setIcon(new ImageIcon(img_transfer));

        int nbraccounts = me.getAccountList().size();
        int nbUsers = me.getCustomerList().size();
        int nbrEmployee = me.getEmployeeList().size();

        lblAccount.setText(nbraccounts + " Accounts");
        lblAccount.setIcon(new ImageIcon(img_account));

        lblUsr.setText(nbUsers + " Customers");
        lblUsr.setIcon(new ImageIcon(img_cust));

        lblEmp.setText(nbrEmployee + " Employee");
        lblEmp.setIcon(new ImageIcon(img_employee));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Forme_Home = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelEmp = new javax.swing.JPanel();
        lblEmp = new javax.swing.JLabel();
        panelUsr = new javax.swing.JPanel();
        lblUsr = new javax.swing.JLabel();
        panelAccount = new javax.swing.JPanel();
        lblAccount = new javax.swing.JLabel();
        BtnTransfert = new javax.swing.JButton();
        BtnDeposit1 = new javax.swing.JButton();
        BtnWithdraw = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Forme_Home.setBackground(new java.awt.Color(38, 67, 72));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bank Management System Of Dollar Bank  ");

        panelEmp.setBackground(new java.awt.Color(4, 79, 103));
        panelEmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        lblEmp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmp.setForeground(new java.awt.Color(51, 255, 51));
        lblEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmp.setText("Employee");

        javax.swing.GroupLayout panelEmpLayout = new javax.swing.GroupLayout(panelEmp);
        panelEmp.setLayout(panelEmpLayout);
        panelEmpLayout.setHorizontalGroup(
            panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelEmpLayout.setVerticalGroup(
            panelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        panelUsr.setBackground(new java.awt.Color(4, 79, 103));
        panelUsr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        lblUsr.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUsr.setForeground(new java.awt.Color(51, 255, 51));
        lblUsr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsr.setText("User");

        javax.swing.GroupLayout panelUsrLayout = new javax.swing.GroupLayout(panelUsr);
        panelUsr.setLayout(panelUsrLayout);
        panelUsrLayout.setHorizontalGroup(
            panelUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelUsrLayout.setVerticalGroup(
            panelUsrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblUsr, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        panelAccount.setBackground(new java.awt.Color(4, 79, 103));
        panelAccount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));

        lblAccount.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAccount.setForeground(new java.awt.Color(51, 255, 51));
        lblAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccount.setText("Account");

        javax.swing.GroupLayout panelAccountLayout = new javax.swing.GroupLayout(panelAccount);
        panelAccount.setLayout(panelAccountLayout);
        panelAccountLayout.setHorizontalGroup(
            panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelAccountLayout.setVerticalGroup(
            panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        BtnTransfert.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionForeground"));
        BtnTransfert.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnTransfert.setForeground(new java.awt.Color(255, 255, 255));
        BtnTransfert.setText("Transfer");
        BtnTransfert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnTransfertMouseClicked(evt);
            }
        });
        BtnTransfert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTransfertActionPerformed(evt);
            }
        });

        BtnDeposit1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionForeground"));
        BtnDeposit1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnDeposit1.setForeground(new java.awt.Color(255, 255, 255));
        BtnDeposit1.setText("Deposit");
        BtnDeposit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDeposit1MouseClicked(evt);
            }
        });
        BtnDeposit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeposit1ActionPerformed(evt);
            }
        });

        BtnWithdraw.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionForeground"));
        BtnWithdraw.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        BtnWithdraw.setText("Withdraw");
        BtnWithdraw.setToolTipText("");
        BtnWithdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnWithdrawMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Panel");

        javax.swing.GroupLayout Forme_HomeLayout = new javax.swing.GroupLayout(Forme_Home);
        Forme_Home.setLayout(Forme_HomeLayout);
        Forme_HomeLayout.setHorizontalGroup(
            Forme_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbllogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Forme_HomeLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(panelUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63)
                .addComponent(panelEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71)
                .addComponent(panelAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Forme_HomeLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(BtnWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(204, 204, 204)
                .addComponent(BtnDeposit1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(186, 186, 186)
                .addComponent(BtnTransfert, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(152, 152, 152))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Forme_HomeLayout.setVerticalGroup(
            Forme_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Forme_HomeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Forme_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelUsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(Forme_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnTransfert, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDeposit1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(220, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Forme_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Forme_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTransfertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTransfertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnTransfertActionPerformed

    private void BtnDeposit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeposit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDeposit1ActionPerformed

    private void BtnWithdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnWithdrawMouseClicked

        if (Forme_Home.isShowing()) {

            Forme_Home.removeAll();
        }
        Forme_Home.removeAll();
        Forme_Home.repaint();
        Forme_Home.setLayout(new BorderLayout());
        Forme_Home.revalidate();

        Forme_Home.add(withdraw.Forme_Withdraw, BorderLayout.CENTER);

    }//GEN-LAST:event_BtnWithdrawMouseClicked

    private void BtnDeposit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDeposit1MouseClicked
        if (Forme_Home.isShowing()) {

            Forme_Home.removeAll();
        }
        Forme_Home.removeAll();
        Forme_Home.repaint();
        Forme_Home.setLayout(new BorderLayout());
        Forme_Home.revalidate();

        Forme_Home.add(deposit.Forme_deposit, BorderLayout.CENTER);
    }//GEN-LAST:event_BtnDeposit1MouseClicked

    private void BtnTransfertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTransfertMouseClicked

        if (Forme_Home.isShowing()) {

            Forme_Home.removeAll();
        }
        Forme_Home.removeAll();
        Forme_Home.repaint();
        Forme_Home.setLayout(new BorderLayout());
        Forme_Home.revalidate();

        Forme_Home.add(transfer.Forme_Transfer, BorderLayout.CENTER);
    }//GEN-LAST:event_BtnTransfertMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnDeposit1;
    public javax.swing.JButton BtnTransfert;
    public javax.swing.JButton BtnWithdraw;
    public javax.swing.JPanel Forme_Home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel lblAccount;
    public javax.swing.JLabel lblEmp;
    public javax.swing.JLabel lblUsr;
    public javax.swing.JLabel lbllogo;
    public javax.swing.JPanel panelAccount;
    public javax.swing.JPanel panelEmp;
    public javax.swing.JPanel panelUsr;
    // End of variables declaration//GEN-END:variables

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                UIManager.put("OptionPane.cancelButtonText", "Cancel");
                UIManager.put("OptionPane.noButtonText", "No");
                UIManager.put("OptionPane.okButtonText", "OK");
                UIManager.put("OptionPane.yesButtonText", "Yes");

                new Home().setVisible(true);

            }
        });
    }

}
