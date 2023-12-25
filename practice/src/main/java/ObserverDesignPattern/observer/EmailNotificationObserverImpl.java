package ObserverDesignPattern.observer;

import ObserverDesignPattern.observable.StocksObservable;

public class EmailNotificationObserverImpl implements StockNotificationObserver {
    private final String emailId;
    private final StocksObservable observable;

    public EmailNotificationObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("email notification sent to " + this.emailId + "for this observable" + this.observable);
    }
}
