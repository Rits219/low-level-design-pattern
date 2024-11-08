package com.shrayansh.observerPattern.observer;

import com.shrayansh.observerPattern.observable.StockObservable;

public class EmailAlertNotificationObserver implements NotificationAlertObserver {
    StockObservable observable;

    public EmailAlertNotificationObserver(StockObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("email notification with" + observable);
    }
}
