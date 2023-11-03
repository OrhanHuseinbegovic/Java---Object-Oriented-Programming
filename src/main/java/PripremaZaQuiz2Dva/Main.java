//PERSON CLASS
class Person{
    private MaleFemale maleFemale;
    private int age;
    private String nameSurname;

    //CONSTRUCTOR
    Person(MaleFemale mF, int ag, String nS){
        this.maleFemale = mF;
        this.age = ag;
        this.nameSurname = nS;
    }

    Person(String nS){
        this.nameSurname = nS;
    }

    Person(){

    }

    //GETTERS
    public String getNameSurname(){
        return this.nameSurname;
    }
    public int getAge(){
        return this.age;
    }
    public MaleFemale getGender(){
        return this.maleFemale;
    }

    //SETTERS
    public void setNameSurname(String nameS){
        this.nameSurname = nameS;
    }
    public void setGender(MaleFemale maleF){
        this.maleFemale = maleF;
    }
    public void setAge(int a){
        this.age = a;
    }

    //toStringMethod
    @Override
    public String toString(){
        return "AGE: "+this.getAge()+"\nGENDER: "+this.getGender()+"\nNAME AND SURNAME: "+this.getNameSurname();
    }

    public void saySomething(){
        System.out.println("Hi Im a person");
    }
}

//STUDENT CLASS
class Student extends Person{
    private String studentId;

    //CONSTRUCTOR
    Student(MaleFemale mF, int agee, String nS, String stId){
        super(mF,agee,nS);
        this.studentId = stId;
    }

    Student(String Ns, String StId){
        super(Ns);
        this.studentId = StId;
    }

    Student(String studentId){
        super();
        this.studentId = studentId;
    }



    //GETTERS
    public String getStudentId(){
        return this.studentId;
    }
    //SETTERS
    public void setStudentId(String stId){
        this.studentId = stId;
    }

    @Override
    public void saySomething(){
        System.out.println("Hi Im A Student");
    }


}

//PROFFESSOR CLASS
class Proff extends Person{
    private String proffId;

    Proff(MaleFemale mFF, int agg, String nSS, String prId){
        super(mFF,agg,nSS);
        this.proffId = prId;
    }

    Proff(String nS){
        super(nS);
    }


    //GETTERS
    public String getProfId(){
        return this.proffId;
    }

    //SETTERS
    public void setProfId(String newProfId){
        this.proffId = newProfId;
    }

    @Override
    public String toString(){
        return "Overrided just name PROFF: "+this.getNameSurname()+"And SUPER: "+super.toString();
    }

    @Override
    public void saySomething(){
        System.out.println("Hi Im a proffesosor");
    }

}

class Main{
    public static void main(String[] args){
        Student OrhanHuseinbegovic = new Student("Orhan Huseinbegovic","22022003");
        Student EminaHuseinbegovic = new Student(MaleFemale.FEMALE,26,"Emina Huseinbegovic","01031997");
        Proff DinoKeco = new Proff("Dino Keco");

        System.out.println(OrhanHuseinbegovic.toString());
        System.out.println("\n");
        System.out.println(DinoKeco.toString());
        System.out.println("\n");
        OrhanHuseinbegovic.setAge(5);
        System.out.println(OrhanHuseinbegovic.toString());
        System.out.println("\n");
        OrhanHuseinbegovic.setGender(MaleFemale.MALE);
        System.out.println(OrhanHuseinbegovic.toString());
        System.out.println("\n");
        OrhanHuseinbegovic.saySomething();
        System.out.println("\n");
        DinoKeco.saySomething();
        System.out.println("\n");
        DinoKeco.toString();

    }
}

enum MaleFemale{
    MALE, FEMALE
}
