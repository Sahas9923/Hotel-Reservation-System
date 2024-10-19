
package Controller;

import Model.CustomerModel;
import java.util.Date;
import javax.swing.JOptionPane;

public class CustomerController {

    private final CustomerModel model;

    public CustomerController(CustomerModel model) {
        this.model = model;
    }
    
    public boolean isValidNIC(String nic) {
        return nic.matches("\\d{9}[VX]") || nic.matches("\\d{12}");
    }


    public boolean isValidPassport(String passport) {
        return passport.matches("[A-Za-z0-9]{6,12}");  
    }

    
    public boolean isValidMobileNumber(String mobile) {
        return mobile.matches("\\d{10}");
    }

    
    public boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");  
    }

    
    public void processReservationAndPayment(Integer bookingId, int roomID, String checkInDate, String checkOutDate,
                                             double payment, String nic, String firstName, String lastName,
                                             String gender, String email, String mobile,Date paymentDate) {
        
        
        Integer customerInserted = model.insertCustomerDetails(bookingId, nic, firstName, lastName, gender, email, mobile);
        if (customerInserted == null || customerInserted <= 0) {
           
            return;
        }

        
        Integer bookingInserted = model.insertReservationDetails(roomID, checkInDate, checkOutDate, nic, payment);
        if (bookingInserted == null || bookingInserted <= 0) {
            JOptionPane.showMessageDialog(null, "Failed to add reservation. Please try again.");
            return;
        }

        
        Integer roomUpdated = model.updateRoomBookingDates(bookingId, roomID, checkInDate, checkOutDate);
        if (roomUpdated == null || roomUpdated <= 0) {
            JOptionPane.showMessageDialog(null, "Failed to add reservation. Please try again.");
            return;
        }

        
        Integer bookingStatusUpdated = model.updateBookingStatus(bookingId);
        if (bookingStatusUpdated == null || bookingStatusUpdated <= 0) {
            JOptionPane.showMessageDialog(null, "Failed to add reservation. Please try again.");
            return;
        }

        
        boolean paymentProcessed = model.processPayment(bookingId, payment, paymentDate);
        if (!paymentProcessed) {
            JOptionPane.showMessageDialog(null, "Failed to add reservation. Please try again.");
            return;
        }

    }

}