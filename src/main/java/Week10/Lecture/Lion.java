package Week10.Lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface RunImmediately {}

record Lion(String name) {
    @RunImmediately
    public void saySomething() {
        System.out.println("Lion method saySomething");
    }
    public void saySomethingButDontRun() {
        System.out.println("Lion method saySomethingButDontRun");
    }
}

class Mainn{
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Lion lion = new Lion("Lavcina");
        System.out.println(lion.getClass().isAnnotationPresent(RunImmediately.class));
        for (Method method : lion.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(RunImmediately.class)){
                System.out.println("Method name is " + method.getName());
                method.invoke(lion);
            }
        }
    }
}
