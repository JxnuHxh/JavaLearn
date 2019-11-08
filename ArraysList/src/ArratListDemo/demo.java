package ArratListDemo;

import java.util.ArrayList;
	/*add(int index, E element)将指定的元素插入此列表中的指定位置。
	 * 
	    boolean add(E e) 将指定的元素添加到此列表的尾部。
	     E get(int index ) 返回指定索引元素
	  int size() 返回元素个数
	  删除元素 
	   boolean remove(object o) 删除指定元素 返回删除是否成功
	    E remove(int index) :删除指定索引处得元素，返回被删的元素
	    修改元素
	    E set(int index,E element) 修改指定索引处的元素 返回修改的元素       
	    
	    ArrayList 集合的遍历

      */
public class demo {
	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		array.add(2,"android");
		System.out.println("array:"+array);
		
		
		System.out.println("第三个元素："+array.get(2));
		System.out.println("共有："+array.size()+"个元素");
	
		System.out.println("删除了:"+array.remove(1)+"删除java:"+array.remove("java"));
		System.out.println("array:"+array);
		array.add("world");
		array.add("java");
		System.out.println("被修改的元素:"+array.set(2, "asp"));
		
		for(int i=0;i<array.size();i++)
		{
			System.out.println(array.get(i));
		}
		

		
	}
}
