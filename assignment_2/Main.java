package assignment_2;

// Client code
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost of simple coffee: " + coffee.cost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost of coffee with milk: " + milkCoffee.cost());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost of coffee with milk and sugar: " + sugarMilkCoffee.cost());
    }
}