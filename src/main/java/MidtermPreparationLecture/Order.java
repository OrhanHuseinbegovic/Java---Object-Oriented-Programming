/*
package MidtermPreparationLecture;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Order {
    private Date createadAt;
    private String orderNo;
    private List<Order> items;

    public Order(Date createadAt, String orderNo, List<Order> items) {
        this.createadAt = createadAt;
        this.orderNo = orderNo;
        this.items = items;
    }

    public Date getCreateadAt() {
        return createadAt;
    }

    public void setCreateadAt(Date createadAt) {
        this.createadAt = createadAt;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public List<Order> getItems() {
        return items;
    }

    public void setItems(List<Order> items) {
        this.items = items;
    }
}

class MainRun{
    public static void main(String[] args) {
        HashMap<Item,Integer> itemList = new HashMap<>();
        itemList.put(new Honey("123","Pravi med", 30),2);
        itemList.put(new Milk("222","Meggle",2.70,3.18), 5);

        List<HashMap<Item,Integer>> items = new ArrayList<>();
        order.add(itemList);
        Order firstOrder = new Order(
                String.valueOf(1),
                new Date(System.currentTimeMillis()),
                items
        );


        Person becir = new Person("Becir",29,Arrays.asList(firstOrder));
    }
}

 */
