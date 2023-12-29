package Week13.Lab.Task6;

public class LatteBuilder implements CoffeeBuilder{
    private Coffee coffee = new Coffee("Latte", "", null);

    @Override
    public void buildType() {
        // Latte-specific type logic
    }

    @Override
    public void buildSize() {
        coffee.size = "Medium";
    }

    @Override
    public void buildToppings() {
        // Latte-specific toppings logic
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
