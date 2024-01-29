package DesignPattern.MediatorDesignPattern;

public interface Colleague {
    void placeBid(int bidAmount);

    void receiveNotifications(int bidAmount);

    String getName();
}
