package Week10.Lecture;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public static void thisIsPublicStaticMethod(){
        System.out.println("Im public and static");
    }
    public void meow(){
        System.out.println("meow");
    }
    public void saySomething(String something){
        System.out.println("I said something".concat(something));
    }
    private void heyThisIsPrivate(){
        System.out.println("How did you call this?");
    }
}

class Main{
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat ("Cicko", 12);
        Field[] catFields = myCat.getClass().getDeclaredFields();

        for(Field f : catFields){
            System.out.println(f.getName());
        }

        for (Field field : catFields){
            if(field.getName().equals("name")){
                field.setAccessible(true);
                field.set(myCat,"Micko Cicko");
            }
        }


        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for (Method method : catMethods) {
            System.out.println(method.getName());
            if(method.getName().equals("meow")){
                method.invoke(myCat); // Exception to be handled
            } else if (method.getName().equals("saySomething")) {
                method.invoke(myCat, "AW AW AW"); // Params are passed in order they are in the method signature
            } else if (method.getName().equals("heyThisIsPrivate")) {
                method.setAccessible(true);
                method.invoke(myCat); // This will not work if we do not set accessibility
            } else if (method.getName().equals("thisIsPublicStaticMethod")) {
                method.invoke(null); // Static methods does not need the object
            }
        }


    }
}
