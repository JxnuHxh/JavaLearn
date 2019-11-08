# Java-foundation
Java基础知识梳理 及JVM深入了解  

### 反射机制
类 是用来描述一组对象  
反射机制 用来描述一组类    
通过一个Class对象来直接操作Person.class类文件 编译后的字节文件
反射很强大  能获得很多底层的东西  但是应该用在有用的地方   

通过反射修改private final 修饰的String字符串  

Class  
Package  
Field   
Method   
Constructor  
Annotation    

##### 1.如何获取Class  
有如下三种方法：   

Class clazz=Class.forName("包名.类名")   

Class clazz=类名.class;     

Class clazz=对象.getClass();      

##### 2.Class的方法     
int getModifiers();  获取修饰符   
String getName() ; 获取全类名 
Class getInterface();获取所有父接口    
Class getSuperClass(); 获取父类    
Object newInstance() 创建对象 相当于无参构造方法  
Class[] getClasses() 获取类中的内部类
##### 3.Field的方法  
Field getField("属性名") ;  获得属性 只能获取公有属性 包括父类属性   
Field[] getFields(); 获取所有属性    
Field[] fs=getFields() 找到一堆属性      
Field getDeclaredFueld("属性") 能获本类所有的属性包括私有属性    
int getModifiers() 获得属性修饰符     
Field setAccessible(true) 表示私有属性可以直接被操作    
set(对象,"要设置属性的名字")      
Class getType 获取属性对应的class  
String getName  获取属性名字   
#### 如何操作方法
 Class clazz=Person.class;  
        Method m=clazz.getMethod("eat",String.class);  
        int mm =m.getModifiers();  
        Class mrt=m.getReturnType();// 获取返回类型  
        String mn=m.getName(); //获取方法名  
        Class[] mpts = m.getParameterTypes(); //获取方法参数列表的类型  
        Class[] mets=m.getExceptionTypes(); //获取方法抛出异常的类型  




 
