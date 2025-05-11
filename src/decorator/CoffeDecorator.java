package src.decorator;

public class CoffeDecorator implements Beverage {

    private Beverage beverage;

    public CoffeDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void prepare() {
        beverage.prepare();
    }

    @Override
    public void serve() {
        beverage.serve();
    }
}
