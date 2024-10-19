package Controller;

import Model.ManagerModel;
import javax.swing.table.DefaultTableModel;

public class ManagerController {

    private final ManagerModel model;

    public ManagerController(ManagerModel model) {
        this.model = model;

    }

    public DefaultTableModel getBookingTableModelByID(int bookingID) {
        return model.getBookingTableModelByID(bookingID);  
    }

   
    public DefaultTableModel getBookingTableModelByNIC(String nic) {
        return model.getBookingTableModelByNIC(nic);  
    }

   
    public DefaultTableModel getBookingTableModelByRoomID(int roomID) {
        return model.getBookingTableModelByRoomID(roomID);  
    }

    public DefaultTableModel getTodayBookingTableModel() {
        return model.getTodayBookingTableModel();
    }

    public DefaultTableModel getMonthBookingTableModel() {
        return model.getMonthBookingTableModel();
    }

    public DefaultTableModel getAllBookingTableModel() {
        return model.getMonthBookingTableModel();
    }

    public DefaultTableModel getBookingSatus(int bookingID) {
        return model.getBookingSatus(bookingID);
    }

    public boolean checkCanceltStatus(int bookingID) {
        return model.getCancelStatus(bookingID);  
    }

    
    public Integer updateCheckInStatus(int bookingID) {
        return model.updateBookingStatus(bookingID, true);  
    }

    public boolean checkCheckInStatus(int bookingID) {
        return model.checkCheckInStatus(bookingID);
    }

    public int updateBookingStatusToCheckedOut(int bookingID) {
        return model.updateBookingStatusToCheckedOut(bookingID);  
    }

    public int clearOccupiedDates(int bookingID) {
        return model.clearOccupiedDates(bookingID);  
    }
    
     public boolean updateBookingStatusToCancel(int bookingID) {
        return model.updateBookingStatusToCancel(bookingID);  
    }

    
    public boolean deleteBookingRoom(int bookingID) {
        return model.deleteBookingRoom(bookingID);  
    }

    
    public boolean deleteBooking(int bookingID) {
        return model.deleteBooking(bookingID); 

}
    }
