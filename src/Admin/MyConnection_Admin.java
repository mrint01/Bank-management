package Admin;

import Entity.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Employee.Login;
import Employee.MyConnection;
import static Employee.MyConnection.getConnection;
import javax.swing.JLabel;

/**
 *
 * @author MR-INT
 */
public class MyConnection_Admin extends javax.swing.JFrame {

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
                emp = new Employee(rs.getString("emp_id"), rs.getString("username"),rs.getString("first_name"), rs.getString("last_name"), rs.getString("street"), rs.getString("city"), rs.getInt("phone"));
                employeelist.add(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        return employeelist;
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

    //add employee to database
    void AjoutEmpoyee(JTextField txtempid, JTextField txtusername ,JTextField txtfnemp, JTextField txtlnemp, JTextField txtstreetemp, JTextField txtcityemp, JTextField txtphoneemp) throws SQLException {

        PreparedStatement ps;
        ResultSet rs;
        
        String username = txtusername.getText();
        String emp_id = txtempid.getText();
        String first_name = txtfnemp.getText();
        String last_name = txtlnemp.getText();
        String street = txtstreetemp.getText();
        String city = txtcityemp.getText();
        String phone = txtphoneemp.getText();
        String qer = "select * from employee where emp_id = ?";
        ps = MyConnection_Admin.getConnection().prepareStatement(qer);
        ps.setString(1, emp_id);
        try {

            rs = ps.executeQuery();
            if (rs.next()) {

                JOptionPane.showMessageDialog(this, "Employee already exist");
            } else {

                String query = "insert into employee(emp_id,username,first_name,last_name,street,city,phone)values(?,?,?,?,?,?,?)";

                ps = MyConnection_Admin.getConnection().prepareStatement(query);
                ps.setString(1, emp_id);
                ps.setString(2, username);
                ps.setString(3, first_name);
                ps.setString(4, last_name);
                ps.setString(5, street);
                ps.setString(6, city);
                ps.setString(7, phone);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "Employee Added");

            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }

        txtempid.setText("");
        txtusername.setText("");
        txtfnemp.setText("");
        txtlnemp.setText("");
        txtstreetemp.setText("");
        txtcityemp.setText("");
        txtphoneemp.setText("");
        txtempid.requestFocus();

    }

    //update employe
    void UpdateEmployee(JTextField txtempid, JTextField txtusername ,JTextField txtfnemp, JTextField txtlnemp, JTextField txtstreetemp, JTextField txtcityemp, JTextField txtphoneemp) {

        PreparedStatement ps;
        ResultSet rs;
        String username = txtusername.getText();
        String emp_id = txtempid.getText();
        String first_name = txtfnemp.getText();
        String last_name = txtlnemp.getText();
        String street = txtstreetemp.getText();
        String city = txtcityemp.getText();
        String phone = txtphoneemp.getText();
        String query = "update employee set emp_id = ? ,username = ?,first_name = ? , last_name = ? ,city= ? , street = ?, phone= ? where emp_id = ?";

        try {

            ps = MyConnection_Admin.getConnection().prepareStatement(query);
            ps.setString(1, emp_id);
            ps.setString(2, username);
            ps.setString(3, first_name);
            ps.setString(4, last_name);
            ps.setString(5, street);
            ps.setString(6, city);
            ps.setString(7, phone);
            ps.setString(8, emp_id);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Employee updated");

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }

        txtempid.setText("");
        txtusername.setText("");
        txtfnemp.setText("");
        txtlnemp.setText("");
        txtstreetemp.setText("");
        txtcityemp.setText("");
        txtphoneemp.setText("");
        txtempid.requestFocus();

    }

    //delete employee
    void DeleteEmployee(JTextField txtempid, JTextField txtusername ,JTextField txtfnemp, JTextField txtlnemp, JTextField txtstreetemp, JTextField txtcityemp, JTextField txtphoneemp) {

        PreparedStatement ps;
        ResultSet rs;

        String emp_id = txtempid.getText();
        String query = "delete from employee where emp_id = ?";

        try {

            ps = MyConnection_Admin.getConnection().prepareStatement(query);
            ps.setString(1, emp_id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Employee Deleted");
            

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
        txtempid.setText("");
        txtusername.setText("");
        txtfnemp.setText("");
        txtlnemp.setText("");
        txtstreetemp.setText("");
        txtcityemp.setText("");
        txtphoneemp.setText("");
        txtempid.requestFocus();
    }

    //change password
    void ChangePassword(JPasswordField txtpassword1, JPasswordField txtpassword2) {

        PreparedStatement ps;
        ResultSet rs;

        String pass = txtpassword1.getText();
        String query = "update admin set u_password = ? where u_uname = 'admin'";

        try {

            ps = MyConnection_Admin.getConnection().prepareStatement(query);
            ps.setString(1, pass);
            if (ps.executeUpdate() == 1) {

                JOptionPane.showMessageDialog(this, "Password Changed");
            } else {

                JOptionPane.showMessageDialog(this, "error System");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtpassword1.setText("");
        txtpassword2.setText("");
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

    //Find Costomer
    void Findcust(JTextField txtid, JLabel lblid1, JLabel lblid2, JLabel lblid3, JLabel lblid4, JLabel lblid5) {

        PreparedStatement ps;
        ResultSet rs;
        String acc_id = txtid.getText();
        String query = "select first_name,last_name,street,city,phone from customer c,account a  where c.cust_id = a.cust_id and acc_id = ?";
try{
    

        ps = MyConnection.getConnection().prepareStatement(query);
        ps.setString(1, acc_id);
        rs = ps.executeQuery();

        if (rs.next() == true) {
            
            lblid1.setText(rs.getString("first_name"));
            lblid2.setText(rs.getString("last_name"));
            lblid3.setText(rs.getString("street"));
            lblid4.setText(rs.getString("city"));
            lblid5.setText(rs.getString("phone"));
        } else {
            JOptionPane.showMessageDialog(this, "Not Found !");
        }

    }   catch (SQLException ex) {
            Logger.getLogger(MyConnection_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    

}
