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
给出一个String--->的到一个类--->得到对象   
可以设计一个方法 给一个字符串 返回一个对象   
Spring的IOC(Inversion Of Control)控制反转 就是这个原理  我们不用自己创建对象  直接拿来用     
它相当一个容器 里面加载了很多对象     
DI(依赖注入)(Dependency Injection)是IOC的一个体现 对象的控制权是别人的 别人创建对象的同时 帮我们自动注入属性值   

Annotation(注解)
1.注解的写法
@XXX(一些信息)
2.注解放在哪里   
类的上面 属性的上面 方法的上面 构造方法的上面 参数前面   
3.注解的作用   
   1.用来充当注解的作用(仅仅是一个文字说明)   
   例 @Depreciation 表示这个方法已经过时的 废弃的   
   2. 用来做代码的检验（验证） 
    例 @Override  检测此方法是否是一个重写
   3. 可以携带一些信息（内容)  
   例  yml 等配置文件 @SuppressWarnings("信息") 
   unused 表示变量定义后为使用
   serial 类实现了序列化接口 不添加序列化ID号
   rawtypes 集合没有定义泛型
   unchecked 出现了泛型问题 可以不检测
   all  包所有

   
## [自定义注解]()
自定义注解需要元注解描述
元注解有   
@Target 描述这个注解可以放在哪里写   
@Retention  描述当前的这个注解存在什么作用域
@Inherited 允许子类继承父类的注解   

## 如何获取注解对象




 
