package View;

import Controller.DashboardController;
import Model.BookingModel;
import Model.DashboardModel;
import Report.Report1;
import View.Booking;
import javax.swing.JOptionPane;


public class Dashboard extends javax.swing.JFrame {

    
    
    public Dashboard() {
        
        
//            // Create an instance of Model and Controller
//            DashboardModel model = new DashboardModel();
//            DashboardController controller = new DashboardController(model);
//
//            // Get total reservations for today
//            int totalReservations = controller.getTotalReservationsForToday();
//
//            // Format total reservations to three-digit output
//            String formattedReservations = String.format("%03d", totalReservations);
//
//            // Display the result in the label
//            lbl_reservations.setText(formattedReservations);
            
            
            
            initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_manager = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn_report = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_signout = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(590, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Welcome to The Grand Crecsent!");

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel8.setText("Bookings");

        btn_manager.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_manager.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahas Suraweers\\Desktop\\HOtel reservation system\\booking_2460877.png")); // NOI18N
        btn_manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_managerActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel9.setText("Reports");

        btn_report.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_report.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahas Suraweers\\Desktop\\HOtel reservation system\\reports.png")); // NOI18N
        btn_report.setOpaque(true);
        btn_report.setPreferredSize(new java.awt.Dimension(146, 127));
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setText("Sign Out");

        btn_signout.setBackground(new java.awt.Color(255, 102, 102));
        btn_signout.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_signout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahas Suraweers\\Desktop\\HOtel reservation system\\logoutcc_12319756.png")); // NOI18N
        btn_signout.setToolTipText("Sign out from the system");
        btn_signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btn_manager, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_signout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_manager, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_signout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 590, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_managerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_managerActionPerformed
        
        Manager man = new Manager();
        man.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_managerActionPerformed

    private void btn_signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signoutActionPerformed
        
        int response = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to sign out?",
                "Confirm Sign Out",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (response == JOptionPane.YES_OPTION) {
            Booking b = new Booking();
            b.setVisible(true);
            this.dispose();
        }                           
        
    }//GEN-LAST:event_btn_signoutActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        
        Report1 r = new Report1();
        r.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_reportActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_manager;
    private javax.swing.JButton btn_report;
    private javax.swing.JButton btn_signout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
