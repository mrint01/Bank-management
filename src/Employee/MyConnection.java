package Employee;

import static Employee.MyConnection.getConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Entity.*;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

public class MyConnection extends javax.swing.JFrame {

    public static ArrayList<User> username = new ArrayList<User>();

    private static final long serialVersionUID = 1L;

    // function to connect with mysql database
    public static Connection getConnection() {

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Bank", "root@127.0.0.1", "");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }

    // function to login to the dashboard using Mysql
    public boolean login(String user, String pass) {
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM `admin` WHERE `u_uname` =? AND `u_password` =?";

        try {
            ps = getConnection().prepareStatement(query);

            ps.setString(1, user);
            ps.setString(2, pass);

            rs = ps.executeQuery();
            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //func login employee 
    public boolean login_employee(String user, String pass) {
        PreparedStatement ps;
        ResultSet rs;

        String query = "SELECT emp_id,username FROM `employee` WHERE `username` =? AND `password` =?";

        try {
            ps = getConnection().prepareStatement(query);

            ps.setString(1, user);
            ps.setString(2, pass);

            rs = ps.executeQuery();
            if (rs.next() == true) {
                User usern;
                usern = new User(rs.getString("username"),rs.getString("emp_id"));
                username.add(usern);
            }

            return rs.last();

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //func auto id for account
    public void Auto_Account(JLabel lblAccount_Number_Put) {
        PreparedStatement ps;
        ResultSet rs;

        String query = "SELECT Max(acc_id) from account";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            rs.next();
            rs.getString("Max(acc_id)");
            if (rs.getString("Max(acc_id)") == null) {
                lblAccount_Number_Put.setText("acc001");
            } else {
                long id = Long.parseLong(rs.getString("Max(acc_id)").substring(3, rs.getString("Max(acc_id)").length()));
                id++;
                lblAccount_Number_Put.setText("acc" + String.format("%03d", id));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //func add account to database
    public void Ajout_Account(JLabel lblAccount_Number_Put, JTextField txtCust_Number, JComboBox<String> ComboxAccount_Type, JTextField txtAccount_Balance) {

        PreparedStatement ps;
        ResultSet rs;

        String acc_id = lblAccount_Number_Put.getText();
        String cust_id = txtCust_Number.getText();
        String acc_type = ComboxAccount_Type.getSelectedItem().toString();
        String acc_bal = txtAccount_Balance.getText();
        String query = "insert into account(acc_id,cust_id,acc_type,balance) values(?,?,?,?)";

        try {

            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, acc_id);
            ps.setString(2, cust_id);
            ps.setString(3, acc_type);
            ps.setString(4, acc_bal);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Account Added");

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtCust_Number.setText("");
        txtAccount_Balance.setText("");
        Auto_Account(lblAccount_Number_Put);
        txtCust_Number.requestFocus();

    }

    //Find Costomer
    void Find_cust(JTextField txtCust_Number, JTextField txtCust_Name) {
        try {
            PreparedStatement ps;
            ResultSet rs;
            String cust_id = txtCust_Number.getText();
            String query = "select first_name,last_name from customer where cust_id = ?";

            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, cust_id);
            rs = ps.executeQuery();

            if (rs.next() == true) {
                String firstn = rs.getString("first_name");
                String lastname = rs.getString("last_name");
                txtCust_Name.setText(firstn + " " + lastname);
            } else {
                PreparedStatement pse;
                ResultSet rse;
                String emp_id = txtCust_Number.getText();
                String querye = "select first_name,last_name from employee where emp_id = ?";

                pse = MyConnection.getConnection().prepareStatement(querye);
                pse.setString(1, emp_id);
                rse = pse.executeQuery();

                if (rse.next() == true) {
                    String firstn = rse.getString("first_name");
                    String lastname = rse.getString("last_name");
                    txtCust_Name.setText(firstn + " " + lastname);
                } else {
                    JOptionPane.showMessageDialog(this, "Not Found !");
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //add account to list
    public ArrayList<Account> getAccountList() {

        ArrayList<Account> accountList = new ArrayList<Account>();
        Connection connection = getConnection();

        String query = "select * from account";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Account acc;
            while (rs.next()) {
                acc = new Account(rs.getString("acc_id"), rs.getString("cust_id"), rs.getString("acc_type"), rs.getString("balance"));
                accountList.add(acc);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        return accountList;
    }

    //add Employee to list
    public ArrayList<Employee> getEmployeeList() {
        ArrayList<Employee> employeelist = new ArrayList<Employee>();
        Connection connection = getConnection();

        String query = "select * from employee";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);;
            Employee emp;
            while (rs.next()) {
                emp = new Employee(rs.getString("emp_id"), rs.getString("username"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("street"), rs.getString("city"), rs.getInt("phone"));
                employeelist.add(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        return employeelist;
    }

    //update account 
    public void UpdateAccount(JTextField txtAccountId, JTextField txtCustId, JTextField txtAccounttype, JTextField txtAccountbalance) {

        PreparedStatement ps;
        ResultSet rs;

        String acc_id = txtAccountId.getText();
        String cust_id = txtCustId.getText();
        String acc_type = txtAccounttype.getText();
        String acc_bal = txtAccountbalance.getText();
        String query = "update account set acc_id = ? ,cust_id = ? , acc_type = ? , balance = ? where acc_id = ?";

        try {

            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, acc_id);
            ps.setString(2, cust_id);
            ps.setString(3, acc_type);
            ps.setString(4, acc_bal);
            ps.setString(5, acc_id);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Account updated");

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
        txtAccountId.setText("");
        txtCustId.setText("");
        txtAccounttype.setText("");
        txtAccountbalance.setText("");

    }

    //delete account
    void DeleteAccount(JTextField txtAccountId, JTextField txtCustId, JTextField txtAccounttype, JTextField txtAccountbalance) {

        Account_bank accountone = new Account_bank();
        PreparedStatement ps;
        ResultSet rs;

        String acc_id = txtAccountId.getText();
        String query = "delete from account where acc_id = ?";

        try {

            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, acc_id);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Account Deleted");

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
        txtAccountId.setText("");
        txtCustId.setText("");
        txtAccounttype.setText("");
        txtAccountbalance.setText("");

    }

    //add customers to list
    public ArrayList<Customer> getCustomerList() {
        ArrayList<Customer> customerlist = new ArrayList<Customer>();
        Connection connection = getConnection();

        String query = "select * from customer";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Customer cust;
            while (rs.next()) {
                cust = new Customer(rs.getString("cust_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("street"), rs.getString("city"), rs.getString("phone"));
                customerlist.add(cust);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        return customerlist;
    }

    //change password
    void ChangePassword(JPasswordField txtpassword1, JPasswordField txtpassword2) {

        PreparedStatement ps;
        ResultSet rs;

        String pass = txtpassword1.getText();
        String query = "update employee set password = ? where username = '" + username.get(0).getUsername() + "'";

        try {

            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, pass);
            if (ps.executeUpdate() == 1) {

                JOptionPane.showMessageDialog(this, "Password Changed");
            } else {

                JOptionPane.showMessageDialog(this, "error System");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //add admin login to list
    public ArrayList<Admin> getAdminList() {
        ArrayList<Admin> adminlist = new ArrayList<Admin>();
        Connection connection = getConnection();

        String query = "select * from admin";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);;
            Admin ad;
            while (rs.next()) {
                ad = new Admin(rs.getString("u_uname"), rs.getString("u_password"));
                adminlist.add(ad);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return adminlist;
    }

    //func delete customer
    void DeleteCustomer(JTextField txtcustid, JTextField txtfncust, JTextField txtlncust, JTextField txtstreetcust, JTextField txtcitycust, JTextField txtphonecust) {

        PreparedStatement ps;
        ResultSet rs;

        String cust_id = txtcustid.getText();
        String query = "delete from customer where cust_id = ?";

        try {

            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, cust_id);
            ps.executeUpdate();
            if (ps.executeUpdate() == 0) {
                String qer = "delete from account where cust_id = ?";
                ps = MyConnection.getConnection().prepareStatement(qer);
                ps.setString(1, cust_id);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "Customer Deleted");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }

        txtcustid.setText("");
        txtfncust.setText("");
        txtlncust.setText("");
        txtstreetcust.setText("");
        txtcitycust.setText("");
        txtphonecust.setText("");
        getAccountList();

    }

    //func update customer
    void UpdateCustomer(JTextField txtcustid, JTextField txtfncust, JTextField txtlncust, JTextField txtstreetcust, JTextField txtcitycust, JTextField txtphonecust) {
        PreparedStatement ps;
        ResultSet rs;

        String cust_id = txtcustid.getText();
        String first_name = txtfncust.getText();
        String last_name = txtlncust.getText();
        String street = txtstreetcust.getText();
        String city = txtcitycust.getText();
        String phone = txtphonecust.getText();
        String query = "update customer set cust_id = ? ,first_name = ? , last_name = ? ,city= ? , street = ?, phone= ? where cust_id = ?";

        try {

            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, cust_id);
            ps.setString(2, first_name);
            ps.setString(3, last_name);
            ps.setString(4, street);
            ps.setString(5, city);
            ps.setString(6, phone);
            ps.setString(7, cust_id);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Customer updated");

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
        txtcustid.setText("");
        txtfncust.setText("");
        txtlncust.setText("");
        txtstreetcust.setText("");
        txtcitycust.setText("");
        txtphonecust.setText("");
    }

    //add customer to Database
    void AjoutCustomer(JTextField txtcustid, JTextField txtfncust, JTextField txtlncust, JTextField txtstreetcust, JTextField txtcitycust, JTextField txtphonecust) throws SQLException {
        PreparedStatement ps;
        ResultSet rs;

        String cust_id = txtcustid.getText();
        String first_name = txtfncust.getText();
        String last_name = txtlncust.getText();
        String street = txtstreetcust.getText();
        String city = txtcitycust.getText();
        String phone = txtphonecust.getText();
        String qer = "select * from customer where cust_id = ?";
        ps = MyConnection.getConnection().prepareStatement(qer);
        ps.setString(1, cust_id);
        try {

            rs = ps.executeQuery();
            if (rs.next()) {

                JOptionPane.showMessageDialog(this, "Customer already exist");
            } else {

                String query = "insert into customer(cust_id,first_name,last_name,street,city,phone)values(?,?,?,?,?,?)";

                ps = MyConnection.getConnection().prepareStatement(query);
                ps.setString(1, cust_id);
                ps.setString(2, first_name);
                ps.setString(3, last_name);
                ps.setString(4, street);
                ps.setString(5, city);
                ps.setString(6, phone);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "Customer Added");

            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }

        txtcustid.setText("");
        txtfncust.setText("");
        txtlncust.setText("");
        txtstreetcust.setText("");
        txtcitycust.setText("");
        txtphonecust.setText("");
        txtcustid.requestFocus();

    }

    //Find Account
    void FindAccount(JTextField txtAcc_id, JLabel lblCust_name, JLabel lblAccount_Balance) {

        try {
            PreparedStatement ps;
            ResultSet rs;
            String acc_id = txtAcc_id.getText();

            String query = "select cust_id,balance from account where acc_id = ?";

            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, acc_id);
            rs = ps.executeQuery();

            if (rs.next() == true) {
                String cust_id = rs.getString("cust_id");
                String balance = rs.getString("balance");

                String quree = "select first_name,last_name from customer where cust_id = ?";

                ps = MyConnection.getConnection().prepareStatement(quree);
                ps.setString(1, cust_id);
                rs = ps.executeQuery();

                if (rs.next() == true) {
                    String fname = rs.getString("first_name");
                    String lname = rs.getString("last_name");
                    JOptionPane.showMessageDialog(this, "Account Founded ");
                    lblCust_name.setText(fname + " " + lname);
                    lblAccount_Balance.setText(balance);

                } else {
                    JOptionPane.showMessageDialog(this, "Account Not Found ");

                }

            } else {
                JOptionPane.showMessageDialog(this, "Account Not Found ");

            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //add operation
    private void AddOperation(String acc_id, String acc_id2, String type, String withdrawBalance) throws SQLException {
        PreparedStatement ps;
        ResultSet rs;

        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        String qer = "insert into operation (id_emp,id_acc1,id_acc2,oper_type,balance,oper_date) values(?,?,?,?,?,?)";
        ps = MyConnection.getConnection().prepareStatement(qer);
        ps.setString(1, username.get(0).getId());
        ps.setString(2, acc_id);
        ps.setString(3, acc_id2);
        ps.setString(4, type);
        ps.setString(5, withdrawBalance);
        ps.setTimestamp(6, date);
        ps.executeUpdate();

    }

    //Withdraw Money From Account
    void WithdrawAccount(JTextField txtAcc_id, JTextField txtWithdraw_amount, JLabel lblCust_name, JLabel lblAccount_Balance) {

        PreparedStatement ps;
        String acc_id2 = "#";
        String type = "Withdraw";

        String acc_id = txtAcc_id.getText();
        String bal = lblAccount_Balance.getText();
        String withdrawBalance = txtWithdraw_amount.getText();
        String query = "update account set balance = ? where acc_id = ?";
        int old = Integer.parseInt(bal);
        int w = Integer.parseInt(withdrawBalance);
        int n = old - w;
        try {

            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, Integer.toString(n));
            ps.setString(2, acc_id);
            ps.executeUpdate();
            AddOperation(acc_id, acc_id2, type, withdrawBalance);
            JOptionPane.showMessageDialog(this, "Successful .. ");

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
        txtAcc_id.setText("");
        txtWithdraw_amount.setText("");
        lblCust_name.setText("Customer Name");
        lblAccount_Balance.setText("Account Balance");

    }

    //Func Deposit
    void DepositAccount(JTextField txtAcc_id, JTextField txtWithdraw_amount, JLabel lblCust_name, JLabel lblAccount_Balance) {
        PreparedStatement ps;
        String acc_id2 = "#";
        String type = "Deposit";

        String acc_id = txtAcc_id.getText();
        String bal = lblAccount_Balance.getText();
        String withdrawBalance = txtWithdraw_amount.getText();
        String query = "update account set balance = ? where acc_id = ?";
        int old = Integer.parseInt(bal);
        int w = Integer.parseInt(withdrawBalance);
        int n = old + w;
        try {

            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, Integer.toString(n));
            ps.setString(2, acc_id);
            ps.executeUpdate();
            AddOperation(acc_id, acc_id2, type, withdrawBalance);
            JOptionPane.showMessageDialog(this, "Successful .. ");

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
        txtAcc_id.setText("");
        txtWithdraw_amount.setText("");
        lblCust_name.setText("Customer Name");
        lblAccount_Balance.setText("Account Balance");
    }

    //Func Transfer
    void TransferAccount(JTextField txtAcc_id, JTextField txtWithdraw_amount, JLabel lblCust_name, JLabel lblAccount_Balance, JTextField txtAcc_id1, JLabel lblCust_name1, JLabel lblAccount_Balance1) {
        PreparedStatement ps;
        String acc_id2 = txtAcc_id1.getText();
        String type = "Transfer";

        String acc_id = txtAcc_id.getText();

        String bal = lblAccount_Balance.getText();
        String withdrawBalance = txtWithdraw_amount.getText();

        String query = "update account set balance = ? where acc_id = ?";
        int old = Integer.parseInt(bal);
        int w = Integer.parseInt(withdrawBalance);
        int n = old - w;
        try {

            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, Integer.toString(n));
            ps.setString(2, acc_id);
            ps.executeUpdate();

            String qure = "update account set balance = ? where acc_id = ?";
            int olde = Integer.parseInt(bal);
            int we = Integer.parseInt(withdrawBalance);
            int ne = olde + we;

            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, Integer.toString(ne));
            ps.setString(2, acc_id2);
            ps.executeUpdate();

            AddOperation(acc_id, acc_id2, type, withdrawBalance);
            JOptionPane.showMessageDialog(this, "Successful .. ");

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
        txtAcc_id.setText("");
        txtWithdraw_amount.setText("");
        lblCust_name.setText("Customer Name");
        lblAccount_Balance.setText("Account Balance");
        txtAcc_id1.setText("");
        lblCust_name1.setText("Customer Name");
        lblAccount_Balance1.setText("Account Balance");

    }

    //add Operation to list
    public ArrayList<Operation> getOperationList() {
        ArrayList<Operation> operationlist = new ArrayList<Operation>();
        Connection connection = getConnection();

        String query = "select * from operation";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Operation op;
            while (rs.next()) {
                op = new Operation(rs.getString("id_emp"), rs.getString("id_acc1"), rs.getString("id_acc2"), rs.getString("oper_type"), rs.getString("balance"), rs.getString("oper_date"));
                operationlist.add(op);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        return operationlist;
    }

    //func show operation 
    ArrayList<Operation> ShowOperationDateWithDate(JDateChooser Date1, JDateChooser Date2, JTextField txtAccountId) {
        Account_bank acc = new Account_bank();
        ArrayList<Operation> oplist = new ArrayList<Operation>();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date startDate = Date1.getDate();
        java.util.Date endtDate = Date2.getDate();
        PreparedStatement pst;
        ResultSet rs;
        Connection connection = getConnection();
        try {
            String sql = "select * from operation where oper_date between '" + new java.sql.Date(startDate.getTime()) + "'  and '" + new java.sql.Date(endtDate.getTime()) + "' ";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            Operation op;
            while (rs.next()) {

                op = new Operation(rs.getString("id_emp"), rs.getString("id_acc1"), rs.getString("id_acc2"), rs.getString("oper_type"), rs.getString("balance"), rs.getString("oper_date"));
                oplist.add(op);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
        return oplist;
    }

}
