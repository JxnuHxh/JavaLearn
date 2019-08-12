package Integer;
//字符串转Int
public class day1 {
public static void main(String[] args) {
	Integer i=new Integer("10");
	int a=i.intValue();
	System.out.println(a+10);
	System.out.println(Integer.parseInt("30"));//必须掌握 parseInt是Integer类的静态方法
}
}
