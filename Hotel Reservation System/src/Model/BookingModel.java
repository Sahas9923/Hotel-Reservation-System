package Model;

import DB.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingModel {

    public Integer getAvailableRoom(String checkInDate, String checkOutDate, String roomCategory, String roomType) {
        Connection con = DbConnection.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        Integer roomID = null;

        try {

            String query = "SELECT r.RoomID "
                    + "FROM Room r "
                    + "LEFT JOIN BookingRoom br ON r.RoomID = br.RoomID "
                    + "AND (br.OccupiedDateFrom <= ? AND br.OccupiedDateTo >= ?) "
                    + "WHERE br.RoomID IS NULL "
                    + "AND r.RoomCategory = ? "
                    + "AND r.RoomType = ? "
                    + "LIMIT 1";

            
            pst = con.prepareStatement(query);
            pst.setString(1, checkInDate);
            pst.setString(2, checkOutDate);
            pst.setString(3, roomCategory);
            pst.setString(4, roomType);

            rs = pst.executeQuery();

            
            if (rs.next()) {
                roomID = rs.getInt("RoomID");
            }

        } catch (SQLException ex) {
           
            ex.printStackTrace();
        } finally {
            
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return roomID;
    }

    public Integer getNextBookingID() {
        Connection con = DbConnection.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        Integer nextBookingID = null;

        try {
            
            String query = "SELECT COALESCE(MAX(BookingID), 0) + 1 AS NextBookingID FROM Booking";

            
            pst = con.prepareStatement(query);

            
            rs = pst.executeQuery();

            
            if (rs.next()) {
                nextBookingID = rs.getInt("NextBookingID");
            }

        } catch (SQLException ex) {
            
            ex.printStackTrace();
        } finally {
            // Close all connections and statements
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        
        return nextBookingID;
    }

    public Double getRoomPayment(Integer roomID, String roomCategory, String roomType) {
        Connection con = DbConnection.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        Double payment = null;

        try {
            
            String query = "SELECT Payment "
                    + "FROM Room "
                    + "WHERE RoomID = ? AND RoomCategory = ? AND RoomType = ?";

            
            pst = con.prepareStatement(query);
            pst.setInt(1, roomID);
            pst.setString(2, roomCategory);
            pst.setString(3, roomType);

            
            rs = pst.executeQuery();

            
            if (rs.next()) {
                payment = rs.getDouble("Payment");
            }

        } catch (SQLException ex) {
           
            ex.printStackTrace();
        } finally {
            
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        
        return payment;
    }
}
