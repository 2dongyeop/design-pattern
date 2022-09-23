package Chapter12.combining;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observer;

public class Observable implements QuackObservable {
    List<Chapter12.combining.Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Chapter12.combining.Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();

        while (iterator.hasNext()) {
            Chapter12.combining.Observer observer = (Chapter12.combining.Observer) iterator.next();
            observer.update(duck);
        }
    }
}
