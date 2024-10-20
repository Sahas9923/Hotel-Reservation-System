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
        jPanel1 = new javax.swing.JPanel();
        btn_signout = new javax.swing.JButton();
        btn_manager = new javax.swing.JButton();
        btn_report = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_reservations = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(980, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_signout.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_signout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahas Suraweers\\Desktop\\HOtel reservation system\\logoutbb_12319756.png")); // NOI18N
        btn_signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_signout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 140, 110));

        btn_manager.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_manager.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahas Suraweers\\Desktop\\HOtel reservation system\\booking_2460877.png")); // NOI18N
        btn_manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_managerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 140, 110));

        btn_report.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_report.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahas Suraweers\\Desktop\\HOtel reservation system\\reports.png")); // NOI18N
        btn_report.setOpaque(true);
        btn_report.setPreferredSize(new java.awt.Dimension(146, 127));
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });
        jPanel1.add(btn_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 140, 110));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 2, 18)); // NOI18N
        jLabel1.setText("Sign Out");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 90, -1));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 2, 18)); // NOI18N
        jLabel8.setText("Bookings");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 90, -1));

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 2, 18)); // NOI18N
        jLabel9.setText("Reports");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 270, 520));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel5.setText("Reservations");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 170, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 204));
        jLabel3.setFont(new java.awt.Font("SimSun", 1, 100)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("10");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 110, 100));

        lbl_reservations.setBackground(new java.awt.Color(255, 255, 204));
        lbl_reservations.setFont(new java.awt.Font("SimSun", 1, 100)); // NOI18N
        lbl_reservations.setForeground(new java.awt.Color(51, 0, 204));
        lbl_reservations.setText("09");
        lbl_reservations.setOpaque(true);
        jPanel2.add(lbl_reservations, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 100));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel6.setText("Available Rooms");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 210, 40));

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel7.setText("Occupied Rooms");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 220, 80));

        jLabel4.setBackground(new java.awt.Color(255, 255, 204));
        jLabel4.setFont(new java.awt.Font("SimSun", 1, 100)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("03");
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, 100));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Welcome to The Grand Crecsent!");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 400, 60));
        jPanel2.add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 640, 520));

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
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lbl_reservations;
    // End of variables declaration//GEN-END:variables
}
