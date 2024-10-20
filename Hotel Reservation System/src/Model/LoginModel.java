package Model;

import DB.DbConnection;
import java.sql.*;

public class LoginModel {

    public boolean validateLogin(String username, String password) {

        Connection con = DbConnection.getConnection();

        String query = "SELECT * FROM logindetails WHERE username = ? AND password = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, username);
            ps.setString(2, password); // Replace this line with the hashed password if using hashing

            ResultSet rs = ps.executeQuery();

            // If the result set has a value, it means the username and password are valid
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;  // Return false if credentials are invalid or an error occurs
    }
}