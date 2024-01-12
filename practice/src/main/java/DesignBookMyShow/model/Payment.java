package DesignBookMyShow.model;

public class Payment {
    int paymentId;
    boolean isPaid;
    double amount;

    public Payment(int paymentId, boolean isPaid, double amount) {
        this.paymentId = paymentId;
        this.isPaid = isPaid;
        this.amount = amount;
    }
}
