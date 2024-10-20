/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Report;

import View.Dashboard;
import java.sql.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Report1 extends javax.swing.JFrame {

    public Report1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_bookingsPerMonth = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton1.setText("Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 140, 50));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setText("Room Detail Report");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 210, 40));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel2.setText("Customer Detail Report");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 240, 70));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setText("View Reports");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 130, 40));

        btn_bookingsPerMonth.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        btn_bookingsPerMonth.setText("Load");
        btn_bookingsPerMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookingsPerMonthActionPerformed(evt);
            }
        });
        getContentPane().add(btn_bookingsPerMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 140, 50));

        jButton4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton4.setText("Load");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 140, 50));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setText("Revenue Report");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 210, 40));

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sahas Suraweers\\Desktop\\HOtel reservation system\\home-button.png")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 60, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String dbloc = "jdbc:mysql://localhost/hotel";
            String dbUname = "root";
            String dbpw = "";

            Connection con = DriverManager.getConnection(dbloc, dbUname, dbpw);

            JasperDesign jasperdesign = JRXmlLoader.load("C:\\Users\\Sahas Suraweers\\Documents\\GitHub\\Hotel-Reservation-System\\Hotel Reservation System\\src\\Report\\Customer.jrxml");

            JRDesignQuery jrdQuery = new JRDesignQuery();
            jrdQuery.setText("""
                             SELECT c.*, 
                                    b.CheckInDate, 
                                    b.CheckOutDate, 
                                    r.RoomCategory
                             FROM Customer c
                             LEFT JOIN Booking b ON c.BookID = b.BookingID
                             LEFT JOIN Room r ON b.RoomID = r.RoomID;""");

            jasperdesign.setQuery(jrdQuery);

            
            JasperReport reservation = JasperCompileManager.compileReport(jasperdesign);

            
            JasperPrint print1 = JasperFillManager.fillReport(reservation, null, con);

            
            JasperViewer.viewReport(print1);

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Available Device Report Exception " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_bookingsPerMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookingsPerMonthActionPerformed
        try {
            String dbloc = "jdbc:mysql://localhost/hotel";
            String dbUname = "root";
            String dbpw = "";

            Connection con = DriverManager.getConnection(dbloc, dbUname, dbpw);

            JasperDesign jasperdesign = JRXmlLoader.load("C:\\Users\\Sahas Suraweers\\Documents\\GitHub\\Hotel-Reservation-System\\Hotel Reservation System\\src\\Report\\MonthlyRevenue.jrxml");

            JRDesignQuery jrdQuery = new JRDesignQuery();
            jrdQuery.setText("""
                             SELECT MONTH(CheckInDate) AS Month, YEAR(CheckInDate) AS Year, 
                                    SUM(AmountToPay) AS TotalRevenue
                             FROM Booking
                             WHERE MONTH(CheckInDate) = MONTH(CURDATE()) 
                               AND YEAR(CheckInDate) = YEAR(CURDATE())
                             GROUP BY MONTH(CheckInDate), YEAR(CheckInDate);""");

            jasperdesign.setQuery(jrdQuery);

           
            JasperReport reservation = JasperCompileManager.compileReport(jasperdesign);

            
            JasperPrint print1 = JasperFillManager.fillReport(reservation, null, con);

            
            JasperViewer.viewReport(print1);

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Available Device Report Exception " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_bookingsPerMonthActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String dbloc = "jdbc:mysql://localhost/hotel";
            String dbUname = "root";
            String dbpw = "";

            Connection con = DriverManager.getConnection(dbloc, dbUname, dbpw);

            JasperDesign jasperdesign = JRXmlLoader.load("C:\\Users\\Sahas Suraweers\\Documents\\GitHub\\Hotel-Reservation-System\\Hotel Reservation System\\src\\Report\\RoomDetail.jrxml");

            JRDesignQuery jrdQuery = new JRDesignQuery();
            jrdQuery.setText("""
                             SELECT MONTH(b.CheckInDate) AS MONTH,
                                    YEAR(b.CheckInDate) AS YEAR,
                                    r.RoomCategory,
                                    r.RoomType,
                                    COUNT(*) AS TotalBookings
                             FROM Booking b
                             JOIN Room r ON b.RoomID = r.RoomID
                             GROUP BY MONTH(b.CheckInDate), YEAR(b.CheckInDate), r.RoomCategory, r.RoomType
                             ORDER BY YEAR, MONTH, r.RoomCategory, r.RoomType;""");

            jasperdesign.setQuery(jrdQuery);

            
            JasperReport reservation = JasperCompileManager.compileReport(jasperdesign);

           
            JasperPrint print1 = JasperFillManager.fillReport(reservation, null, con);

            
            JasperViewer.viewReport(print1);

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Available Device Report Exception " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        Dashboard d = new Dashboard();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bookingsPerMonth;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
