package changeString;

import java.lang.reflect.Field;
//很强大  能获得很多底层的东西  但是应该用在有用的地方
//通过反射修改private final 修饰的String字符串
public class ChangeStringVAlue {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = new String("abc");
        System.out.println(str);
        Class clazz=str.getClass();
        Field f=clazz.getDeclaredField("value");
        f.setAccessible(true);
        // private final char[] value={'a','b','c'};
        char[] temp=(char[])f.get(str);
        temp[0]='黄';
        temp[1]='小';
        temp[2]='华';
        System.out.println(str);
    }

}
