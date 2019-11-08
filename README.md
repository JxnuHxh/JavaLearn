# Java-foundation
Java基础知识梳理 及JVM深入了解  

### 反射机制
类 是用来描述一组对象  
反射机制 用来描述一组类   
##### 1.如何获取Class  
有如下三种方法：   

Class clazz=Class.forName("包名.类名")   

Class clazz=类名.class;     

Class clazz=对象.getClass();      

##### 2.Class的方法     
getModifiers();      
getInterface();获取所有父接口    
getSuperClass(); 获取父类    
newInstance() 创建对象 相当于无参构造方法    
getField("属性名") ; 返回值Field 获得属性    
getField("属性名").getModifiers() 获得属性修饰符    


 
