package day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();//ÎÞÐò
		set.add("hello");
		set.add("world");
		set.add("java");
				
		method(set);
				
		method1(set);
		
		method2(set);
	}

	private static void method2(Set<String> set) {
		for(String s:set)
		{
			System.out.println(s);
		}
	}

	private static void method1(Set<String> set) {
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
	}

	private static void method(Set<String> set) {
		Object[] ob=set.toArray();
		for(int i=0;i<ob.length;i++)
		{
			System.out.println(ob[i]);
		}
	}

}
