/* package MidtermPreparationLecture;

abstract class Item {
    private String name;
    private String barCode;
    private double price;

    public Item(String barcode, String name, double price) {
        this.name=name;
        this.barCode=barcode;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Milk extends Item{
    private double fat;

    public Milk(int fat) {
        super()
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }
}

enum HoneyType{
    BAGREMOV, LIVADSKI
}

class Honey extends Item{
    private HoneyType honeyType;

    public Honey(int barcode, String name, double price, HoneyType honeyType) {
        super(barcode,name,price);
        this.honeyType = honeyType;
    }

    public HoneyType getHoneyType() {

        return honeyType;
    }

    public void setHoneyType(HoneyType honeyType) {
        this.honeyType = honeyType;
    }
}

 */
