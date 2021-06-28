package Employee;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Ajout_Account extends javax.swing.JFrame {
    private final Image img_back = new ImageIcon(Login.class.getResource("img/back.png")).getImage().getScaledInstance(40, 20, Image.SCALE_SMOOTH);
    private final Image img_confirm = new ImageIcon(Login.class.getResource("img/confirm.png")).getImage().getScaledInstance(50, 30, Image.SCALE_SMOOTH);
    private final Image img_find = new ImageIcon(Login.class.getResource("img/find.png")).getImage().getScaledInstance(50, 30, Image.SCALE_SMOOTH);
    MyConnection con = new MyConnection();
    
    private static final long serialVersionUID = 1L;
   

    
    public Ajout_Account() {
        initComponents();
        con.Auto_Account(lblAccount_Number_Put);
        txtCust_Number.requestFocus();
        BtnRetour_Ajout_Account.setIcon(new ImageIcon(img_back));
        BtnFind_Cust.setIcon(new ImageIcon(img_find));
        BtnAjout_Account_fin.setIcon(new ImageIcon(img_confirm));
        
        
        
    }
   
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Forme_Ajout_Account = new javax.swing.JPanel();
        Forme_ajoutaccount = new javax.swing.JPanel();
        lblAccount_Number = new javax.swing.JLabel();
        lblCust_Id = new javax.swing.JLabel();
        lblAccount_Type = new javax.swing.JLabel();
        lblAccount_Balance = new javax.swing.JLabel();
        txtCust_Number = new javax.swing.JTextField();
        txtAccount_Balance = new javax.swing.JTextField();
        ComboxAccount_Type = new javax.swing.JComboBox<>();
        BtnAjout_Account_fin = new javax.swing.JButton();
        BtnRetour_Ajout_Account = new javax.swing.JButton();
        lblAccount_Number_Put = new javax.swing.JLabel();
        BtnFind_Cust = new javax.swing.JButton();
        lblCust_Name = new javax.swing.JLabel();
        txtCust_Name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Forme_Ajout_Account.setBackground(new java.awt.Color(38, 67, 72));

        Forme_ajoutaccount.setBackground(new java.awt.Color(38, 67, 72));
        Forme_ajoutaccount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        Forme_ajoutaccount.setForeground(new java.awt.Color(255, 255, 255));

        lblAccount_Number.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAccount_Number.setForeground(new java.awt.Color(255, 255, 255));
        lblAccount_Number.setText("Account No :");

        lblCust_Id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCust_Id.setForeground(new java.awt.Color(255, 255, 255));
        lblCust_Id.setText("Customer ID :");

        lblAccount_Type.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAccount_Type.setForeground(new java.awt.Color(255, 255, 255));
        lblAccount_Type.setText("Account Type :");

        lblAccount_Balance.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAccount_Balance.setForeground(new java.awt.Color(255, 255, 255));
        lblAccount_Balance.setText("Balance :");

        txtCust_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCust_NumberActionPerformed(evt);
            }
        });

        txtAccount_Balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccount_BalanceActionPerformed(evt);
            }
        });

        ComboxAccount_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Saving", "Checking", "Personal" }));
        ComboxAccount_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboxAccount_TypeActionPerformed(evt);
            }
        });

        BtnAjout_Account_fin.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.caretForeground"));
        BtnAjout_Account_fin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnAjout_Account_fin.setForeground(new java.awt.Color(204, 204, 204));
        BtnAjout_Account_fin.setText("Confirm");
        BtnAjout_Account_fin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAjout_Account_finMouseClicked(evt);
            }
        });

        BtnRetour_Ajout_Account.setBackground(new java.awt.Color(51, 51, 51));
        BtnRetour_Ajout_Account.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnRetour_Ajout_Account.setForeground(new java.awt.Color(204, 204, 204));
        BtnRetour_Ajout_Account.setText("Back");
        BtnRetour_Ajout_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRetour_Ajout_AccountMouseClicked(evt);
            }
        });

        lblAccount_Number_Put.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAccount_Number_Put.setForeground(new java.awt.Color(102, 102, 102));
        lblAccount_Number_Put.setText("Account No");

        BtnFind_Cust.setBackground(new java.awt.Color(51, 51, 51));
        BtnFind_Cust.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnFind_Cust.setForeground(new java.awt.Color(255, 255, 255));
        BtnFind_Cust.setText("Find");
        BtnFind_Cust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnFind_CustMouseClicked(evt);
            }
        });
        BtnFind_Cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFind_CustActionPerformed(evt);
            }
        });

        lblCust_Name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCust_Name.setForeground(new java.awt.Color(255, 255, 255));
        lblCust_Name.setText("Customer Name :");

        javax.swing.GroupLayout Forme_ajoutaccountLayout = new javax.swing.GroupLayout(Forme_ajoutaccount);
        Forme_ajoutaccount.setLayout(Forme_ajoutaccountLayout);
        Forme_ajoutaccountLayout.setHorizontalGroup(
            Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Forme_ajoutaccountLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Forme_ajoutaccountLayout.createSequentialGroup()
                        .addComponent(lblCust_Name)
                        .addGap(74, 74, 74)
                        .addComponent(txtCust_Name))
                    .addGroup(Forme_ajoutaccountLayout.createSequentialGroup()
                        .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Forme_ajoutaccountLayout.createSequentialGroup()
                                .addComponent(lblAccount_Balance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Forme_ajoutaccountLayout.createSequentialGroup()
                                .addComponent(lblAccount_Type)
                                .addGap(95, 95, 95)))
                        .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAccount_Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboxAccount_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Forme_ajoutaccountLayout.createSequentialGroup()
                        .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Forme_ajoutaccountLayout.createSequentialGroup()
                                .addComponent(lblCust_Id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Forme_ajoutaccountLayout.createSequentialGroup()
                                .addComponent(lblAccount_Number)
                                .addGap(115, 115, 115)))
                        .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCust_Number)
                            .addComponent(lblAccount_Number_Put, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Forme_ajoutaccountLayout.createSequentialGroup()
                        .addComponent(BtnFind_Cust)
                        .addGap(335, 335, 335))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Forme_ajoutaccountLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnRetour_Ajout_Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnAjout_Account_fin, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addGap(128, 128, 128))))
        );
        Forme_ajoutaccountLayout.setVerticalGroup(
            Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Forme_ajoutaccountLayout.createSequentialGroup()
                .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Forme_ajoutaccountLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAccount_Number)
                            .addComponent(lblAccount_Number_Put, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCust_Id)
                            .addComponent(txtCust_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnFind_Cust, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Forme_ajoutaccountLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblCust_Name))
                            .addComponent(txtCust_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAccount_Type)
                            .addComponent(ComboxAccount_Type, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(Forme_ajoutaccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAccount_Balance, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAccount_Balance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Forme_ajoutaccountLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(BtnAjout_Account_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(BtnRetour_Ajout_Account, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Account");

        javax.swing.GroupLayout Forme_Ajout_AccountLayout = new javax.swing.GroupLayout(Forme_Ajout_Account);
        Forme_Ajout_Account.setLayout(Forme_Ajout_AccountLayout);
        Forme_Ajout_AccountLayout.setHorizontalGroup(
            Forme_Ajout_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1013, Short.MAX_VALUE)
            .addGroup(Forme_Ajout_AccountLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Forme_ajoutaccount, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        Forme_Ajout_AccountLayout.setVerticalGroup(
            Forme_Ajout_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Forme_Ajout_AccountLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Forme_ajoutaccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Forme_Ajout_Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Forme_Ajout_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAccount_BalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccount_BalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccount_BalanceActionPerformed

    private void ComboxAccount_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboxAccount_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboxAccount_TypeActionPerformed

    private void BtnRetour_Ajout_AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRetour_Ajout_AccountMouseClicked
         Account_bank account = new Account_bank();
        
        if(Forme_Ajout_Account.isShowing()){

            Forme_Ajout_Account.removeAll();
        }

        Forme_Ajout_Account.removeAll();
        Forme_Ajout_Account.repaint();
        Forme_Ajout_Account.setLayout(new BorderLayout());
        Forme_Ajout_Account.revalidate();
        

        Forme_Ajout_Account.add(account.Forme_Account, BorderLayout.CENTER);
    }//GEN-LAST:event_BtnRetour_Ajout_AccountMouseClicked
       
    
    private void BtnAjout_Account_finMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAjout_Account_finMouseClicked
        con.Ajout_Account(lblAccount_Number_Put,txtCust_Number,ComboxAccount_Type,txtAccount_Balance);
        
    }//GEN-LAST:event_BtnAjout_Account_finMouseClicked

    private void BtnFind_CustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFind_CustMouseClicked
       con.Find_cust(txtCust_Number,txtCust_Name);
    }//GEN-LAST:event_BtnFind_CustMouseClicked

    private void BtnFind_CustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFind_CustActionPerformed
        
    }//GEN-LAST:event_BtnFind_CustActionPerformed

    private void txtCust_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCust_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCust_NumberActionPerformed

   
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
            java.util.logging.Logger.getLogger(Ajout_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajout_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajout_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajout_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajout_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnAjout_Account_fin;
    public javax.swing.JButton BtnFind_Cust;
    public javax.swing.JButton BtnRetour_Ajout_Account;
    public javax.swing.JComboBox<String> ComboxAccount_Type;
    public javax.swing.JPanel Forme_Ajout_Account;
    public javax.swing.JPanel Forme_ajoutaccount;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lblAccount_Balance;
    public javax.swing.JLabel lblAccount_Number;
    public javax.swing.JLabel lblAccount_Number_Put;
    public javax.swing.JLabel lblAccount_Type;
    public javax.swing.JLabel lblCust_Id;
    public javax.swing.JLabel lblCust_Name;
    public javax.swing.JTextField txtAccount_Balance;
    public javax.swing.JTextField txtCust_Name;
    public javax.swing.JTextField txtCust_Number;
    // End of variables declaration//GEN-END:variables
}
