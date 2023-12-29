package Week13.Lab.Task6;

public class CappuccinoBuilder implements CoffeeBuilder{
    private Coffee coffee = new Coffee("Cappuccino", "", null);

    @Override
    public void buildType() {
        // Cappuccino-specific type logic
    }

    @Override
    public void buildSize() {
        coffee.size = "Large";
    }

    @Override
    public void buildToppings() {
        // Cappuccino-specific toppings logic
    }
    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
