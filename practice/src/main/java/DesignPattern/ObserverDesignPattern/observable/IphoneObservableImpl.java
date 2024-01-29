package DesignPattern.ObserverDesignPattern.observable;

import DesignPattern.ObserverDesignPattern.observer.StockNotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {
    List<StockNotificationObserver> notificationObserverList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(StockNotificationObserver notificationObserver) {
        notificationObserverList.add(notificationObserver);
    }

    @Override
    public void notifyObserver() {
        for (StockNotificationObserver observer : notificationObserverList
        ) {
            observer.update();
        }
    }

    @Override
    public void remove(StockNotificationObserver notificationObserver) {
        notificationObserverList.remove(notificationObserver);
    }

    @Override
    public void setStockCount(int count) {
        if (stockCount == 0 && count > 0) {
            notifyObserver();
        }
        stockCount = stockCount + count;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
