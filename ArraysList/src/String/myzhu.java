package String;

public class myzhu {
public static void main(String[] args) {
	Student[] students=new Student[3];
	Student s1=new Student("²Ü²Ù",15);
	Student s2=new Student("ËæÈ«",18);
	Student s3=new Student("lisi",40);
    
	students[0]=s1;
	students[1]=s2;
	students[2]=s3;
	for(int x=0;x<students.length;x++)
	{
		System.out.println(students[x].getName()+"-----"+students[x].getAge());
	}
}
}
