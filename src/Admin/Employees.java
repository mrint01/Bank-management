package Admin;

import Entity.Customer;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Entity.*;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import Employee.Login;
import java.awt.BorderLayout;

/**
 *
 * @author MR-INT
 */
public class Employees extends javax.swing.JFrame {

    MyConnection_Admin me = new MyConnection_Admin();
    ConsultEmployee ConsultEmployee = new ConsultEmployee();
    private final Image img_addaccount = new ImageIcon(Login.class.getResource("img/add.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private final Image img_delete = new ImageIcon(Login.class.getResource("img/delete.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private final Image img_update = new ImageIcon(Login.class.getResource("img/update.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private final Image img_find = new ImageIcon(Login.class.getResource("img/find.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);

    public Employees() {
        initComponents();
        BtnAjoutCustomer.setIcon(new ImageIcon(img_addaccount));
        BtnUpdatecust.setIcon(new ImageIcon(img_update));
        BtnDeletecust.setIcon(new ImageIcon(img_delete));
        Btnrecherche.setIcon(new ImageIcon(img_find));
        BtnRefresh.setIcon(new ImageIcon(img_update));
        Btnfind3.setIcon(new ImageIcon(img_find));
        Show_employee_in_table();
    }

    //add list to table    
    public void Show_employee_in_table() {
        MyConnection_Admin m = new MyConnection_Admin();
        ArrayList<Employee> list = m.getEmployeeList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getEmp_id();
            row[1] = list.get(i).getUsername();
            row[2] = list.get(i).getFirst_name();
            row[3] = list.get(i).getLast_name();
            row[4] = list.get(i).getStreet();
            row[5] = list.get(i).getCity();
            row[6] = list.get(i).getPhone();

            model.addRow(row);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employee_form = new javax.swing.JPanel();
        BtnAjoutCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblcustid = new javax.swing.JLabel();
        lblfnemployee = new javax.swing.JLabel();
        lbllnemployee = new javax.swing.JLabel();
        lblstreetemployee = new javax.swing.JLabel();
        lblemployeecity = new javax.swing.JLabel();
        lblemployeephone = new javax.swing.JLabel();
        txtempid = new javax.swing.JTextField();
        txtfnemp = new javax.swing.JTextField();
        txtlnemp = new javax.swing.JTextField();
        txtstreetemp = new javax.swing.JTextField();
        txtphoneemp = new javax.swing.JTextField();
        txtcityemp = new javax.swing.JTextField();
        BtnUpdatecust = new javax.swing.JButton();
        BtnDeletecust = new javax.swing.JButton();
        txtrecherchename = new javax.swing.JTextField();
        Btnrecherche = new javax.swing.JButton();
        BtnRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblbanks = new javax.swing.JLabel();
        Btnfind3 = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        lblfnemployee1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        employee_form.setBackground(new java.awt.Color(38, 67, 72));
        employee_form.setPreferredSize(new java.awt.Dimension(866, 747));

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
                "Employee ID", "Username", "First Name", "Last Name", "Street", "City", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblcustid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblcustid.setForeground(new java.awt.Color(255, 255, 255));
        lblcustid.setText("Employee ID :");

        lblfnemployee.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblfnemployee.setForeground(new java.awt.Color(255, 255, 255));
        lblfnemployee.setText("First Name :");

        lbllnemployee.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbllnemployee.setForeground(new java.awt.Color(255, 255, 255));
        lbllnemployee.setText("Last Name :");

        lblstreetemployee.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblstreetemployee.setForeground(new java.awt.Color(255, 255, 255));
        lblstreetemployee.setText("Street :");

        lblemployeecity.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblemployeecity.setForeground(new java.awt.Color(255, 255, 255));
        lblemployeecity.setText("City :");

        lblemployeephone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblemployeephone.setForeground(new java.awt.Color(255, 255, 255));
        lblemployeephone.setText("Phone :");

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
                "Employee ID", "Operation Type", "From Account ID", "To Account ID", "Balance", "Operation Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        lblbanks.setFont(new java.awt.Font("DotumChe", 1, 14)); // NOI18N
        lblbanks.setForeground(new java.awt.Color(204, 204, 204));
        lblbanks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbanks.setText("Operation List");

        Btnfind3.setBackground(new java.awt.Color(51, 51, 51));
        Btnfind3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Btnfind3.setForeground(new java.awt.Color(204, 204, 204));
        Btnfind3.setText("Find Customer");
        Btnfind3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btnfind3MouseClicked(evt);
            }
        });

        lblfnemployee1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblfnemployee1.setForeground(new java.awt.Color(255, 255, 255));
        lblfnemployee1.setText("Username :");

        javax.swing.GroupLayout employee_formLayout = new javax.swing.GroupLayout(employee_form);
        employee_form.setLayout(employee_formLayout);
        employee_formLayout.setHorizontalGroup(
            employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employee_formLayout.createSequentialGroup()
                .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(employee_formLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Btnfind3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(employee_formLayout.createSequentialGroup()
                        .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(employee_formLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(BtnUpdatecust, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnAjoutCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnDeletecust, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(employee_formLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(employee_formLayout.createSequentialGroup()
                                        .addComponent(lblfnemployee1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(employee_formLayout.createSequentialGroup()
                                            .addComponent(lblcustid, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtempid, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(employee_formLayout.createSequentialGroup()
                                            .addComponent(lblfnemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtfnemp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(employee_formLayout.createSequentialGroup()
                                            .addComponent(lbllnemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtlnemp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(employee_formLayout.createSequentialGroup()
                                            .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblstreetemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblemployeecity, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblemployeephone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtstreetemp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtcityemp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtphoneemp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(60, 60, 60)
                        .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employee_formLayout.createSequentialGroup()
                                .addComponent(txtrecherchename, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btnrecherche, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblbanks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
        );
        employee_formLayout.setVerticalGroup(
            employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employee_formLayout.createSequentialGroup()
                .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(employee_formLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(BtnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employee_formLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrecherchename, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btnrecherche))))
                .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(employee_formLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(lblbanks, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnAjoutCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnDeletecust, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnUpdatecust, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(employee_formLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcustid)
                            .addComponent(txtempid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfnemployee1)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblfnemployee)
                            .addComponent(txtfnemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbllnemployee)
                            .addComponent(txtlnemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstreetemployee)
                            .addComponent(txtstreetemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcityemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblemployeecity))
                        .addGap(22, 22, 22)
                        .addGroup(employee_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblemployeephone)
                            .addComponent(txtphoneemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btnfind3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(employee_form, javax.swing.GroupLayout.DEFAULT_SIZE, 1309, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(employee_form, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAjoutCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAjoutCustomerMouseClicked

        try {
            me.AjoutEmpoyee(txtempid, txtusername,txtfnemp, txtlnemp, txtstreetemp, txtcityemp, txtphoneemp);
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        jTable1.setModel(tableModel);
        Show_employee_in_table();
    }//GEN-LAST:event_BtnAjoutCustomerMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        tableModel.setRowCount(0);
        jTable2.setModel(tableModel);
        lblbanks.setText("Operation List");

        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        txtempid.setText(model.getValueAt(i, 0).toString());
        txtusername.setText(model.getValueAt(i, 1).toString());
        txtfnemp.setText(model.getValueAt(i, 2).toString());
        txtlnemp.setText(model.getValueAt(i, 3).toString());
        txtstreetemp.setText(model.getValueAt(i, 4).toString());
        txtcityemp.setText(model.getValueAt(i, 5).toString());
        txtphoneemp.setText(model.getValueAt(i, 6).toString());

        //add list operation to table
        String id = txtempid.getText();
        MyConnection_Admin m = new MyConnection_Admin();
        ArrayList<Operation> list = m.getOperationList();
        DefaultTableModel mod = (DefaultTableModel) jTable2.getModel();

        Object[] row = new Object[6];
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).getId_emp().equals(id)) {

                row[0] = list.get(j).getId_emp();
                row[1] = list.get(j).getOper_type();
                row[2] = list.get(j).getId_acc1();
                row[3] = list.get(j).getId_acc2();
                row[4] = list.get(j).getBalance();
                row[5] = list.get(j).getOper_date();
                mod.addRow(row);
                lblbanks.setText("Operation List Of  " + txtfnemp.getText() + " " + txtlnemp.getText());

            }

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void BtnUpdatecustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUpdatecustMouseClicked
        me.UpdateEmployee(txtempid, txtusername,txtfnemp, txtlnemp, txtstreetemp, txtcityemp, txtphoneemp);
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        jTable1.setModel(tableModel);
        Show_employee_in_table();
    }//GEN-LAST:event_BtnUpdatecustMouseClicked

    private void BtnDeletecustMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDeletecustMouseClicked
        me.DeleteEmployee(txtempid, txtusername,txtfnemp, txtlnemp, txtstreetemp, txtcityemp, txtphoneemp);
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        jTable1.setModel(tableModel);
        Show_employee_in_table();
    }//GEN-LAST:event_BtnDeletecustMouseClicked

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
        lblbanks.setText("Operation List");
    }//GEN-LAST:event_BtnRefreshMouseClicked

    private void Btnfind3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnfind3MouseClicked
        if (employee_form.isShowing()) {

            employee_form.removeAll();
        }
        employee_form.removeAll();
        employee_form.repaint();
        employee_form.setLayout(new BorderLayout());
        employee_form.revalidate();

        employee_form.add(ConsultEmployee.emp_form, BorderLayout.CENTER);
    }//GEN-LAST:event_Btnfind3MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnAjoutCustomer;
    public javax.swing.JButton BtnDeletecust;
    public javax.swing.JButton BtnRefresh;
    private javax.swing.JButton BtnUpdatecust;
    public javax.swing.JButton Btnfind3;
    public javax.swing.JButton Btnrecherche;
    public javax.swing.JPanel employee_form;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    public javax.swing.JLabel lblbanks;
    public javax.swing.JLabel lblcustid;
    public javax.swing.JLabel lblemployeecity;
    public javax.swing.JLabel lblemployeephone;
    public javax.swing.JLabel lblfnemployee;
    public javax.swing.JLabel lblfnemployee1;
    public javax.swing.JLabel lbllnemployee;
    public javax.swing.JLabel lblstreetemployee;
    public javax.swing.JTextField txtcityemp;
    public javax.swing.JTextField txtempid;
    public javax.swing.JTextField txtfnemp;
    public javax.swing.JTextField txtlnemp;
    public javax.swing.JTextField txtphoneemp;
    public javax.swing.JTextField txtrecherchename;
    public javax.swing.JTextField txtstreetemp;
    public javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
