package testmethod;

public class Person extends  Animal{
    public void eat(){
        System.out.println("我是person的吃饭方法");
    }
    public String eat(String s){
        System.out.println("我是person的代参吃饭方法");
        return s;
    }
    private void testprivate(){
        System.out.println("我是私有方法");
    }

    public Person() {
        System.out.println("我是无参构造方法");
    }
}
