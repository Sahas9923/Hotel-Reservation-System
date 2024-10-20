package View;

import Controller.LoginController;
import Model.LoginModel;
import View.Dashboard;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_login = new javax.swing.JButton();
        txt_u = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_login1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_p = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setPreferredSize(new java.awt.Dimension(700, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_login.setBackground(new java.awt.Color(0, 51, 204));
        btn_login.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 310, 40));

        txt_u.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        getContentPane().add(txt_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 200, 40));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 110, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_login1.setBackground(new java.awt.Color(0, 51, 204));
        btn_login1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_login1.setForeground(new java.awt.Color(255, 255, 255));
        btn_login1.setText("Back");
        btn_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 150, 40));

        jButton1.setBackground(new java.awt.Color(0, 51, 204));
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, 40));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel2.setText("( Enter your credentials )");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 250, -1));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 110, -1));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, -1));

        txt_p.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txt_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 420, 430));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel5.setText("Log In to the system");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 270, -1));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 910, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        try {
            String username = txt_u.getText();
            String password = txt_p.getText();

            // Check if the fields are empty
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both username and password.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Create an instance of Model and Controller
            LoginModel model = new LoginModel();
            LoginController controller = new LoginController(model);

            // Perform login validation
            if (controller.login(username, password)) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                // Here you can proceed to the next window or dashboard
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);
                this.dispose(); // Close the login window
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);

                txt_u.setText("");
                txt_p.setText("");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login1ActionPerformed

        Booking b = new Booking();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_login1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Regeistration r = new Regeistration();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_login1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txt_p;
    private javax.swing.JTextField txt_u;
    // End of variables declaration//GEN-END:variables
}
