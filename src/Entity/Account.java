package Entity;
public class Account {
    private String acc_id;
    private String cust_id;
    private String acc_type;
    private String balance;

    public Account(String acc_id, String cust_id, String acc_type, String balance) {
        this.acc_id = acc_id;
        this.cust_id = cust_id;
        this.acc_type = acc_type;
        this.balance = balance;
    }

    public String getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(String acc_id) {
        this.acc_id = acc_id;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }


    
    
}
