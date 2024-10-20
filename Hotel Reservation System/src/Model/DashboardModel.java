
package Model;

import DB.DbConnection;
import java.sql.*;

public class DashboardModel {
   
    public int getTotalReservationsForToday() {
        String query = "SELECT COUNT(*) AS TotalReservations FROM Booking WHERE CheckInDate = CURDATE()";
        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("TotalReservations");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;  // Return 0 if no reservations found or if an error occurs
    }
}

