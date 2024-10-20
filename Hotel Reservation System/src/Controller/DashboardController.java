package Controller;

import Model.DashboardModel;

public class DashboardController {

    private final DashboardModel model;

    public DashboardController(DashboardModel model) {
        this.model = model;
    }

    public int getTotalReservationsForToday() {
        return model.getTotalReservationsForToday();
    }
}
