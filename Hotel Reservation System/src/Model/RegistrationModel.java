
package Model;


import DB.DbConnection;
import java.sql.*;

public class RegistrationModel {
    
    
    public boolean insertEmployee(String firstName, String lastName, String nic, String mobile, String email, String address) {
        String query = "INSERT INTO Employee (FirstName, LastName, NIC, PhoneNumber, Email, Address) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, nic);
            ps.setString(4, mobile);
            ps.setString(5, email);
            ps.setString(6, address);

            return ps.executeUpdate() > 0;  // Returns true if the record was inserted

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    public boolean insertLoginDetails(int employeeID, String username, String password) {
        String query = "INSERT INTO LoginDetails (EmployeeID, Username, Password) VALUES (?, ?, ?)";
        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            
            ps.setInt(1, employeeID);
            ps.setString(2, username);
            ps.setString(3, password);  // Password should be hashed before storing in real-world scenarios

            return ps.executeUpdate() > 0;  // Returns true if the record was inserted

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
}
