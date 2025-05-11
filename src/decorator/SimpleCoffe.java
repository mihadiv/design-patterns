package src.decorator;

public class SimpleCoffe implements Beverage {

    private String producer;
    private float price;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void prepare() {
        if (producer == null) {
            System.out.println("Preparing house coffee...");
        } else {
            System.out.println("Preparing " + producer + " coffee...");
        }
    }

    @Override
    public void serve() {
        String label = (producer == null) ? "house coffee" : producer + " coffee";
        System.out.println("The " + label + " is served!");
    }
}
