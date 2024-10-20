/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.BookingController;
import Model.BookingModel;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sahas Suraweers
 */
public class Booking extends javax.swing.JFrame {
    
    BookingModel roomModel = new BookingModel();
    private final BookingController controller = new BookingController(roomModel);

    public Booking() {
        
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_staff = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date_in = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        date_out = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        cmb_cat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmb_type = new javax.swing.JComboBox<>();
        btn_search = new java.awt.Button();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to The Grand Cresent");
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_staff.setBackground(new java.awt.Color(0, 51, 204));
        btn_staff.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_staff.setForeground(new java.awt.Color(255, 255, 255));
        btn_staff.setText("Staff Login");
        btn_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_staffActionPerformed(evt);
            }
        });
        getContentPane().add(btn_staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 190, 40));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 102));
        jLabel8.setText("When Are You Traveling ?");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Check in");

        date_in.setBackground(new java.awt.Color(0, 51, 153));
        date_in.setForeground(new java.awt.Color(0, 51, 153));
        date_in.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Check Out");

        date_out.setBackground(new java.awt.Color(255, 255, 255,80));
        date_out.setForeground(new java.awt.Color(255, 255, 255));
        date_out.setOpaque(false);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Room Category");

        cmb_cat.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        cmb_cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luxury", "Deluxe", "Standard" }));
        cmb_cat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmb_cat.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Room Type");

        cmb_type.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        cmb_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple", "Family" }));
        cmb_type.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_search.setBackground(new java.awt.Color(0, 51, 204));
        btn_search.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setLabel("Reserve");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 102));
        jLabel9.setText("Unlock Your Freedom?");

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 102));
        jLabel10.setText("Choose Your Comfort!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_in, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(date_out, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(cmb_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 222, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel10)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(date_in, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(date_out, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(cmb_type, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmb_cat, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1000, 190));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("The Grand Crecsent");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 80));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 102));
        jLabel7.setText("Hotline - 0775556662");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 200, 60));

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahas Suraweers\\Desktop\\HOtel reservation system\\Hotel_Building_Night_Image.png")); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 590));

        setBounds(0, 0, 1018, 593);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Date checkIn = date_in.getDate();
            Date checkOut = date_out.getDate();
            Date today = new Date();

            if (checkIn == null || checkOut == null) {
                JOptionPane.showMessageDialog(this, "Please select both check-in and check-out dates.");
                return;
            }

            if (checkIn.before(today)) {
                JOptionPane.showMessageDialog(this, "Check-in date cannot be earlier than today's date.");
                return;  
            }

            if (checkOut.before(checkIn)) {
                JOptionPane.showMessageDialog(this, "Check-out date cannot be earlier than check-in date.");
                return; 
            }

            if (cmb_cat.getSelectedItem() == null || cmb_cat.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please select a room category.");
                return;  
            }

            if (cmb_type.getSelectedItem() == null || cmb_type.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please select a room type.");
                return;  
            }

            String checkInDate = sdf.format(date_in.getDate());
            String checkOutDate = sdf.format(date_out.getDate());
            String roomCategory = cmb_cat.getSelectedItem().toString();
            String roomType = cmb_type.getSelectedItem().toString();

            Integer roomID = controller.searchAvailableRoom(checkInDate, checkOutDate, roomCategory, roomType);

            if (roomID != null) {

                Double payment = controller.getRoomPayment(roomID, roomCategory, roomType);
                Integer bookingId = controller.getNextBookingID();

                int response = JOptionPane.showConfirmDialog(this, "Room is available. Press Yes to proceed with the confirmation.", "Room Availability", JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {

                    Customer cp = new Customer(bookingId, roomID, checkInDate, checkOutDate, payment);
                    cp.setVisible(true);
                    this.dispose();

                } else if (response == JOptionPane.NO_OPTION) {

                }

            } else {
                JOptionPane.showMessageDialog(this, "No rooms available! Change the date range or Change Category or Type and Try Again!.");

            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }


    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_staffActionPerformed
        
        Login d = new Login();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_staffActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_search;
    private javax.swing.JButton btn_staff;
    private javax.swing.JComboBox<String> cmb_cat;
    private javax.swing.JComboBox<String> cmb_type;
    private com.toedter.calendar.JDateChooser date_in;
    private com.toedter.calendar.JDateChooser date_out;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
