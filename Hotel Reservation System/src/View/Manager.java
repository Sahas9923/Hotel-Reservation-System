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
        txt_status = new javax.swing.JTextField();
        btn_status = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_status = new javax.swing.JTable();
        btn_checkin = new javax.swing.JButton();
        btn_checkout = new javax.swing.JButton();
        cmb_booking = new javax.swing.JComboBox<>();
        txt_searchBooking = new javax.swing.JTextField();
        btn_lastMonth = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_inventory = new javax.swing.JTable();
        btn_All = new javax.swing.JButton();
        btn_today = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_status.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txt_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_statusActionPerformed(evt);
            }
        });
        getContentPane().add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 230, 40));

        btn_status.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_status.setText("Search");
        btn_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_statusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, 120, 40));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 520, 110));

        btn_checkin.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_checkin.setText("Checked In");
        btn_checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkinActionPerformed(evt);
            }
        });
        getContentPane().add(btn_checkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 140, 40));

        btn_checkout.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_checkout.setText("Checked Out");
        btn_checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 510, 160, 40));

        cmb_booking.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        cmb_booking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booking ID", "NIC / Passport", "Room ID" }));
        cmb_booking.setSelectedIndex(1);
        getContentPane().add(cmb_booking, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 190, 40));

        txt_searchBooking.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        getContentPane().add(txt_searchBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 270, 40));

        btn_lastMonth.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_lastMonth.setText("Last 30 Days");
        btn_lastMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastMonthActionPerformed(evt);
            }
        });
        getContentPane().add(btn_lastMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 200, 42));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 590, 362));

        btn_All.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_All.setText("All Bookings");
        btn_All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AllActionPerformed(evt);
            }
        });
        getContentPane().add(btn_All, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 510, 180, 42));

        btn_today.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_today.setText("Today");
        btn_today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_todayActionPerformed(evt);
            }
        });
        getContentPane().add(btn_today, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 170, 42));

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel12.setText("Booking ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 120, 40));

        btn_search.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 100, 40));

        btn_cancel.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 170, 40));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setText("Email");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 130, 40));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel5.setText("Mobile");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 130, 40));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 260, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 260, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 260, 30));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setText("NIC / Passport");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 150, 40));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 320, 40));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_All;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_checkin;
    private javax.swing.JButton btn_checkout;
    private javax.swing.JButton btn_lastMonth;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_status;
    private javax.swing.JButton btn_today;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_booking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tbl_inventory;
    private javax.swing.JTable tbl_status;
    private javax.swing.JTextField txt_searchBooking;
    private javax.swing.JTextField txt_status;
    // End of variables declaration//GEN-END:variables
}
