package Entity;

/**
 *
 * @author MR-INT
 */
public class Operation {

    private String id_emp;
    private String id_acc1;
    private String id_acc2;
    private String oper_type;
    private String balance;
    private String oper_date;

    public Operation(String id_emp, String id_acc1, String id_acc2, String oper_type, String balance, String oper_date) {
        this.id_emp = id_emp;
        this.id_acc1 = id_acc1;
        this.id_acc2 = id_acc2;
        this.oper_type = oper_type;
        this.balance = balance;
        this.oper_date = oper_date;
    }

    public String getId_emp() {
        return id_emp;
    }

    public void setId_emp(String id_emp) {
        this.id_emp = id_emp;
    }

    public String getId_acc1() {
        return id_acc1;
    }

    public void setId_acc1(String id_acc1) {
        this.id_acc1 = id_acc1;
    }

    public String getId_acc2() {
        return id_acc2;
    }

    public void setId_acc2(String id_acc2) {
        this.id_acc2 = id_acc2;
    }

    public String getOper_type() {
        return oper_type;
    }

    public void setOper_type(String oper_type) {
        this.oper_type = oper_type;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getOper_date() {
        return oper_date;
    }

    public void setOper_date(String oper_date) {
        this.oper_date = oper_date;
    }

    
    
}
