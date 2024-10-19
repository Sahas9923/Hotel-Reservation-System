package Controller;

import Model.BookingModel;

public class BookingController {

    private final BookingModel model;

    public BookingController(BookingModel model) {
        this.model = model;
    }

    
    public Integer searchAvailableRoom(String checkInDate, String checkOutDate, String roomCategory, String roomType) {
        return model.getAvailableRoom(checkInDate, checkOutDate, roomCategory, roomType);
    }

    public Double getRoomPayment(Integer roomID, String roomCategory, String roomType) {
        return model.getRoomPayment(roomID, roomCategory, roomType);
    }

    public Integer getNextBookingID() {
        return model.getNextBookingID();
    }

}
