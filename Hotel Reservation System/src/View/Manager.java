package View;

import Controller.ManagerController;
import Model.ManagerModel;
import java.awt.HeadlessException;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Manager extends javax.swing.JFrame {

    public Manager() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel12 = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_status = new javax.swing.JTextField();
        btn_status = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_status = new javax.swing.JTable();
        btn_cancel = new javax.swing.JButton();
        btn_checkin = new javax.swing.JButton();
        btn_checkout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_setname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_unic = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_umob = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_uema = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cmb_booking = new javax.swing.JComboBox<>();
        txt_searchBooking = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_inventory = new javax.swing.JTable();
        btn_today = new javax.swing.JButton();
        btn_lastMonth = new javax.swing.JButton();
        btn_All = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reservation Manager");
        setBackground(new java.awt.Color(204, 204, 0));
        setMinimumSize(new java.awt.Dimension(1160, 700));
        setPreferredSize(new java.awt.Dimension(1260, 522));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel12.setText("Manage Bookings");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 280, 40));

        btn_home.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahas Suraweers\\Desktop\\HOtel reservation system\\home-button.png")); // NOI18N
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 580, 50, 50));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel13.setText("Booking ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 40));

        txt_status.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txt_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_statusActionPerformed(evt);
            }
        });
        jPanel1.add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 240, 40));

        btn_status.setBackground(new java.awt.Color(0, 51, 204));
        btn_status.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_status.setForeground(new java.awt.Color(255, 255, 255));
        btn_status.setText("Search");
        btn_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_statusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 170, 40));

        tbl_status.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        tbl_status.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Booking ID", "Cancelled", "Checked In", "Cancelled Out"
            }
        ));
        tbl_status.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbl_status.setShowGrid(true);
        jScrollPane1.setViewportView(tbl_status);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 540, 80));

        btn_cancel.setBackground(new java.awt.Color(0, 51, 204));
        btn_cancel.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancel Booking");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 180, 40));

        btn_checkin.setBackground(new java.awt.Color(0, 51, 204));
        btn_checkin.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_checkin.setForeground(new java.awt.Color(255, 255, 255));
        btn_checkin.setText("Checked In");
        btn_checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkinActionPerformed(evt);
            }
        });
        jPanel1.add(btn_checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 170, 40));

        btn_checkout.setBackground(new java.awt.Color(0, 51, 204));
        btn_checkout.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_checkout.setForeground(new java.awt.Color(255, 255, 255));
        btn_checkout.setText("Checked Out");
        btn_checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 170, 40));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_setname.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_setname.setForeground(new java.awt.Color(0, 0, 153));
        jPanel3.add(lbl_setname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 310, 40));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setText("NIC / Passport");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 150, 40));

        txt_unic.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jPanel3.add(txt_unic, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 230, 30));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel5.setText("Mobile");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 130, 40));

        txt_umob.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jPanel3.add(txt_umob, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 230, 30));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setText("Email");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 130, 40));

        txt_uema.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jPanel3.add(txt_uema, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 230, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 540, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 560, 480));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmb_booking.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        cmb_booking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booking ID", "NIC / Passport", "Room ID" }));
        cmb_booking.setSelectedIndex(1);
        jPanel2.add(cmb_booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        txt_searchBooking.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jPanel2.add(txt_searchBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 190, 40));

        btn_search.setBackground(new java.awt.Color(0, 51, 204));
        btn_search.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel2.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 180, 40));

        tbl_inventory.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        tbl_inventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "NIC/Passport", "Room Number", "Check In Date", "Check Out Date", "Paid Amount"
            }
        ));
        tbl_inventory.setGridColor(new java.awt.Color(102, 102, 102));
        tbl_inventory.setOpaque(false);
        tbl_inventory.setShowGrid(true);
        jScrollPane2.setViewportView(tbl_inventory);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 570, 320));

        btn_today.setBackground(new java.awt.Color(0, 51, 204));
        btn_today.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        btn_today.setForeground(new java.awt.Color(255, 255, 255));
        btn_today.setText("Bookings Today");
        btn_today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_todayActionPerformed(evt);
            }
        });
        jPanel2.add(btn_today, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 180, 42));

        btn_lastMonth.setBackground(new java.awt.Color(0, 51, 204));
        btn_lastMonth.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        btn_lastMonth.setForeground(new java.awt.Color(255, 255, 255));
        btn_lastMonth.setText("Bookings (30 days)");
        btn_lastMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastMonthActionPerformed(evt);
            }
        });
        jPanel2.add(btn_lastMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 190, 42));

        btn_All.setBackground(new java.awt.Color(0, 51, 204));
        btn_All.setFont(new java.awt.Font("Bookman Old Style", 1, 16)); // NOI18N
        btn_All.setForeground(new java.awt.Color(255, 255, 255));
        btn_All.setText("Bookings All");
        btn_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AllActionPerformed(evt);
            }
        });
        jPanel2.add(btn_All, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 180, 42));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 590, 480));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahas Suraweers\\Desktop\\HOtel reservation system\\logoutcc_12319756.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 580, 50, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed

        String searchCriteria = (String) cmb_booking.getSelectedItem();
        String searchOption = txt_searchBooking.getText();

        if (searchOption.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid input according to the criteria.");
            return;
        }

        try {
            ManagerModel model = new ManagerModel();
            ManagerController managerController = new ManagerController(model);
            DefaultTableModel tableModel = null;

            switch (searchCriteria) {
                case "Booking ID" -> {
                    try {
                        int BookingID = Integer.parseInt(searchOption);
                        tableModel = managerController.getBookingTableModelByID(BookingID);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Booking ID must be a valid number. Please try again.", "Input Mismatch", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }

                case "NIC / Passport" -> {
                    try {
                        tableModel = managerController.getBookingTableModelByNIC(searchOption);
                    } catch (InputMismatchException e) {
                        JOptionPane.showMessageDialog(this, "No Record Found", "Input Mismatch", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }

                case "Room ID" -> {
                    try {
                        int roomID = Integer.parseInt(searchOption);
                        tableModel = managerController.getBookingTableModelByRoomID(roomID);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "RoomID must be a valid number. Please try again.", "Input Mismatch", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }

                default -> {
                    JOptionPane.showMessageDialog(this, "Please select a valid search criteria.");
                    break;
                }
            }

            if (tableModel.getRowCount() > 0) {
                tbl_inventory.setModel(tableModel);
            } else {
                JOptionPane.showMessageDialog(this, "No Records Found.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Uknown error! Please try again later");
        }

    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_todayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_todayActionPerformed

        ManagerModel model = new ManagerModel();
        ManagerController managerController = new ManagerController(model);
        DefaultTableModel tableModel = managerController.getTodayBookingTableModel();

        tbl_inventory.setModel(tableModel);

        if (tableModel.getRowCount() > 0) {
            tbl_inventory.setModel(tableModel);
        } else {
            JOptionPane.showMessageDialog(this, "No Records Found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_todayActionPerformed

    private void btn_lastMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastMonthActionPerformed

        ManagerModel model = new ManagerModel();
        ManagerController managerController = new ManagerController(model);
        DefaultTableModel tableModel = managerController.getMonthBookingTableModel();

        tbl_inventory.setModel(tableModel);

        if (tableModel.getRowCount() > 0) {
            tbl_inventory.setModel(tableModel);
        } else {
            JOptionPane.showMessageDialog(this, "No Records Found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_lastMonthActionPerformed

    private void btn_AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AllActionPerformed

        ManagerModel model = new ManagerModel();
        ManagerController managerController = new ManagerController(model);
        DefaultTableModel tableModel = managerController.getMonthBookingTableModel();

        tbl_inventory.setModel(tableModel);

        if (tableModel.getRowCount() > 0) {
            tbl_inventory.setModel(tableModel);
        } else {
            JOptionPane.showMessageDialog(this, "No Records Found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_AllActionPerformed

    private void btn_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_statusActionPerformed

        String getBookingID = txt_status.getText();

        if (getBookingID.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Please enter a valid Booking ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model1 = (DefaultTableModel) tbl_status.getModel();
        model1.setRowCount(0);

        try {
            int BookingID = Integer.parseInt(getBookingID);
            ManagerModel model = new ManagerModel();
            ManagerController managerController = new ManagerController(model);

            String welcomeMessage = managerController.getWelcomeMessage(BookingID);
            lbl_setname.setText(welcomeMessage);
            String[] customerDetails = managerController.getCustomerDetails(BookingID);

            if (customerDetails != null) {
                // Set the text fields to display the contact details
                txt_unic.setText(customerDetails[0]);
                txt_umob.setText(customerDetails[1]);
                txt_uema.setText(customerDetails[2]);
            }
            DefaultTableModel tableModel = managerController.getBookingSatus(BookingID);

            tbl_status.setModel(tableModel);

            if (tableModel.getRowCount() > 0) {
                tbl_status.setModel(tableModel);
            } else {
                JOptionPane.showMessageDialog(this, "No Records Found.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {

            throw new InputMismatchException("Booking ID must be a valid number. Please try again.");
        } catch (InputMismatchException e) {

            JOptionPane.showMessageDialog(this, e.getMessage(), "Input Mismatch", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btn_statusActionPerformed

    private void btn_checkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkinActionPerformed

        String bookingIDStr = txt_status.getText();

        if (bookingIDStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Booking ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {

            int bookingID = Integer.parseInt(bookingIDStr);

            ManagerModel model = new ManagerModel();
            ManagerController managerController = new ManagerController(model);

            boolean CancelStatus = managerController.checkCanceltStatus(bookingID);

            if (CancelStatus) {
                JOptionPane.showMessageDialog(this, "Cannot check-in. Booking is Cancelled.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Integer result = managerController.updateCheckInStatus(bookingID);

            if (result != null && result > 0) {
                JOptionPane.showMessageDialog(this, "Check-in successful.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to check-in. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Booking ID must be a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_checkinActionPerformed

    private void btn_checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkoutActionPerformed
        String getBookingID = txt_status.getText();

        if (getBookingID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Booking ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {

            int BookingID = Integer.parseInt(getBookingID);

            ManagerModel model = new ManagerModel();
            ManagerController managerController = new ManagerController(model);

            boolean isCheckedIn = managerController.checkCheckInStatus(BookingID);
            boolean isBookingcancelled = managerController.checkCanceltStatus(BookingID);

            if (!isCheckedIn || isBookingcancelled) {
                JOptionPane.showMessageDialog(this, "Cannot check-out. Check-in not completed or Booking is Cancelled.", "Check-out Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int updateResult = managerController.updateBookingStatusToCheckedOut(BookingID);

            if (updateResult > 0) {
                int clearDatesResult = managerController.clearOccupiedDates(BookingID);

                if (clearDatesResult > 0) {
                    JOptionPane.showMessageDialog(this, "Check-out completed successfully!", "Check-out Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update room occupancy dates.", "System Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update booking status.", "System Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Booking ID format. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_checkoutActionPerformed

    private void txt_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_statusActionPerformed

        String searchOption = txt_status.getText();

        if (searchOption == null || searchOption.trim().isEmpty()) {

            DefaultTableModel model = (DefaultTableModel) tbl_status.getModel();
            model.setRowCount(0);
            JOptionPane.showMessageDialog(this, "Please enter a valid input.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_txt_statusActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed

        int bookingId = Integer.parseInt(txt_status.getText());

        ManagerModel model = new ManagerModel();
        ManagerController controller = new ManagerController(model);

        boolean bookingStatusUpdated = controller.updateBookingStatusToCancel(bookingId);
        if (!bookingStatusUpdated) {
            JOptionPane.showMessageDialog(this, "Failed to cancel booking status to 'Canceled'. Please try again.");
            return;
        }
        boolean bookingRoomDeleted = controller.deleteBookingRoom(bookingId);
        if (!bookingRoomDeleted) {
            JOptionPane.showMessageDialog(this, "Failed to cancel booking room details. Please try again.");
            return;
        }

        boolean bookingDeleted = controller.deleteBooking(bookingId);
        if (!bookingDeleted) {
            JOptionPane.showMessageDialog(this, "Failed to cancel booking. Please try again.");
            return;
        }

        JOptionPane.showMessageDialog(this, "Booking successfully canceled.");


    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        Dashboard d = new Dashboard();
        d.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_homeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

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
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_All;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_checkin;
    private javax.swing.JButton btn_checkout;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_lastMonth;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_status;
    private javax.swing.JButton btn_today;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_booking;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_setname;
    private javax.swing.JTable tbl_inventory;
    private javax.swing.JTable tbl_status;
    private javax.swing.JTextField txt_searchBooking;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_uema;
    private javax.swing.JTextField txt_umob;
    private javax.swing.JTextField txt_unic;
    // End of variables declaration//GEN-END:variables
}
