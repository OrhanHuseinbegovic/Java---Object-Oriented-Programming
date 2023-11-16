interface FirstOne{
    public abstract String toSttring();
}

class Animal implements FirstOne{
    private String name;
    private int years;

    Animal(String name, int years){
        this.name = name;
        this.years = years;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setYears(int years){
        this.years = years;
    }
    public String getName(){
        return this.name;
    }
    public int getYears(){
        return this.years;
    }

    @Override
    public String toSttring(){
        return "Name: "+this.name+"\n Years: "+this.years;
    }
}

class Tiger implements FirstOne{
    private String tigerName;

    Tiger(String tigerName){
        this.tigerName = tigerName;
    }

    public void setTigerName(String name){
        this.tigerName = name;
    }
    public String getTigerName(){
        return this.tigerName;
    }
    @Override
    public String toSttring(){
        return "TIGER IMPLEMENTATION";
    }

}

class Mainn{
    public static void main(String[] args){
        Animal animal = new Animal("Orhan",20);
        Tiger tiger = new Tiger("Imran");

        System.out.println(tiger.toSttring());

        System.out.println(animal.toSttring());
    }
}