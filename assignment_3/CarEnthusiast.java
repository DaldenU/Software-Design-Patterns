package assignment_3;

// Car Enthusiast (Concrete Observer)
class CarEnthusiast implements CarObserver {
    private String name;

    public CarEnthusiast(String name) {
        this.name = name;
    }

    @Override
    public void update(Car car) {
        System.out.println(name + " is observing the " + car.getName() + ". Speed: " + car.getSpeed() + " km/h");
    }
}
