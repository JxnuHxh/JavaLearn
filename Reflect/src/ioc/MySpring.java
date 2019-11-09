package ioc;

import jdk.internal.util.xml.impl.Input;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MySpring {

    public Object getBean(String className) throws Exception {
        Scanner sc=new Scanner(System.in);

        Class clazz=Class.forName(className);
        Object obj=null;
        obj=clazz.newInstance();
        Field[] fields=clazz.getDeclaredFields();
        for(Field field:fields){
            String fieldName=field.getName();
           String firstLetter= fieldName.substring(0,1).toUpperCase();
           String otherLetters=fieldName.substring(1);
           StringBuilder setMethodName=new StringBuilder("set");
            setMethodName.append(firstLetter);
            setMethodName.append(otherLetters);
            Class fieldClass=field.getType();
          Method setMethod= clazz.getMethod(setMethodName.toString(),fieldClass);
       System.out.println("给"+fieldName+"属性提供值");
       String value= sc.nextLine();
        setMethod.invoke(obj,value);
        }

         return obj;

    }

}
