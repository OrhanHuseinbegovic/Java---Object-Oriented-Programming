package Week10.Lab.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        List<Integer> gradesList = new ArrayList<>();
        gradesList.add(90);
        gradesList.add(85);
        gradesList.add(92);
        GradeAnalyzer gradeAnalyzer = new GradeAnalyzer(gradesList);
        System.out.println("FIRST:: ");
        for(Field field : gradeAnalyzer.getClass().getDeclaredFields()){
            field.setAccessible(true);
            System.out.println("FIELD: "+field.getName()+ ": " + field.get(gradeAnalyzer));
        }
        System.out.println("NEXT:: ");
        for(Method method : gradeAnalyzer.getClass().getDeclaredMethods()){
            if(method.getName().equals("calculate")){
                method.setAccessible(true);
                Object result = method.invoke(gradeAnalyzer);
                System.out.println(method.getName() + ": " + result);
            }
            else if(method.getName().equals("print")){
                method.setAccessible(true);
                Object result = method.invoke(gradeAnalyzer);
                System.out.println(method.getName() + ": " + result);
            }
        }
    }
}
