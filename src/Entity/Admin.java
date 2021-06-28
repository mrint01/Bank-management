/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author MR-INT
 */
public class Admin {
    private String u_name;
    private String u_password;

    public Admin(String u_name, String u_password) {
        this.u_name = u_name;
        this.u_password = u_password;
    }
    public Admin(){
        
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }
    
    
    
    
    
}
