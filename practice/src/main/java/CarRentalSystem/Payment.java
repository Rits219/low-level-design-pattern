package CarRentalSystem;

public class Payment {
    int paymentId;
    Bill bill;

    public Payment(int paymentId, Bill bill) {
        this.paymentId = paymentId;
        this.bill = bill;
    }

    //pay bill.
    public void payBill(double amount) throws Exception {
        if (this.bill.amount > amount) {
            throw new Exception("less amount than expected");
        } else if (this.bill.amount < amount) {
            throw new Exception("more amount than expected");
        } else {
            this.bill.isPaid = true;
        }

    }

}
