package Employee;

import Admin.Dashboard_Admin;
import Entity.Admin;
import Entity.User;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author MR-INT
 */
public class Login extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    java.net.URL url = ClassLoader.getSystemResource("img/banklogo.png");
    int mousepX;
    int mousepY;
    private final Image img_logo = new ImageIcon(Login.class.getResource("img/banklogo.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
    private final Image img_user = new ImageIcon(Login.class.getResource("img/user.png")).getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH);
    private final Image img_pwd = new ImageIcon(Login.class.getResource("img/pwd.png")).getImage().getScaledInstance(50, 40, Image.SCALE_SMOOTH);
    private final Image img_key = new ImageIcon(Login.class.getResource("img/key.png")).getImage().getScaledInstance(40, 20, Image.SCALE_SMOOTH);

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img/banklogo.png")));

        this.setLocationRelativeTo(null);
        lblconLogo.setIcon(new ImageIcon(img_logo));
        lblusrlogo.setIcon(new ImageIcon(img_user));
        lblpwdlogo.setIcon(new ImageIcon(img_pwd));
        lblloginlogo.setIcon(new ImageIcon(img_key));
        txtPassword.setEchoChar((char) 0);

    }

    public void close() {

        this.setVisible(false);
        this.dispose();

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        lblusrlogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        lblpwdlogo = new javax.swing.JLabel();
        lblx = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblloginlogo = new javax.swing.JLabel();
        lblconLogo = new javax.swing.JLabel();
        lblalert = new javax.swing.JLabel();
        lbldraged = new javax.swing.JLabel();
        lblreduire = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(600, 350));
        setUndecorated(true);
        setSize(new java.awt.Dimension(300, 350));

        jPanel1.setBackground(new java.awt.Color(4, 79, 103));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 128), 2));
        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtUsername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUsername.setText("Username");
        txtUsername.setToolTipText("");
        txtUsername.setAutoscrolls(false);
        txtUsername.setBorder(null);
        txtUsername.setName(""); // NOI18N
        txtUsername.setPreferredSize(new java.awt.Dimension(63, 30));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(lblusrlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblusrlogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtUsername.getAccessibleContext().setAccessibleName("txtUsername");
        txtUsername.getAccessibleContext().setAccessibleDescription("Username");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(266, 54));

        txtPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPassword.setText("Password");
        txtPassword.setBorder(null);
        txtPassword.setPreferredSize(new java.awt.Dimension(63, 30));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblpwdlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblpwdlogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtPassword.getAccessibleContext().setAccessibleDescription("Password");

        lblx.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblx.setForeground(new java.awt.Color(255, 255, 255));
        lblx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblx.setText("X");
        lblx.setToolTipText("Close");
        lblx.setPreferredSize(new java.awt.Dimension(20, 20));
        lblx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblxMouseExited(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(47, 79, 79));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setPreferredSize(new java.awt.Dimension(44, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblloginlogo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addComponent(lblloginlogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblconLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblalert.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblalert.setForeground(new java.awt.Color(255, 255, 255));
        lblalert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbldraged.setText("                       ");
        lbldraged.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbldragedMouseDragged(evt);
            }
        });
        lbldraged.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbldragedMousePressed(evt);
            }
        });

        lblreduire.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblreduire.setForeground(new java.awt.Color(255, 255, 255));
        lblreduire.setText("-");
        lblreduire.setToolTipText("Reduce");
        lblreduire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblreduireMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblreduireMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblreduireMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblalert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblconLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbldraged, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(lblreduire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblreduire)
                    .addComponent(lbldraged, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(lblconLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lblalert, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//GEN-FIRST:event_pnlbtnLoginMouseClicked
 
    
    
//GEN-LAST:event_pnlbtnLoginMouseClicked

    private void lblxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblxMouseExited
        lblx.setForeground(Color.white);
    }//GEN-LAST:event_lblxMouseExited

    private void lblxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblxMouseEntered
        lblx.setForeground(Color.red);
    }//GEN-LAST:event_lblxMouseEntered

    private void lblxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblxMouseClicked
        if (JOptionPane.showConfirmDialog(null, " Are you sure you want to close this application ?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0)
            System.exit(0);
    }//GEN-LAST:event_lblxMouseClicked

    @SuppressWarnings("deprecation")
    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost

        if (txtPassword.getText().equals("")) {
            txtPassword.setText("Password");
            txtPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    @SuppressWarnings("deprecation")
    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        if (txtPassword.getText().equals("Password")) {
            txtPassword.setEchoChar('*');
            txtPassword.setText("");
        } else {
            txtPassword.selectAll();
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        // TODO add your handling code here:
        if (txtUsername.getText().equals("")) {
            txtUsername.setText("Username");
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
        if (txtUsername.getText().equals("Username")) {
            txtUsername.setText("");
        } else {
            txtUsername.selectAll();
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        
        if (txtUsername.getText().equals("") || txtUsername.getText().equals("Username") || txtPassword.getText().equals("") || txtPassword.getText().equals("Password")) {
            lblalert.setText("Please fill all the requirements !");

        } else {
            MyConnection M = new MyConnection();
            String uname = txtUsername.getText();
            String pass = txtPassword.getText();
            if (txtUsername.getText().equals("admin")) {

                boolean p = M.login(uname, pass);
                if (p == true) {

                    Dashboard_Admin mf = new Dashboard_Admin();
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                    mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    this.dispose();
                    close();
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);

                }
            } else {
                boolean p = M.login_employee(uname, pass);
                if (p == true) {
                    
                    Dashboard mf = new Dashboard();
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                    mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    this.dispose();
                    close();

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Username Or Password", "Login Failed", 2);

                }

            }

        }
        
    }//GEN-LAST:event_jPanel4MouseClicked

  
    private void lbldragedMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldragedMouseDragged
        int kordinatX = evt.getXOnScreen();
        int KordinatY = evt.getYOnScreen();

        this.setLocation(kordinatX - mousepX, KordinatY - mousepY);
    }//GEN-LAST:event_lbldragedMouseDragged

    private void lbldragedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldragedMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_lbldragedMousePressed

    private void lblreduireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblreduireMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_lblreduireMouseClicked

    private void lblreduireMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblreduireMouseEntered
        lblreduire.setForeground(Color.black);
    }//GEN-LAST:event_lblreduireMouseEntered

    private void lblreduireMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblreduireMouseExited
        lblreduire.setForeground(Color.white);
    }//GEN-LAST:event_lblreduireMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                UIManager.put("OptionPane.cancelButtonText", "Cancel");
                UIManager.put("OptionPane.noButtonText", "No");
                UIManager.put("OptionPane.okButtonText", "OK");
                UIManager.put("OptionPane.yesButtonText", "Yes");

                JFrame parent = new JFrame();
                new Login().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblalert;
    private javax.swing.JLabel lblconLogo;
    private javax.swing.JLabel lbldraged;
    public javax.swing.JLabel lblloginlogo;
    private javax.swing.JLabel lblpwdlogo;
    private javax.swing.JLabel lblreduire;
    private javax.swing.JLabel lblusrlogo;
    private javax.swing.JLabel lblx;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}