/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.Image;
import javax.swing.ImageIcon;
import Employee.Login;

/**
 *
 * @author MR-INT
 */
public class Home_Admin extends javax.swing.JFrame {

    MyConnection_Admin me = new MyConnection_Admin();
    private static final long serialVersionUID = 1L;
    private final Image img_dollar = new ImageIcon(Login.class.getResource("img/wu.png")).getImage().getScaledInstance(100, 70, Image.SCALE_SMOOTH);
    private final Image img_account = new ImageIcon(Login.class.getResource("img/accounts.png")).getImage().getScaledInstance(60, 40, Image.SCALE_SMOOTH);
    private final Image img_cust = new ImageIcon(Login.class.getResource("img/user.png")).getImage().getScaledInstance(60, 40, Image.SCALE_SMOOTH);
    private final Image img_employee = new ImageIcon(Login.class.getResource("img/employee.png")).getImage().getScaledInstance(60, 40, Image.SCALE_SMOOTH);

    public Home_Admin() {
        initComponents();
        lbllogo.setIcon(new ImageIcon(img_dollar));

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
            .addComponent(lblEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
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
            .addComponent(lblUsr, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
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
            .addComponent(lblAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        panelAccountLayout.setVerticalGroup(
            panelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 170, 160));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Panel");

        javax.swing.GroupLayout Forme_HomeLayout = new javax.swing.GroupLayout(Forme_Home);
        Forme_Home.setLayout(Forme_HomeLayout);
        Forme_HomeLayout.setHorizontalGroup(
            Forme_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbllogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Forme_HomeLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panelUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63)
                .addComponent(panelEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(70, 70, 70)
                .addComponent(panelAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
        Forme_HomeLayout.setVerticalGroup(
            Forme_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Forme_HomeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(Forme_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
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

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
}
