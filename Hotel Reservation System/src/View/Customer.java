package View;

import Controller.BookingController;
import Controller.CustomerController;
import Model.CustomerModel;
import Model.BookingModel;
import java.awt.HeadlessException;
import java.util.Date;
import javax.swing.JOptionPane;

public class Customer extends javax.swing.JFrame {

    private Integer roomID;
    private String checkInDate;
    private String checkOutDate;
    private Integer bookingId;
    private double payment;

    private CustomerModel customerModel = new CustomerModel();
    private CustomerController controller = new CustomerController(customerModel);

    public Customer(Integer bookingId, Integer roomID, String checkInDate, String checkOutDate, double payment) {

        this.roomID = roomID;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingId = bookingId;
        this.payment = payment;

        initComponents();

        lbl_payment.setText(String.format("%.2f", payment));
        lbl_BookingID.setText(String.format("%d", bookingId));
        lbl_roomID.setText(String.format("%d", roomID));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_cnacel = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_confirm = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txt_mobile = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_nic = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_fn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_ln = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_cn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        date_ed = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txt_cvv = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_chn = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_BookingID = new javax.swing.JLabel();
        lbl_roomID = new javax.swing.JLabel();
        lbl_payment = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confirm Booking");
        setPreferredSize(new java.awt.Dimension(1004, 586));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cnacel.setBackground(new java.awt.Color(0, 51, 153));
        btn_cnacel.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_cnacel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cnacel.setText("Cancel");
        btn_cnacel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cnacelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cnacel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 290, 40));

        btn_clear.setBackground(new java.awt.Color(0, 51, 153));
        btn_clear.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 300, 40));

        btn_confirm.setBackground(new java.awt.Color(0, 51, 153));
        btn_confirm.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_confirm.setForeground(new java.awt.Color(255, 255, 255));
        btn_confirm.setText("Confirm");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });
        getContentPane().add(btn_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 310, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel7.setText("We want to know few....");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 310, 30));

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel8.setText("The Grand Crecsent");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 270, 30));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel2.setText("Gender");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, -1, 31));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 98, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 98, -1));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setText("Mobile No:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, 31));

        txt_mobile.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        getContentPane().add(txt_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 150, 38));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, 31));

        txt_email.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, 150, 38));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setText("NIC / Passport");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 151, 31));

        txt_nic.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        getContentPane().add(txt_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 150, 38));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel6.setText("First Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, 31));

        txt_fn.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        getContentPane().add(txt_fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 150, 38));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, 31));

        txt_ln.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        getContentPane().add(txt_ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 150, 38));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel11.setText("Make Your Payment");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(140, 30, 200, 30);

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Card Number");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 80, 120, 30);
        jPanel1.add(txt_cn);
        txt_cn.setBounds(170, 80, 220, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahas Suraweers\\Desktop\\HOtel reservation system\\credit-card_7509780.png")); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 10, 70, 60);

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Expiary Date");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(170, 120, 100, 30);
        jPanel1.add(date_ed);
        date_ed.setBounds(270, 120, 120, 30);

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel15.setText("CVV");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(30, 120, 40, 30);
        jPanel1.add(txt_cvv);
        txt_cvv.setBounds(80, 120, 70, 30);

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel16.setText("Card Holder Name");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(30, 160, 130, 30);
        jPanel1.add(txt_chn);
        txt_chn.setBounds(170, 160, 220, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 440, 220));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel17.setText("Booking ID       :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel19.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel19.setText("Room ID           :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 170, 20));

        jLabel18.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel18.setText("To pay ");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 170, 31));

        lbl_BookingID.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_BookingID.setText("Booking ID");
        jPanel2.add(lbl_BookingID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        lbl_roomID.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_roomID.setText("Room ID           ");
        jPanel2.add(lbl_roomID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 100, -1));

        lbl_payment.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lbl_payment.setText("25000.00");
        jPanel2.add(lbl_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 100, 31));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 440, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        txt_fn.setText("");
        txt_ln.setText("");
        txt_email.setText("");
        txt_mobile.setText("");
        txt_nic.setText("");
        txt_cn.setText("");
        txt_cvv.setText("");
        txt_chn.setText("");
        date_ed.setDate(null);

        buttonGroup1.clearSelection();

    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_cnacelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cnacelActionPerformed

        BookingModel roomModel = new BookingModel();
        BookingController bookingController = new BookingController(roomModel);
        Booking b = new Booking(bookingController);
        b.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btn_cnacelActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed

        CustomerModel model = new CustomerModel();
        CustomerController customerController = new CustomerController(model);

        String nic = txt_nic.getText();
        String firstName = txt_fn.getText();
        String lastName = txt_ln.getText();
        String email = txt_email.getText();
        String mobile = txt_mobile.getText();

        if (!customerController.isValidNIC(nic) && !customerController.isValidPassport(nic)) {
            JOptionPane.showMessageDialog(this, "Invalid NIC or Passport number. Please enter a valid Sri Lankan NIC or Passport.");
            return;
        }

        if (!customerController.isValidMobileNumber(mobile)) {
            JOptionPane.showMessageDialog(this, "Invalid mobile number. Please enter a 10-digit mobile number.");
            return;
        }

        if (!customerController.isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Invalid email format. Please enter a valid email address.");
            return;
        }

        String gender = null;
        if (jRadioButton1.isSelected()) {
            gender = "Male";  
        } else if (jRadioButton2.isSelected()) {
            gender = "Female";  
        } else {
            JOptionPane.showMessageDialog(this, "Please select a gender.");
            return;
        }

        if (firstName.isEmpty() || lastName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "First Name or Last Name cannot be empty.");
            return;
        }

        String cardNumberStr = txt_cn.getText();
        String cvvStr = txt_cvv.getText();
        Date expiryDate = date_ed.getDate();
        String cardholderName = txt_chn.getText();
        Date currentDate = new Date();

        if (cardNumberStr.isEmpty() || cvvStr.isEmpty() || cardholderName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all payment details.");
            return;
        }

        if (cvvStr.length() != 3 || !cvvStr.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "CVV must be exactly 3 digits.");
            return;
        }

        if (expiryDate.before(currentDate)) {
            JOptionPane.showMessageDialog(this, "Expiry date must be after the current date.");
            return;
        }        

        customerController.processReservationAndPayment(
                bookingId, roomID, checkInDate, checkOutDate, payment,
                nic, firstName, lastName, gender, email, mobile, currentDate);

        JOptionPane.showMessageDialog(this, "Reservation and payment processed successfully! call our HOTLINE for more details");
        
        BookingModel roomModel = new BookingModel();
        BookingController bookingController = new BookingController(roomModel);
        Booking b = new Booking(bookingController);
        b.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_confirmActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_cnacel;
    private javax.swing.JButton btn_confirm;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser date_ed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lbl_BookingID;
    private javax.swing.JLabel lbl_payment;
    private javax.swing.JLabel lbl_roomID;
    private javax.swing.JTextField txt_chn;
    private javax.swing.JTextField txt_cn;
    private javax.swing.JTextField txt_cvv;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fn;
    private javax.swing.JTextField txt_ln;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_nic;
    // End of variables declaration//GEN-END:variables
}
