package Week13.Lab.Task6;

public class EspressoBuilder implements CoffeeBuilder{
    private Coffee coffee = new Coffee("Espresso", "", null);

    @Override
    public void buildType() {
        // Espresso-specific type logic
        // Here, we can customize the type based on specific requirements
    }

    @Override
    public void buildSize() {
        coffee.size = "Small";
    }

    @Override
    public void buildToppings() {
        // Espresso-specific toppings logic
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
