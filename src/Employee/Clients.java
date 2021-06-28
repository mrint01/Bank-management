package Employee;

import Entity.Account;
import Entity.Customer;
import java.awt.BorderLayout;
import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author MR-INT
 */
public class Clients extends javax.swing.JFrame {

    MyConnection me = new MyConnection();

    private final Image img_addaccount = new ImageIcon(Login.class.getResource("img/add.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private final Image img_delete = new ImageIcon(Login.class.getResource("img/delete.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private final Image img_update = new ImageIcon(Login.class.getResource("img/update.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private final Image img_find = new ImageIcon(Login.class.getResource("img/find.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);

    public Clients() {
        initComponents();
        BtnAjoutCustomer.setIcon(new ImageIcon(img_addaccount));
        BtnUpdatecust.setIcon(new ImageIcon(img_update));
        BtnDeletecust.setIcon(new ImageIcon(img_delete));
        Btnrecherche.setIcon(new ImageIcon(img_find));
        BtnRefresh.setIcon(new ImageIcon(img_update));
        Show_customer_in_table();
    }

    //add list Customers to table    
    public void Show_customer_in_table() {
        MyConnection m = new MyConnection();
        ArrayList<Customer> list = m.getCustomerList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getCust_id();
            row[1] = list.get(i).getFirst_name();
            row[2] = list.get(i).getLast_name();
            row[3] = list.get(i).getStreet();
            row[4] = list.get(i).getCity();
            row[5] = list.get(i).getPhone();

            model.addRow(row);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        client_form = new javax.swing.JPanel();
        BtnAjoutCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblcustid = new javax.swing.JLabel();
        lblcustid1 = new javax.swing.JLabel();
        lblcustid2 = new javax.swing.JLabel();
        lblcustid3 = new javax.swing.JLabel();
        lblcustid4 = new javax.swing.JLabel();
        lblcustid5 = new javax.swing.JLabel();
        txtcustid = new javax.swing.JTextField();
        txtfncust = new javax.swing.JTextField();
        txtlncust = new javax.swing.JTextField();
        txtstreetcust = new javax.swing.JTextField();
        txtphonecust = new javax.swing.JTextField();
        txtcitycust = new javax.swing.JTextField();
        BtnUpdatecust = new javax.swing.JButton();
        BtnDeletecust = new javax.swing.JButton();
        txtrecherchename = new javax.swing.JTextField();
        Btnrecherche = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblbanks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        client_form.setBackground(new java.awt.Color(38, 67, 72));
        client_form.setPreferredSize(new java.awt.Dimension(866, 747));

        BtnAjoutCustomer.setBackground(new java.awt.Color(51, 51, 51));
        BtnAjoutCustomer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnAjoutCustomer.setForeground(new java.awt.Color(255, 255, 255));
        BtnAjoutCustomer.setText("Add");
        BtnAjoutCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAjoutCustomerMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "First Name", "Last Name", "Street", "City", "Phone"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblcustid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblcustid.setForeground(new java.awt.Color(255, 255, 255));
        lblcustid.setText("Customer ID :");

        lblcustid1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblcustid1.setForeground(new java.awt.Color(255, 255, 255));
        lblcustid1.setText("First Name :");

        lblcustid2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblcustid2.setForeground(new java.awt.Color(255, 255, 255));
        lblcustid2.setText("Last Name :");

        lblcustid3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblcustid3.setForeground(new java.awt.Color(255, 255, 255));
        lblcustid3.setText("Street :");

        lblcustid4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblcustid4.setForeground(new java.awt.Color(255, 255, 255));
        lblcustid4.setText("City :");

        lblcustid5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblcustid5.setForeground(new java.awt.Color(255, 255, 255));
        lblcustid5.setText("Phone :");

        BtnUpdatecust.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.caretForeground"));
        BtnUpdatecust.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnUpdatecust.setForeground(new java.awt.Color(255, 255, 255));
        BtnUpdatecust.setText("Update");
        BtnUpdatecust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnUpdatecustMouseClicked(evt);
            }
        });

        BtnDeletecust.setBackground(new java.awt.Color(102, 0, 0));
        BtnDeletecust.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnDeletecust.setForeground(new java.awt.Color(255, 255, 255));
        BtnDeletecust.setText("Delete");
        BtnDeletecust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDeletecustMouseClicked(evt);
            }
        });

        Btnrecherche.setBackground(new java.awt.Color(51, 51, 51));
        Btnrecherche.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Btnrecherche.setForeground(new java.awt.Color(255, 255, 255));
        Btnrecherche.setText("Find");
        Btnrecherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnrechercheMouseClicked(evt);
            }
        });

        BtnRefresh.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionBackground"));
        BtnRefresh.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRefreshMouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account ID", "Customer ID", "Account Type", "Balance"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        lblbanks.setFont(new java.awt.Font("DotumChe", 1, 14)); // NOI18N
        lblbanks.setForeground(new java.awt.Color(204, 204, 204));
        lblbanks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbanks.setText("Bank Accounts List");

        javax.swing.GroupLayout client_formLayout = new javax.swing.GroupLayout(client_form);
        client_form.setLayout(client_formLayout);
        client_formLayout.setHorizontalGroup(
            client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(client_formLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(client_formLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(client_formLayout.createSequentialGroup()
                                .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcustid1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcustid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcustid2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtlncust, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcustid, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfncust, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(client_formLayout.createSequentialGroup()
                                .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcustid3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcustid4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcustid5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtphonecust, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtstreetcust, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcitycust, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(client_formLayout.createSequentialGroup()
                        .addComponent(BtnUpdatecust, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnAjoutCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnDeletecust, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblbanks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(client_formLayout.createSequentialGroup()
                        .addComponent(txtrecherchename, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btnrecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        client_formLayout.setVerticalGroup(
            client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(client_formLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(client_formLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcustid)
                            .addComponent(txtcustid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcustid1)
                            .addComponent(txtfncust, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcustid2)
                            .addComponent(txtlncust, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcustid3)
                            .addComponent(txtstreetcust, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcustid4)
                            .addComponent(txtcitycust, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcustid5)
                            .addComponent(txtphonecust, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnUpdatecust, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnDeletecust, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAjoutCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(client_formLayout.createSequentialGroup()
                        .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(client_formLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(client_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Btnrecherche)
                                    .addComponent(txtrecherchename, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BtnRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblbanks, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(client_form, javax.swing.GroupLayout.DEFAULT_SIZE, 1179, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(client_form, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        tableModel.setRowCount(0);
        jTable2.setModel(tableModel);
        lblbanks.setText("Bank Accounts List");

        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        txtcustid.setText(model.getValueAt(i, 0).toString());
        txtfncust.setText(model.getValueAt(i, 1).toString());
        txtlncust.setText(model.getValueAt(i, 2).toString());
        txtstreetcust.setText(model.getValueAt(i, 3).toString());
        txtcitycust.setText(model.getValueAt(i, 4).toString());
        txtphonecust.setText(model.getValueAt(i, 5).toString());

        //add list account to table
        String id = txtcustid.getText();
        MyConnection m = new MyConnection();
        ArrayList<Account> list = m.getAccountList();
        DefaultTableModel mod = (DefaultTableModel) jTable2.getModel();

        Object[] row = new Object[4];
        for (int j = 0; j < list.size(); j++) {
            if(list.get(j).getCust_id().equals(id)) {
                
                row[0] = list.get(j).getAcc_id();
                row[1] = list.get(j).getCust_id();
                row[2] = list.get(j).getAcc_type();
                row[3] = list.get(j).getBalance();
                mod.addRow(row);
                lblbanks.setText("Bank Accounts List Of " + txtfncust.getText() + " " + txtlncust.getText());

            }
            
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void BtnDeletecustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDeletecustMouseClicked
        me.DeleteCustomer(txtcustid, txtfncust, txtlncust, txtstreetcust, txtcitycust, txtphonecust);
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        jTable1.setModel(tableModel);
        Show_customer_in_table();
        
    }//GEN-LAST:event_BtnDeletecustMouseClicked

    private void BtnUpdatecustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUpdatecustMouseClicked
        me.UpdateCustomer(txtcustid, txtfncust, txtlncust, txtstreetcust, txtcitycust, txtphonecust);
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        jTable1.setModel(tableModel);
        Show_customer_in_table();
    }//GEN-LAST:event_BtnUpdatecustMouseClicked

    private void BtnAjoutCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAjoutCustomerMouseClicked
        try {
            me.AjoutCustomer(txtcustid, txtfncust, txtlncust, txtstreetcust, txtcitycust, txtphonecust);
        } catch (SQLException ex) {
            Logger.getLogger(Clients.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        jTable1.setModel(tableModel);
        Show_customer_in_table();
    }//GEN-LAST:event_BtnAjoutCustomerMouseClicked

    private void BtnrechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnrechercheMouseClicked
        String text = txtrecherchename.getText();
        DefaultTableModel dx = (DefaultTableModel) jTable1.getModel();

        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTable1.getModel());

        jTable1.setRowSorter(rowSorter);
        rowSorter.setRowFilter(RowFilter.regexFilter(text));
    }//GEN-LAST:event_BtnrechercheMouseClicked

    private void BtnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRefreshMouseClicked
        DefaultTableModel dx = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTable1.getModel());
        jTable1.setRowSorter(rowSorter);

        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        tableModel.setRowCount(0);
        jTable2.setModel(tableModel);
        txtcustid.setText("");
        txtfncust.setText("");
        txtlncust.setText("");
        txtstreetcust.setText("");
        txtcitycust.setText("");
        txtphonecust.setText("");
        lblbanks.setText("Bank Accounts List");
        

    }//GEN-LAST:event_BtnRefreshMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnAjoutCustomer;
    public javax.swing.JButton BtnDeletecust;
    public javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnUpdatecust;
    public javax.swing.JButton Btnrecherche;
    public javax.swing.JPanel client_form;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public javax.swing.JLabel lblbanks;
    public javax.swing.JLabel lblcustid;
    public javax.swing.JLabel lblcustid1;
    public javax.swing.JLabel lblcustid2;
    public javax.swing.JLabel lblcustid3;
    public javax.swing.JLabel lblcustid4;
    public javax.swing.JLabel lblcustid5;
    public javax.swing.JTextField txtcitycust;
    public javax.swing.JTextField txtcustid;
    public javax.swing.JTextField txtfncust;
    public javax.swing.JTextField txtlncust;
    public javax.swing.JTextField txtphonecust;
    public javax.swing.JTextField txtrecherchename;
    public javax.swing.JTextField txtstreetcust;
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
            public void run() {

                new Clients().setVisible(true);
            }
        });
    }
}
