package org.example.observable;

import org.example.observer.StockNotificationObserver;

public interface StocksObservable {
    public void add(StockNotificationObserver notificationObserver);

    public void notifyObserver();

    public void remove(StockNotificationObserver notificationObserver);

    public void setStockCount(int count);

    public int getStockCount();

}
