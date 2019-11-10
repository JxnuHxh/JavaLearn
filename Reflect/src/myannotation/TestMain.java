package myannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMain {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
       Class clazz= Person.class;
      Field field= clazz.getDeclaredField("name");

      Annotation a=field.getAnnotation(MyAnnotation.class);
      Class aclazz=a.getClass();
     Method amethod= aclazz.getMethod("value");
    String[] values=(String[]) amethod.invoke(a);
    for (String value:values){
        System.out.println(value);
    }

      //正常对象调用执行过程
      //MyAnnotation a= (MyAnnotation)field.getAnnotation(MyAnnotation.class);
    //String[] values=a.value();
   // System.out.println(values[0]);
    }
}
