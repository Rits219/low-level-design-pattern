package com.shrayansh.observerPattern.observable;

import com.shrayansh.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {
    List<NotificationAlertObserver> observerList;
    int stockCount;

    public IphoneStockObservable() {
        this.observerList = new ArrayList<>();
        this.stockCount = 0;
    }

    @Override
    public void add(NotificationAlertObserver obj) {
        this.observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        this.observerList.remove(obj);
    }

    @Override
    public void sendNotification() {
        this.observerList.forEach(
                NotificationAlertObserver::update
        );
    }

    @Override
    public void updateStockCount(int newStockCount) {
        if (this.stockCount == 0 && newStockCount > 0) {
            sendNotification();
        }
        this.stockCount = newStockCount;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }

    @Override
    public String toString() {
        return "I am iphone with stock count as " + this.stockCount;
    }
}
