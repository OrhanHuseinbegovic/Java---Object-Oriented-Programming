package Week7Lecture;

public class Component {
    private String serialNumber;

    public Component(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void say(){
        System.out.println("Component said something");
    }
}
