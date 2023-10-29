package assignment_3;

import java.util.ArrayList;
import java.util.List;

// Car (Subject)
class Car {
    private String name;
    private int speed;
    private List<CarObserver> observers = new ArrayList<>();

    public Car(String name) {
        this.name = name;
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        notifyObservers();
    }

    public void addObserver(CarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CarObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (CarObserver observer : observers) {
            observer.update(this);
        }
    }
}