package Week10.Lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NewMainHere {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Lionn lionn = new Lionn("Lavcina");
        for (Method method : lionn.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediatelyNTimes.class)) {
                RunImmediatelyNTimes annotation =
                        method.getAnnotation(RunImmediatelyNTimes.class);
                for (int i = 0; i < annotation.times(); i++){
                    System.out.println("Method is invoked");
                    method.invoke(lionn);
                }
            }
        }
    }
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface RunImmediatelyNTimes {
    int times() default 1;
}


record Lionn(String name){}


