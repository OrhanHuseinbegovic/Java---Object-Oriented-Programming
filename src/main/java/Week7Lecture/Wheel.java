package Week7Lecture;

public class Wheel extends Component{
    private int diameter;

    public Wheel(int diameter, String serialNumber){
        super(serialNumber);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void say(){
        System.out.println("Wheel eating");
    }
}
