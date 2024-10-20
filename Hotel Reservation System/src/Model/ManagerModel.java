package Model;

import DB.DbConnection;  // Your custom DB connection class
import View.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ManagerModel {

    private final Connection con;

    public ManagerModel() {
        this.con = DbConnection.getConnection();
    }

    public DefaultTableModel getBookingTableModelByID(int bookingID) {
        String query = "SELECT * FROM Booking WHERE BookingID = ?";
        DefaultTableModel tableModel = new DefaultTableModel();

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, bookingID);
            ResultSet rs = ps.executeQuery();

            // Set column names for the table model
            tableModel.addColumn("BookingID");
            tableModel.addColumn("NIC");
            tableModel.addColumn("RoomID");
            tableModel.addColumn("CheckInDate");
            tableModel.addColumn("CheckOutDate");
            tableModel.addColumn("AmountToPay");

            // Add rows to the table model
            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("BookingID"),
                    rs.getString("NIC"),
                    rs.getInt("RoomID"),
                    rs.getDate("CheckInDate"),
                    rs.getDate("CheckOutDate"),
                    rs.getBigDecimal("AmountToPay")
                };
                tableModel.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tableModel;
    }

    // Method to fetch booking by NIC/Passport
    public DefaultTableModel getBookingTableModelByNIC(String nic) {
        String query = "SELECT * FROM Booking WHERE NIC = ?";
        DefaultTableModel tableModel = new DefaultTableModel();

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nic);
            ResultSet rs = ps.executeQuery();

            // Set column names for the table model
            tableModel.addColumn("BookingID");
            tableModel.addColumn("NIC");
            tableModel.addColumn("RoomID");
            tableModel.addColumn("CheckInDate");
            tableModel.addColumn("CheckOutDate");
            tableModel.addColumn("AmountToPay");

            // Add rows to the table model
            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("BookingID"),
                    rs.getString("NIC"),
                    rs.getInt("RoomID"),
                    rs.getDate("CheckInDate"),
                    rs.getDate("CheckOutDate"),
                    rs.getBigDecimal("AmountToPay")
                };
                tableModel.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tableModel;
    }

    
    public DefaultTableModel getBookingTableModelByRoomID(int roomID) {
        String query = "SELECT * FROM Booking WHERE RoomID = ?";
        DefaultTableModel tableModel = new DefaultTableModel();

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, roomID); 
            ResultSet rs = ps.executeQuery();

            
            tableModel.addColumn("BookingID");
            tableModel.addColumn("NIC");
            tableModel.addColumn("RoomID");
            tableModel.addColumn("CheckInDate");
            tableModel.addColumn("CheckOutDate");
            tableModel.addColumn("AmountToPay");

           
            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("BookingID"), 
                    rs.getString("NIC"), 
                    rs.getInt("RoomID"), 
                    rs.getDate("CheckInDate"), 
                    rs.getDate("CheckOutDate"), 
                    rs.getBigDecimal("AmountToPay") 
                };
                tableModel.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tableModel;
    }

    public DefaultTableModel getTodayBookingTableModel() {
        String query = "SELECT * FROM Booking WHERE CheckInDate = CURDATE()";
        DefaultTableModel tableModel = new DefaultTableModel();

        try {
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            tableModel.addColumn("BookingID");
            tableModel.addColumn("NIC");
            tableModel.addColumn("RoomID");
            tableModel.addColumn("CheckInDate");
            tableModel.addColumn("CheckOutDate");
            tableModel.addColumn("AmountToPay");

            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("BookingID"),
                    rs.getString("NIC"),
                    rs.getInt("RoomID"),
                    rs.getDate("CheckInDate"),
                    rs.getDate("CheckOutDate"),
                    rs.getBigDecimal("AmountToPay")
                };
                tableModel.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tableModel;
    }

    public DefaultTableModel getMonthBookingTableModel() {

        String query = "SELECT * FROM Booking WHERE CheckInDate >= CURDATE() - INTERVAL 30 DAY";
        DefaultTableModel tableModel = new DefaultTableModel();

        try {
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            tableModel.addColumn("BookingID");
            tableModel.addColumn("NIC");
            tableModel.addColumn("RoomID");
            tableModel.addColumn("CheckInDate");
            tableModel.addColumn("CheckOutDate");
            tableModel.addColumn("AmountToPay");

            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("BookingID"),
                    rs.getString("NIC"),
                    rs.getInt("RoomID"),
                    rs.getDate("CheckInDate"),
                    rs.getDate("CheckOutDate"),
                    rs.getBigDecimal("AmountToPay")
                };
                tableModel.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tableModel;
    }

    public DefaultTableModel getAllBookingTableModel() {

        String query = "SELECT * FROM Booking";
        DefaultTableModel tableModel = new DefaultTableModel();

        try {
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            tableModel.addColumn("BookingID");
            tableModel.addColumn("NIC");
            tableModel.addColumn("RoomID");
            tableModel.addColumn("CheckInDate");
            tableModel.addColumn("CheckOutDate");
            tableModel.addColumn("AmountToPay");

            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("BookingID"),
                    rs.getString("NIC"),
                    rs.getInt("RoomID"),
                    rs.getDate("CheckInDate"),
                    rs.getDate("CheckOutDate"),
                    rs.getBigDecimal("AmountToPay")
                };
                tableModel.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tableModel;
    }

    public DefaultTableModel getBookingSatus(int bookingID) {
        String query = "SELECT * FROM BookingStatus WHERE BookingID = ?";
        DefaultTableModel tableModel = new DefaultTableModel();

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, bookingID);
            ResultSet rs = ps.executeQuery();

            tableModel.addColumn("BookingID");
            tableModel.addColumn("CancelStatus");
            tableModel.addColumn("CheckedInStatus");
            tableModel.addColumn("CheckedOutStatus");

            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("BookingID"),
                    rs.getBoolean("CancelStatus"),
                    rs.getBoolean("CheckedInStatus"),
                    rs.getBoolean("CheckedOutStatus")
                };
                tableModel.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tableModel;
    }

    public boolean getCancelStatus(int bookingID) {
        String query = "SELECT CancelStatus FROM BookingStatus WHERE BookingID = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, bookingID);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getBoolean("CancelStatus");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public Integer updateBookingStatus(int bookingID, boolean checkedInStatus) {
        String query = "UPDATE BookingStatus SET CheckedInStatus = ? WHERE BookingID = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setBoolean(1, checkedInStatus);
            ps.setInt(2, bookingID);

            return ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean checkCheckInStatus(int bookingID) {
        String query = "SELECT * FROM BookingStatus WHERE BookingID = ?";

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, bookingID);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getBoolean("CheckedInStatus");
            }
        } catch (SQLException e) {
        }

        return false;
    }

    public int updateBookingStatusToCheckedOut(int bookingID) {
        String query = "UPDATE BookingStatus SET CheckedOutStatus = TRUE WHERE BookingID = ?";

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, bookingID);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public int clearOccupiedDates(int bookingID) {
        String query = "UPDATE BookingRoom SET OccupiedDateFrom = NULL, OccupiedDateTo = NULL WHERE BookingID = ?";

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, bookingID);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public boolean updateBookingStatusToCancel(int bookingId) {
        String query = "Update BookingStatus set cancelStatus = 1 WHERE BookingID = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, bookingId);
            int result = ps.executeUpdate();
            return result > 0; // Returns true if a record was deleted
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteBookingRoom(int bookingId) {
        String query = "DELETE FROM BookingRoom WHERE BookingID = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, bookingId);
            int result = ps.executeUpdate();
            return result > 0; // Returns true if a record was deleted
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteBooking(int bookingId) {
        String query = "DELETE FROM Booking WHERE BookingID = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, bookingId);
            int result = ps.executeUpdate();
            return result > 0; // Returns true if a record was deleted
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
   public String getWelcomeMessage(int bookingID) {
        String query = "SELECT FirstName, LastName, Gender FROM Customer WHERE BookID = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, bookingID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String gender = rs.getString("Gender");
                
                // Generate and return the welcome message
                String title = gender.equalsIgnoreCase("Female") ? "Ms." : "Mr.";
                return "Welcome " + title + " " + firstName + " " + lastName;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Customer not found for Booking ID: " + bookingID;  // Return error message if customer not found
    }
   
   public String[] getCustomerDetailsByBookingID(int bookingID) {
        String query = "SELECT NIC, Mobile, Email FROM Customer WHERE BookID = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, bookingID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nic = rs.getString("NIC");
                String mobile = rs.getString("Mobile");
                String email = rs.getString("Email");

                // Return NIC, Mobile, and Email as an array of strings
                return new String[]{nic, mobile, email};
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;  // Return null if customer not found or an error occurs
    }
}


