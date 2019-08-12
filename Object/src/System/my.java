package System;
/*
 * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)  
 * 复制数组
 * 参数1：源数组
 * 参数2：源数组的起始索引位置
 * 参数3：目标数组
 * 参数4：目标数组的起始索引位置
 * 参数5：指定接受的元素个数
 */

public class my {
	public static void main(String[] args) {
		int[] src= {1,2,3,4,5};
		int[] des=new int[5];
		System.arraycopy(src, 1, des, 2, 3);
		for(int x=0;x<des.length;x++)
		System.out.println(des[x]);
		
		
		long start=System.currentTimeMillis();//当前系统的时间单位毫秒
		for(int i=0;i<10000;i++)
		{
			System.out.println(i);
			if(i==1000)
				System.exit(0);//关掉虚拟机 后面就不执行了
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);//打印处该for循环的执行时间
	}
   
	
}
