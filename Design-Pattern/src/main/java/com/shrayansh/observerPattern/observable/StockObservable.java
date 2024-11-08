package com.shrayansh.observerPattern.observable;

import com.shrayansh.observerPattern.observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver obj);
    void remove(NotificationAlertObserver obj);
    void sendNotification();
    void updateStockCount(int StockCount);
    int getStockCount();
}
