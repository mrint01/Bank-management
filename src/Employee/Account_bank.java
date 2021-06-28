package Employee;

import Entity.Account;
import java.awt.BorderLayout;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static Employee.MyConnection.getConnection;
import Entity.Operation;
import java.text.ParseException;
import java.time.chrono.JapaneseDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Account_bank extends javax.swing.JFrame {

    Ajout_Account ajout = new Ajout_Account();
    MyConnection me = new MyConnection();
    private final Image img_addaccount = new ImageIcon(Login.class.getResource("img/add.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private final Image img_delete = new ImageIcon(Login.class.getResource("img/delete.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private final Image img_update = new ImageIcon(Login.class.getResource("img/update.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private final Image img_find = new ImageIcon(Login.class.getResource("img/find.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private final Image img_confirm = new ImageIcon(Login.class.getResource("img/confirm.png")).getImage().getScaledInstance(30, 20, Image.SCALE_SMOOTH);

    public Account_bank() {
        initComponents();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.fireTableDataChanged();
        Show_account_in_table();
        BtnAjoutAccount.setIcon(new ImageIcon(img_addaccount));
        BtnUpdate.setIcon(new ImageIcon(img_update));
        BtnDelete.setIcon(new ImageIcon(img_delete));
        BtnRefresh.setIcon(new ImageIcon(img_update));
        Btnrecherche.setIcon(new ImageIcon(img_find));
        BtnFind2.setIcon(new ImageIcon(img_confirm));
        txtAccountbalance.disable();

    }

    //add list to table    
    public void Show_account_in_table() {

        MyConnection m = new MyConnection();
        ArrayList<Account> list = m.getAccountList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.fireTableDataChanged();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getAcc_id();
            row[1] = list.get(i).getCust_id();
            row[2] = list.get(i).getAcc_type();
            row[3] = list.get(i).getBalance();

            model.addRow(row);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Forme_Account = new javax.swing.JPanel();
        BtnAjoutAccount = new javax.swing.JButton();
        lblCustID = new javax.swing.JLabel();
        lblAccountID1 = new javax.swing.JLabel();
        lblAccountType = new javax.swing.JLabel();
        lblbalance = new javax.swing.JLabel();
        txtAccountId = new javax.swing.JTextField();
        txtCustId = new javax.swing.JTextField();
        txtAccounttype = new javax.swing.JTextField();
        txtAccountbalance = new javax.swing.JTextField();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnRefresh = new javax.swing.JButton();
        txtrecherchename = new javax.swing.JTextField();
        Btnrecherche = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblList = new javax.swing.JLabel();
        Date1 = new com.toedter.calendar.JDateChooser();
        Date2 = new com.toedter.calendar.JDateChooser();
        BtnFind2 = new javax.swing.JButton();
        lblbalance1 = new javax.swing.JLabel();
        lblbalance2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Forme_Account.setBackground(new java.awt.Color(38, 67, 72));

        BtnAjoutAccount.setBackground(new java.awt.Color(51, 51, 51));
        BtnAjoutAccount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnAjoutAccount.setForeground(new java.awt.Color(255, 255, 255));
        BtnAjoutAccount.setText("Add");
        BtnAjoutAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAjoutAccountMouseClicked(evt);
            }
        });

        lblCustID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCustID.setForeground(new java.awt.Color(255, 255, 255));
        lblCustID.setText("Customer ID :");

        lblAccountID1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAccountID1.setForeground(new java.awt.Color(255, 255, 255));
        lblAccountID1.setText("Account ID :");

        lblAccountType.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAccountType.setForeground(new java.awt.Color(255, 255, 255));
        lblAccountType.setText("Account Type :");

        lblbalance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblbalance.setForeground(new java.awt.Color(255, 255, 255));
        lblbalance.setText("Balance :");

        BtnUpdate.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.caretForeground"));
        BtnUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnDelete.setBackground(new java.awt.Color(102, 0, 0));
        BtnDelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        BtnDelete.setText("Delete");
        BtnDelete.setToolTipText("");
        BtnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDeleteMouseClicked(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account ID", "Customer ID", "Account Type", "Balance"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BtnRefresh.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionBackground"));
        BtnRefresh.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        BtnRefresh.setToolTipText("");
        BtnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRefreshMouseClicked(evt);
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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From Account ID", "To Account ID", "Operation Type", "Balance", "Operation Date"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        lblList.setFont(new java.awt.Font("DotumChe", 1, 14)); // NOI18N
        lblList.setForeground(new java.awt.Color(204, 204, 204));
        lblList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblList.setText("Operation List");

        Date1.setDateFormatString("yyyy/MM/dd");

        Date2.setDateFormatString("yyyy/MM/dd");

        BtnFind2.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleBackground"));
        BtnFind2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnFind2.setForeground(new java.awt.Color(204, 204, 204));
        BtnFind2.setText("Confirm");
        BtnFind2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnFind2MouseClicked(evt);
            }
        });
        BtnFind2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFind2ActionPerformed(evt);
            }
        });

        lblbalance1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblbalance1.setForeground(new java.awt.Color(255, 255, 255));
        lblbalance1.setText("From :");

        lblbalance2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblbalance2.setForeground(new java.awt.Color(255, 255, 255));
        lblbalance2.setText("To :");

        javax.swing.GroupLayout Forme_AccountLayout = new javax.swing.GroupLayout(Forme_Account);
        Forme_Account.setLayout(Forme_AccountLayout);
        Forme_AccountLayout.setHorizontalGroup(
            Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Forme_AccountLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Forme_AccountLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Forme_AccountLayout.createSequentialGroup()
                                .addComponent(lblAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAccounttype))
                            .addGroup(Forme_AccountLayout.createSequentialGroup()
                                .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAccountID1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAccountId)
                                    .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Forme_AccountLayout.createSequentialGroup()
                                .addComponent(lblbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAccountbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(Forme_AccountLayout.createSequentialGroup()
                        .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnAjoutAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Forme_AccountLayout.createSequentialGroup()
                        .addComponent(lblbalance1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(lblbalance2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BtnFind2))
                    .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(Forme_AccountLayout.createSequentialGroup()
                            .addComponent(txtrecherchename, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Btnrecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane2)
                        .addComponent(lblList, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        Forme_AccountLayout.setVerticalGroup(
            Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Forme_AccountLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Forme_AccountLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAccountbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Forme_AccountLayout.createSequentialGroup()
                                .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Forme_AccountLayout.createSequentialGroup()
                                        .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblAccountID1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAccountId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtAccounttype, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(91, 91, 91)
                        .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnAjoutAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Forme_AccountLayout.createSequentialGroup()
                        .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtrecherchename, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btnrecherche))
                            .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Forme_AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnFind2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblbalance1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblbalance2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblList, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Forme_Account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Forme_Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAjoutAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAjoutAccountMouseClicked

        if (Forme_Account.isShowing()) {

            Forme_Account.removeAll();
        }
        Forme_Account.removeAll();
        Forme_Account.repaint();
        Forme_Account.setLayout(new BorderLayout());
        Forme_Account.revalidate();

        Forme_Account.add(ajout.Forme_Ajout_Account, BorderLayout.CENTER);
    }//GEN-LAST:event_BtnAjoutAccountMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        tableModel.setRowCount(0);
        jTable2.setModel(tableModel);
        lblList.setText("Operation List");

        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        txtAccountId.setText(model.getValueAt(i, 0).toString());
        txtCustId.setText(model.getValueAt(i, 1).toString());
        txtAccounttype.setText(model.getValueAt(i, 2).toString());
        txtAccountbalance.setText(model.getValueAt(i, 3).toString());

        //add list account to table
        String id = txtAccountId.getText();
        MyConnection m = new MyConnection();
        ArrayList<Operation> list = m.getOperationList();
        DefaultTableModel mod = (DefaultTableModel) jTable2.getModel();

        Object[] row = new Object[5];
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).getId_acc1().equals(id) || list.get(j).getId_acc2().equals(id)) {

                row[0] = list.get(j).getId_acc1();
                row[1] = list.get(j).getId_acc2();
                row[2] = list.get(j).getOper_type();
                row[3] = list.get(j).getBalance();
                row[4] = list.get(j).getOper_date();
                mod.addRow(row);
                lblList.setText("Operation List Of Account ID : " + txtAccountId.getText());

            }

        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void BtnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDeleteMouseClicked
        me.DeleteAccount(txtAccountId, txtCustId, txtAccounttype, txtAccountbalance);
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        jTable1.setModel(tableModel);
        Show_account_in_table();
    }//GEN-LAST:event_BtnDeleteMouseClicked

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        me.UpdateAccount(txtAccountId, txtCustId, txtAccounttype, txtAccountbalance);
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        jTable1.setModel(tableModel);
        Show_account_in_table();
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRefreshMouseClicked

        DefaultTableModel dx = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTable1.getModel());
        jTable1.setRowSorter(rowSorter);
        jTable1.setModel(dx);
        dx.setRowCount(0);
        txtAccountId.setText("");
        txtCustId.setText("");
        txtAccounttype.setText("");
        txtAccountbalance.setText("");

        Show_account_in_table();
        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        tableModel.setRowCount(0);
        jTable2.setModel(tableModel);

        lblList.setText("Operation List");
        

    }//GEN-LAST:event_BtnRefreshMouseClicked

    private void BtnrechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnrechercheMouseClicked
        String text = txtrecherchename.getText();
        DefaultTableModel dx = (DefaultTableModel) jTable1.getModel();

        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTable1.getModel());

        jTable1.setRowSorter(rowSorter);
        rowSorter.setRowFilter(RowFilter.regexFilter(text));
    }//GEN-LAST:event_BtnrechercheMouseClicked

    private void BtnFind2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFind2MouseClicked

        ArrayList<Operation> op = me.ShowOperationDateWithDate(Date1, Date2, txtAccountId);
        /* for(int i=0;i<op.size();i++){
                System.out.println(op.get(i).getId_emp());
            }*/
        //add list account to table
        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        tableModel.setRowCount(0);
        jTable2.setModel(tableModel);
        String id = txtAccountId.getText();
        ArrayList<Operation> list = op;
        DefaultTableModel mod = (DefaultTableModel) jTable2.getModel();
        Object[] row = new Object[5];
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).getId_acc1().equals(id) || list.get(j).getId_acc2().equals(id)) {

                row[0] = list.get(j).getId_acc1();
                row[1] = list.get(j).getId_acc2();
                row[2] = list.get(j).getOper_type();
                row[3] = list.get(j).getBalance();
                row[4] = list.get(j).getOper_date();
                mod.addRow(row);
                lblList.setText("Operation List Of Account ID : " + txtAccountId.getText());

            }

        }

    }//GEN-LAST:event_BtnFind2MouseClicked

    private void BtnFind2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFind2ActionPerformed

    }//GEN-LAST:event_BtnFind2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnAjoutAccount;
    public javax.swing.JButton BtnDelete;
    public javax.swing.JButton BtnFind2;
    public javax.swing.JButton BtnRefresh;
    public javax.swing.JButton BtnUpdate;
    public javax.swing.JButton Btnrecherche;
    public com.toedter.calendar.JDateChooser Date1;
    public com.toedter.calendar.JDateChooser Date2;
    public javax.swing.JPanel Forme_Account;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    public javax.swing.JLabel lblAccountID1;
    public javax.swing.JLabel lblAccountType;
    public javax.swing.JLabel lblCustID;
    public javax.swing.JLabel lblList;
    public javax.swing.JLabel lblbalance;
    public javax.swing.JLabel lblbalance1;
    public javax.swing.JLabel lblbalance2;
    public javax.swing.JTextField txtAccountId;
    public javax.swing.JTextField txtAccountbalance;
    public javax.swing.JTextField txtAccounttype;
    public javax.swing.JTextField txtCustId;
    public javax.swing.JTextField txtrecherchename;
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

                new Account_bank().setVisible(true);
            }
        });
    }

}
