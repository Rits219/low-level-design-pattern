package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.StocksObservable;

public class MobileNotificationObserverImpl implements StockNotificationObserver {
    private final String phoneNumer;
    private final StocksObservable observable;

    public MobileNotificationObserverImpl(String phoneNumer, StocksObservable observable) {
        this.phoneNumer = phoneNumer;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("mobile notification sent to " + phoneNumer + "for this observable" + observable);
    }
}
