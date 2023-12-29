package Week13.Lab.Task6;

import java.util.List;

public class Coffee{
    private String type;
    public String size;
    private List<String> toppings;

    public Coffee(String type, String size, List<String> toppings) {
        this.type = type;
        this.size = size;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
