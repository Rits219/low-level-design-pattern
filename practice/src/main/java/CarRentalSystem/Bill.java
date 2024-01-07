package CarRentalSystem;

public class Bill {
    int billId;
    Reservation reservation;
    boolean isPaid;
    double amount;

    public Bill(int billId, Reservation reservation) {
        this.billId = billId;
        this.reservation = reservation;
        this.isPaid = false;
        this.amount = computeBill(reservation);
    }

    //compute bill against reservation.
    public double computeBill(Reservation reservation) {
        long timeUsed = reservation.bookingTill - reservation.bookingTime;

        switch (reservation.reservationType) {
            case HOURLY -> {
                long hourUsed = timeUsed / (60 * 60 * 1000);
                return hourUsed * reservation.vehicle.getHourlyRentalPrice();
            }
            case DAILY -> {
                long dailyUsed = timeUsed / (60 * 60 * 1000 * 24);
                return dailyUsed * reservation.vehicle.getDailyRentalPrice();
            }
        }
        return 100;
    }
}
