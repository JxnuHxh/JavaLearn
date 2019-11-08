package testreflect;

public class TestMain {
    public static void main(String[] args) throws ClassNotFoundException {
       Class clazz= Class.forName("testreflect.Person");
       //通过一个Class对象来操作Person.class类文件

        int modifiers=clazz.getModifiers(); //获取类修饰符 用整数代替
        System.out.println(modifiers);
        System.out.println(clazz.getName());//全类名
        System.out.println(clazz.getSimpleName());//简单类名
        Package p=clazz.getPackage();
        System.out.println(p.getName());

        // 有多个修饰符就是求和
        // 0--默认不写 1--public 2--private 4--protected
        // 8--static 16--final 32--synchronized 64--volatile
        // 512--interface 1024--abstaract


    }
}
