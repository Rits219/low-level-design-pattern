package DesignPattern.ObserverDesignPattern.observable;

import DesignPattern.ObserverDesignPattern.observer.StockNotificationObserver;

public interface StocksObservable {
    public void add(StockNotificationObserver notificationObserver);

    public void notifyObserver();

    public void remove(StockNotificationObserver notificationObserver);

    public void setStockCount(int count);

    public int getStockCount();

}
