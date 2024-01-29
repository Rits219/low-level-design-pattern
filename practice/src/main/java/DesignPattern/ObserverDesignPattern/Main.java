package DesignPattern.ObserverDesignPattern;

import DesignPattern.ObserverDesignPattern.observable.IphoneObservableImpl;
import DesignPattern.ObserverDesignPattern.observer.EmailNotificationObserverImpl;
import DesignPattern.ObserverDesignPattern.observer.MobileNotificationObserverImpl;

public class Main {
    public static void main(String[] args) {
        IphoneObservableImpl iphoneObservable = new IphoneObservableImpl();
        EmailNotificationObserverImpl user1 = new EmailNotificationObserverImpl("xyz_123@gamil.com", iphoneObservable);
        EmailNotificationObserverImpl user2 = new EmailNotificationObserverImpl("xyz_2@gamil.com", iphoneObservable);
        MobileNotificationObserverImpl user3 = new MobileNotificationObserverImpl("6263972601", iphoneObservable);


        iphoneObservable.add(user1);
        iphoneObservable.add(user2);
        iphoneObservable.add(user3);

        iphoneObservable.setStockCount(30);

        iphoneObservable.remove(user2);
        iphoneObservable.notifyObserver();

    }
}