package Db;



import java.util.ArrayList;
import java.util.List;

public class dbs {
 private static List<User> users=new ArrayList<User>();
 static {
	 users.add(new User("zhangsan","123456"));
	 users.add(new User("lisi","password"));
	 }
 public static List<User> getUsers(){
	 return users;
 }
}
