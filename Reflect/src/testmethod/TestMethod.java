package testmethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMethod {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz=Person.class;

        Person p=(Person)clazz.newInstance();
        Method m2=clazz.getDeclaredMethod("testprivate");
        System.out.println(m2.getName());
        m2.setAccessible(true);  //设置私有方法的使用权

        m2.invoke(p);
       // Method m=clazz.getMethod("eat",String.class);
       //String result = (String)m.invoke(p,"测试参数");
     //  Method m1=clazz.getMethod("sleep");
       //m1.invoke(p);
      //Method[] m= clazz.getMethods(); //获取所有方法 包括父类
    //   System.out.println(result);
       // int mm =m.getModifiers();
        //Class mrt=m.getReturnType();// 获取返回类型
        //String mn=m.getName(); //获取方法名
        //Class[] mpts = m.getParameterTypes(); //获取方法参数列表的类型
        //Class[] mets=m.getExceptionTypes(); //获取方法抛出异常的类型

    }
}
