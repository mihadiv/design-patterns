package src.decorator;

// ConcreteDecorator
public class CoffeeWithMilk extends CoffeDecorator {

    public CoffeeWithMilk(Beverage beverage) {
        super(beverage);
    }

    public void addMilk() {
        System.out.println("Adding milk...");
    }

    @Override
    public void prepare() {
        super.prepare();
        addMilk();
    }
}
