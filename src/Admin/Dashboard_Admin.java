/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Employee.Login;
import Employee.MyConnection;


/**
 *
 * @author MR-INT
 */
public class Dashboard_Admin extends javax.swing.JFrame {
    int mousepX;
    int mousepY;
    MyConnection_Admin me = new MyConnection_Admin();
    Home_Admin homme = new Home_Admin();
    Employees emp = new Employees();
    Setting_Admin setting = new Setting_Admin();
    private boolean v = true;
    private boolean c = true;
    private boolean d = true;
    private Image img_logo = new ImageIcon(Login.class.getResource("img/banklogo.png")).getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
    private Image img_home = new ImageIcon(Login.class.getResource("img/home.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_account = new ImageIcon(Login.class.getResource("img/account.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_employee = new ImageIcon(Login.class.getResource("img/employee.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_setting = new ImageIcon(Login.class.getResource("img/setting.png")).getImage().getScaledInstance(30, 26, Image.SCALE_SMOOTH);
    private Image img_logout = new ImageIcon(Login.class.getResource("img/logout.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    private Image img_wu = new ImageIcon(Login.class.getResource("img/wu.png")).getImage().getScaledInstance(100, 70, Image.SCALE_SMOOTH);
    private final Image img_cust = new ImageIcon(Login.class.getResource("img/user.png")).getImage().getScaledInstance(60, 40, Image.SCALE_SMOOTH);
   

    public Dashboard_Admin() {
        initComponents();
        Dashboard_Admin.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Dashboard_Admin.this.setMaximizedBounds(env.getMaximumWindowBounds());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("img/banklogo.png")));
        lbllogo.setIcon(new ImageIcon(img_logo));
        lbl_home.setIcon(new ImageIcon(img_home));
        lbl_employee.setIcon(new ImageIcon(img_employee));
        lbl_setting.setIcon(new ImageIcon(img_setting));
        lbl_logout.setIcon(new ImageIcon(img_logout));
        lblwu.setIcon(new ImageIcon(img_wu));

        this.setLocationRelativeTo(null);
        Desktop_Main.removeAll();
        Desktop_Main.repaint();
        Desktop_Main.setLayout(new BorderLayout());
        Desktop_Main.revalidate();

        Desktop_Main.add(homme.Forme_Home, BorderLayout.CENTER);

        v = false;
        Color c = new Color(157, 41, 51);
        panelHome.setBackground(c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelone = new javax.swing.JPanel();
        lblx = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbllogo = new javax.swing.JLabel();
        panelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_home = new javax.swing.JLabel();
        panelEmployer = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbl_employee = new javax.swing.JLabel();
        panelSetting = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbl_setting = new javax.swing.JLabel();
        panelSingout = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbl_logout = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblcopyright = new javax.swing.JLabel();
        lblwu = new javax.swing.JLabel();
        lblreduire = new javax.swing.JLabel();
        Desktop_Main = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelone.setBackground(new java.awt.Color(4, 79, 103));
        panelone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 128), 2));

        lblx.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblx.setForeground(new java.awt.Color(255, 255, 255));
        lblx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblx.setText("X");
        lblx.setToolTipText("Close");
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

        jPanel3.setBackground(new java.awt.Color(38, 67, 72));

        lbllogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllogo.setText("   ");

        panelHome.setBackground(new java.awt.Color(38, 67, 90));
        panelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelHomeMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HOME");
        jLabel3.setPreferredSize(new java.awt.Dimension(5, 20));

        lbl_home.setText(" ");
        lbl_home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_home.setPreferredSize(new java.awt.Dimension(50, 40));

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lbl_home, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_home, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelEmployer.setBackground(new java.awt.Color(38, 67, 90));
        panelEmployer.setPreferredSize(new java.awt.Dimension(0, 65));
        panelEmployer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelEmployerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelEmployerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelEmployerMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EMPLOYEE");
        jLabel6.setPreferredSize(new java.awt.Dimension(5, 20));

        lbl_employee.setText(" ");
        lbl_employee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_employee.setPreferredSize(new java.awt.Dimension(50, 40));

        javax.swing.GroupLayout panelEmployerLayout = new javax.swing.GroupLayout(panelEmployer);
        panelEmployer.setLayout(panelEmployerLayout);
        panelEmployerLayout.setHorizontalGroup(
            panelEmployerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmployerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        panelEmployerLayout.setVerticalGroup(
            panelEmployerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmployerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelEmployerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelSetting.setBackground(new java.awt.Color(38, 67, 90));
        panelSetting.setPreferredSize(new java.awt.Dimension(0, 65));
        panelSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelSettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelSettingMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SETTING");
        jLabel7.setPreferredSize(new java.awt.Dimension(5, 20));

        lbl_setting.setText(" ");
        lbl_setting.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_setting.setPreferredSize(new java.awt.Dimension(50, 40));

        javax.swing.GroupLayout panelSettingLayout = new javax.swing.GroupLayout(panelSetting);
        panelSetting.setLayout(panelSettingLayout);
        panelSettingLayout.setHorizontalGroup(
            panelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSettingLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(lbl_setting, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        panelSettingLayout.setVerticalGroup(
            panelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSettingLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_setting, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelSingout.setBackground(new java.awt.Color(38, 67, 90));
        panelSingout.setPreferredSize(new java.awt.Dimension(0, 65));
        panelSingout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSingoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelSingoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelSingoutMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SIGN OUT");
        jLabel8.setPreferredSize(new java.awt.Dimension(5, 20));

        lbl_logout.setText(" ");
        lbl_logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_logout.setPreferredSize(new java.awt.Dimension(50, 40));

        javax.swing.GroupLayout panelSingoutLayout = new javax.swing.GroupLayout(panelSingout);
        panelSingout.setLayout(panelSingoutLayout);
        panelSingoutLayout.setHorizontalGroup(
            panelSingoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSingoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        panelSingoutLayout.setVerticalGroup(
            panelSingoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSingoutLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelSingoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Copyright ©");

        lblcopyright.setFont(new java.awt.Font("Dotum", 1, 14)); // NOI18N
        lblcopyright.setForeground(new java.awt.Color(0, 153, 153));
        lblcopyright.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblcopyright.setText("Sfar Hatem ");
        lblcopyright.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcopyrightMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcopyrightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcopyrightMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelEmployer, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
            .addComponent(panelSetting, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
            .addComponent(panelSingout, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
            .addComponent(lbllogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcopyright, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lblwu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEmployer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSingout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(lblwu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblcopyright))
                .addContainerGap())
        );

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

        Desktop_Main.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledToolBarBorderBackground"));

        javax.swing.GroupLayout Desktop_MainLayout = new javax.swing.GroupLayout(Desktop_Main);
        Desktop_Main.setLayout(Desktop_MainLayout);
        Desktop_MainLayout.setHorizontalGroup(
            Desktop_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Desktop_MainLayout.setVerticalGroup(
            Desktop_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout paneloneLayout = new javax.swing.GroupLayout(panelone);
        panelone.setLayout(paneloneLayout);
        paneloneLayout.setHorizontalGroup(
            paneloneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneloneLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(paneloneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneloneLayout.createSequentialGroup()
                        .addGap(18, 920, Short.MAX_VALUE)
                        .addComponent(lblreduire)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblx, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(paneloneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Desktop_Main)
                        .addContainerGap())))
        );
        paneloneLayout.setVerticalGroup(
            paneloneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneloneLayout.createSequentialGroup()
                .addGroup(paneloneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblx)
                    .addComponent(lblreduire))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Desktop_Main)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblxMouseClicked

        if (JOptionPane.showConfirmDialog(null, " Are you sure you want to close this application ?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_lblxMouseClicked

    private void lblxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblxMouseEntered
        lblx.setForeground(Color.red);
    }//GEN-LAST:event_lblxMouseEntered

    private void lblxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblxMouseExited
        lblx.setForeground(Color.white);
    }//GEN-LAST:event_lblxMouseExited

    private void lblreduireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblreduireMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_lblreduireMouseClicked

    private void lblreduireMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblreduireMouseEntered
        lblreduire.setForeground(Color.black);
    }//GEN-LAST:event_lblreduireMouseEntered

    private void lblreduireMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblreduireMouseExited
        lblreduire.setForeground(Color.white);
    }//GEN-LAST:event_lblreduireMouseExited

    private void lblcopyrightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcopyrightMouseExited
        Color c = new Color(0, 153, 153);
        lblcopyright.setForeground(c);
    }//GEN-LAST:event_lblcopyrightMouseExited

    private void lblcopyrightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcopyrightMouseEntered
        lblcopyright.setForeground(Color.red);
    }//GEN-LAST:event_lblcopyrightMouseEntered

    private void lblcopyrightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcopyrightMouseClicked
        try {

            Desktop.getDesktop().browse(new URI("https://www.facebook.com/hatem.sfar2"));

        } catch (IOException | URISyntaxException e1) {
        }
    }//GEN-LAST:event_lblcopyrightMouseClicked

    private void panelSingoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSingoutMouseExited
        Color c = new Color(38, 67, 90);
        panelSingout.setBackground(c);
    }//GEN-LAST:event_panelSingoutMouseExited

    private void panelSingoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSingoutMouseEntered
        panelSingout.setBackground(Color.gray);
    }//GEN-LAST:event_panelSingoutMouseEntered

    private void panelSingoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSingoutMouseClicked

        this.setVisible(false);
        this.dispose();
        Login m = new Login();
        m.setVisible(true);
        m.pack();
        m.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_panelSingoutMouseClicked

    private void panelSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSettingMouseExited
        if (d == true) {
            Color c = new Color(38, 67, 90);

            panelSetting.setBackground(c);
        }
    }//GEN-LAST:event_panelSettingMouseExited

    private void panelSettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSettingMouseEntered
        if (d == true) {
            panelSetting.setBackground(Color.gray);
        }
    }//GEN-LAST:event_panelSettingMouseEntered

    private void panelSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSettingMouseClicked
        v = true;
       
        c = true;
        d = false;
        Color n = new Color(38, 67, 90);
        panelHome.setBackground(n);
      
        panelEmployer.setBackground(n);

        Color c = new Color(157, 41, 51);
        panelSetting.setBackground(c);

        if (Desktop_Main.isShowing()) {

            Desktop_Main.removeAll();
        }
        Desktop_Main.removeAll();
        Desktop_Main.repaint();
        Desktop_Main.setLayout(new BorderLayout());
        Desktop_Main.revalidate();

        Desktop_Main.add(setting.setting_form, BorderLayout.CENTER);
    }//GEN-LAST:event_panelSettingMouseClicked

    private void panelEmployerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmployerMouseExited

        if (c == true) {
            Color c = new Color(38, 67, 90);

            panelEmployer.setBackground(c);
        }
    }//GEN-LAST:event_panelEmployerMouseExited

    private void panelEmployerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmployerMouseEntered
        if (c == true) {
            panelEmployer.setBackground(Color.gray);
        }
    }//GEN-LAST:event_panelEmployerMouseEntered

    private void panelEmployerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmployerMouseClicked
        v = true;
        c = false;
        d = true;
        Color n = new Color(38, 67, 90);
        panelHome.setBackground(n);
       
        panelSetting.setBackground(n);

        Color c = new Color(157, 41, 51);
        panelEmployer.setBackground(c);

        if (Desktop_Main.isShowing()) {

            Desktop_Main.removeAll();
        }
        Desktop_Main.removeAll();
        Desktop_Main.repaint();
        Desktop_Main.setLayout(new BorderLayout());
        Desktop_Main.revalidate();

        Desktop_Main.add(emp.employee_form, BorderLayout.CENTER);
    }//GEN-LAST:event_panelEmployerMouseClicked

    private void panelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseExited

        //38 67 90
        if (v == true) {
            Color c = new Color(38, 67, 90);
            panelHome.setBackground(c);
        }
    }//GEN-LAST:event_panelHomeMouseExited

    private void panelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseEntered
        if (v == true) {
            panelHome.setBackground(Color.gray);

        }
    }//GEN-LAST:event_panelHomeMouseEntered

    private void panelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseClicked

        v = false;
        c = true;
        d = true;
        Color n = new Color(38, 67, 90);
       
        panelEmployer.setBackground(n);
        panelSetting.setBackground(n);

        Color c = new Color(157, 41, 51);
        panelHome.setBackground(c);

        if (Desktop_Main.isShowing()) {

            Desktop_Main.removeAll();
        }
        Desktop_Main.removeAll();
        Desktop_Main.repaint();
        Desktop_Main.setLayout(new BorderLayout());
        Desktop_Main.revalidate();
        int nbrAccount = me.getAccountList().size();
        int nbUsers = me.getCustomerList().size();
        int nbrEmployee = me.getEmployeeList().size();

        homme.lblAccount.setText(nbrAccount + " Accounts");
        homme.lblAccount.setIcon(new ImageIcon(img_account));

        homme.lblUsr.setText(nbUsers + " Customers");
        homme.lblUsr.setIcon(new ImageIcon(img_cust));

        homme.lblEmp.setText(nbrEmployee + " Employee");
        homme.lblEmp.setIcon(new ImageIcon(img_employee));
        Desktop_Main.add(homme.Forme_Home, BorderLayout.CENTER);
    }//GEN-LAST:event_panelHomeMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Dashboard_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane Desktop_Main;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_employee;
    private javax.swing.JLabel lbl_home;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_setting;
    private javax.swing.JLabel lblcopyright;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblreduire;
    public javax.swing.JLabel lblwu;
    private javax.swing.JLabel lblx;
    private javax.swing.JPanel panelEmployer;
    public javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelSetting;
    private javax.swing.JPanel panelSingout;
    public javax.swing.JPanel panelone;
    // End of variables declaration//GEN-END:variables
}
