package com.shrayansh.observerPattern;

import com.shrayansh.observerPattern.observable.IphoneStockObservable;
import com.shrayansh.observerPattern.observable.StockObservable;
import com.shrayansh.observerPattern.observer.EmailAlertNotificationObserver;
import com.shrayansh.observerPattern.observer.MobileAlertNotificationObserver;
import com.shrayansh.observerPattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneStockObservable();

        NotificationAlertObserver observer1 = new MobileAlertNotificationObserver(iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertNotificationObserver(iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertNotificationObserver(iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.updateStockCount(10);
        System.out.println("if i increase again");
        iphoneStockObservable.updateStockCount(10);


    }
}
