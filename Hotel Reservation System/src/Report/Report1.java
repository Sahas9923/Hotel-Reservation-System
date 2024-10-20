/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Report;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jButton1.setText("Load Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 23, 246, 74));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            String dbloc = "jdbc:mysql://localhost/hotel";
            String dbUname = "root";
            String dbpw = "";
            
            Connection con = DriverManager.getConnection(dbloc , dbUname , dbpw);
            
            JasperDesign jasperdesign = JRXmlLoader.load("C:\\Users\\Sahas Suraweers\\Documents\\GitHub\\Hotel-Reservation-System\\Hotel Reservation System\\src\\Report\\reservation.jrxml");
            
            JRDesignQuery jrdQuery = new JRDesignQuery();
            jrdQuery.setText("SELECT * FROM booking ");
            
            jasperdesign.setQuery(jrdQuery);
            
            //Compile the report
            JasperReport reservation = JasperCompileManager.compileReport(jasperdesign);
     
            //Fill the Report
            JasperPrint print1 = JasperFillManager.fillReport(reservation , null , con);
            
            //View the Report in Non Model ----> when we are using this , all program not close when close the report
            //That Meaning is only report is Close. program not close
            JasperViewer.viewReport(print1);

            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Available Device Report Exception " + e , "Error" , JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
