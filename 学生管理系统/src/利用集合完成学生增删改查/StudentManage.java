package 利用集合完成学生增删改查;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
	public static void main(String[] args) {
		ArrayList<Student> array=new ArrayList<Student>();
		while(true)
		{
			System.out.println("-------欢迎来到学生管理系统------------");
			System.out.println("1 查看所有学生信息");
			System.out.println("2 添加学生信息");
			System.out.println("3 删除学生信息");
			System.out.println("4 修改学生信息");
			System.out.println("5 退出");
			System.out.println("请输入你的选择：");
		  Scanner sc=new Scanner(System.in);
		 String  chice=sc.nextLine();
		 switch(chice)
		 {
		 case"1":
			 find(array);
			 break;
		 case"2":
		     add(array);
		     break;
		 case"3":
			 //删除学生
			 delete(array);
			 break;
		 case"4":
			 update(array);
			 break;
		 case"5":
			 break;
			default:
				System.out.println("谢谢你的使用:");
				System.exit(0);
				break;
		 		 }
		 }
		
	}
	public static void delete(ArrayList<Student> array)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("输入要删除学生的学号:");
		String id=sc.nextLine();
		for(int x=0;x<array.size();x++)
		{
			if(array.get(x).getId().equals(id))
				{array.remove(x);
			break;
				}
		}
		System.out.println("删除学生成功");
		int index=-1;
		for(int x=0;x<array.size();x++)
		{
			Student s=array.get(x);
			if(s.getId().equals(id))
			{
				index=x;
				break;
			}
		}
		if(index==-1)
		{
			System.out.println("你要删除学生的学号不存在");
		}
		else
		{
			array.remove(index);
		}
		
		
	}
	public static void update(ArrayList<Student> array)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("输入你要修改的学生学号：");
		String id=sc.nextLine();
		int index=-1;
		for(int x=0;x<array.size();x++)
		{
		Student s=array.get(x);
		
		if(s.getId().equals(id))
		{
			index=x;
			break;
		}
		}
		if(index==-1)
		{
			System.out.println("你要修改的学生信息不存在");
		}
		else
		{
			System.out.println("请输入学生新姓名 ：");
			String name=sc.nextLine();
			System.out.println("请输入学生新年龄 ：");
			String age=sc.nextLine();
			System.out.println("请输入学生新地址 ：");
			String address=sc.nextLine();
			Student s=new Student();
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			array.set(index, s);
			System.out.println("修改成功");
			
		}
		
	}
	public static void find(ArrayList<Student> array)
	{
		if(array.size()==0)
		{
			System.out.println("不好意思没有你要查看的学生,请重新操作");
		return;
		
	    }
		System.out.println("学号\t\t姓名\t年龄\t居住地");
		for(int x=0;x<array.size();x++)
		{
			Student s=array.get(x);
			System.out.println(s.getId()+"\t\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
			
		}
	}
	public static void add(ArrayList<Student> array) 
	{
		Scanner sc=new Scanner(System.in);
				String id;
					System.out.println("请输入学号:");
					id=sc.nextLine();
					boolean flag=false;
					for(int x=0;x<array.size();x++)
					{
						Student s=array.get(x);
						if(s.getId().equals(id))
						{
							flag=true;
							break;
						}
					}
					if(flag)
					{
						System.out.println("你输入的学号被占用 请重新输入");
					}
					else
					{
						System.out.println("请输入学生姓名");
						String name=sc.nextLine();
						System.out.println("请输入学生年龄");
						String age=sc.nextLine();
						System.out.println("请输入学生地址");
						String address=sc.nextLine();
						Student s=new Student();
						s.setId(id);
						s.setName(name);
						s.setAge(age);
						s.setAddress(address);
						array.add(s);
						System.out.println("添加成功");
					}
		}
}
