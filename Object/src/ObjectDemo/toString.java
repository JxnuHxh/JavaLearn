package ObjectDemo;

/*
 * String toString() :返回该对象的字符表示
 * 
 */
class Student extends Object{
	String name;
	int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
public class toString {
   public static void main(String[] args) {
	Student s=new Student();
	s.name="zhangsan";
	s.age=18;
	System.out.println(s.toString());
	System.out.println(s);
	
}
}
