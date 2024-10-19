package Model;

import DB.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class CustomerModel {

    private final Connection con = DbConnection.getConnection();

    public Integer insertCustomerDetails(Integer bookingId, String nic, String firstName, String lastName, String gender, String email, String mobile) {
        String query = "INSERT INTO Customer (BookID, NIC, FirstName, LastName, Gender, Email, Mobile) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, bookingId);        
            ps.setString(2, nic);          
            ps.setString(3, firstName);     
            ps.setString(4, lastName);     
            ps.setString(5, gender);        
            ps.setString(6, email);         
            ps.setString(7, mobile);        

            return ps.executeUpdate();  
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    
    public Integer insertReservationDetails(int roomID, String checkInDate, String checkOutDate, String nic, Double payment) {
        String query = "INSERT INTO Booking (RoomID, CheckInDate, CheckOutDate, NIC, AmountToPay) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, roomID);                       
            ps.setString(2, checkInDate);               
            ps.setString(3, checkOutDate);              
            ps.setString(4, nic);                       
            ps.setDouble(5, payment);          

            return ps.executeUpdate();  
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Integer updateRoomBookingDates(int bookingID, int roomID, String checkInDate, String checkOutDate) {
        String query = "INSERT INTO BookingRoom (BookingID, RoomID, OccupiedDateFrom, OccupiedDateTo) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, bookingID);  
            ps.setInt(2, roomID);     
            ps.setString(3, checkInDate);  
            ps.setString(4, checkOutDate);  

            return ps.executeUpdate();  
        } catch (SQLException e) {
            e.printStackTrace();
            return null;  
        }
    }

    public Integer updateBookingStatus(int bookingID) {
        String query = "INSERT INTO BookingStatus (BookingID, CheckedInStatus, CheckedOutStatus, CancelStatus) "
                + "VALUES (?, FALSE, FALSE, FALSE) ";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, bookingID);  
            return ps.executeUpdate();  
        } catch (SQLException e) {
            e.printStackTrace();
            return null;  
        }
    }

    public boolean processPayment(int bookingId, double payment, Date paidDate) {
        String query = "INSERT INTO payment (booking_id, paid_amount, paid_date) VALUES (?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, bookingId);
            ps.setDouble(2, payment);
            ps.setDate(3, new java.sql.Date(paidDate.getTime()));

            return ps.executeUpdate() > 0;  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
}
