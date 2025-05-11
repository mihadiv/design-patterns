package src.decorator;

public class CoffeeWithSugar extends CoffeDecorator {

    private int sugarTeaspoons;

    public CoffeeWithSugar(Beverage beverage) {
        super(beverage);
    }

    public int getSugarTeaspoons() {
        return sugarTeaspoons;
    }

    public void setSugarTeaspoons(int sugarTeaspoons) {
        this.sugarTeaspoons = sugarTeaspoons;
    }
}
