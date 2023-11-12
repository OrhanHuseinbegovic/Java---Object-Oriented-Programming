package Week7Lecture;

public class Motor extends Component{
    private int hp;

    public Motor(String serial) {
        super(serial);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Motor(String serialNumber, int hp) {
        super(serialNumber);
        this.hp = hp;
    }
}
