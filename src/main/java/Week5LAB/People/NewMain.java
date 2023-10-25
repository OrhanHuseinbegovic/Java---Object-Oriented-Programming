package Week5LAB.People;

public class NewMain {
    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.getCredits());
        olli.study();
        System.out.println("credits "+ olli.getCredits());
    }
}
