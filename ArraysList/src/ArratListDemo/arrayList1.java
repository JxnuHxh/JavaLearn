package ArratListDemo;

import java.util.ArrayList;

public class arrayList1 {
	public static void main(String[] args) {
		
		String[] s= {"张无忌","张三丰","宋远桥","段利听","张翠山","莫圣萨"};
		ArrayList<String> array= new ArrayList<String>();
		for(int x=0;x<s.length;x++)
		{
			array.add(s[x]);
		}
		for(int x=0;x<array.size();x++)
		{
			String st=array.get(x);
			if(st.startsWith("张"))
					System.out.println(st);
		}
	}
}
