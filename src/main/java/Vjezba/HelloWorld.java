package Vjezba;


class HelloWorld {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 24);
        Person antti = new Person("Antti", 22);

        if (pekka.olderThan(antti)) {  //  same as pekka.olderThan(antti)==true
            System.out.println(pekka.getName() + " is older than " + antti.getName());
        } else {
            System.out.println(pekka.getName() + " isn't older than " + antti.getName());
        }
    }
}

    class Person{
        private String name;
        private int age;
        private int height;
        private int weight;

        Person(String name, int age){
            this.name = name;
            this.age = age;
            this.height = 0;
            this.weight = 0;
        }

        Person(String name){
            this.name = name;
            this.age = 0;
            this.height = 0;
            this.weight = 0;
        }

        public double weightIndex(){
            double heightInMeters = this.height/100.0;

            return this.weight / (heightInMeters*heightInMeters);
        }

        public boolean adult(){
            if ( this.age < 18 ) {
                return false;
            }

            return true;
        }

        /*We will create a method boolean olderThan(Person compared) for the Person class, with which we can compare a certain person with a person that is given as a parameter.
         */

        public boolean olderThan(Person person){
            if(this.age>person.getAge()){
                return true;
            }
            else{
                return false;
            }
        }


        public void setHeight(int height){
            this.height = height;
        }

        public int getHeight(){
            return this.height;
        }

        public int getWeight() {
            return this.weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }



        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }
        public void getOlder(){
            this.age++;
        }
        public void getOlder(int n){
            this.age+=n;
        }
        @Override
        public String toString(){
            return this.getName()+" "+this.getAge()+"\n";
        }
    }

    class WeightWatchersAssociation {
        private double lowestWeightIndex;

        public WeightWatchersAssociation(double indexLimit) {
            this.lowestWeightIndex = indexLimit;
        }

        public boolean isAcceptedAsMember(Person person) {
            if ( person.weightIndex() < this.lowestWeightIndex ) {
                return false;
            }
            return true;
        }

    }

