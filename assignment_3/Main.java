package assignment_3;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new Car("Sports Car");

        CarEnthusiast enthusiast1 = new CarEnthusiast("Enthusiast 1");
        CarEnthusiast enthusiast2 = new CarEnthusiast("Enthusiast 2");

        sportsCar.addObserver(enthusiast1);
        sportsCar.addObserver(enthusiast2);

        sportsCar.setSpeed(100); // Change the car's speed, observers will be notified.
        sportsCar.setSpeed(150);

        sportsCar.removeObserver(enthusiast2);

        sportsCar.setSpeed(200); // Only enthusiast1 will be notified.
    }
}
