package Main;

import Controller.BookingController;
import Model.BookingModel;
import View.Booking;

public class Main {
    
    public static void main(String[] args) {
        
        BookingModel roomModel = new BookingModel();
        BookingController controller = new BookingController(roomModel);

        
        Booking view = new Booking(controller);

        
        view.setVisible(true);
    }
}
