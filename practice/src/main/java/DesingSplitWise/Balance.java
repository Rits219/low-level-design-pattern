package DesingSplitWise;

public class Balance {
    private double totalOweAmount;
    private double totalGetBackAmount;

    public Balance() {
        this.totalGetBackAmount = 0;
        this.totalOweAmount = 0;
    }

    public double getTotalOweAmount() {
        return totalOweAmount;
    }

    public void setTotalGetBackAmount(double totalGetBackAmount) {
        this.totalGetBackAmount = totalGetBackAmount;
    }

    public void setTotalOweAmount(double totalOweAmount) {
        this.totalOweAmount = totalOweAmount;
    }

    public double getTotalGetBackAmount() {
        return totalGetBackAmount;
    }
}
