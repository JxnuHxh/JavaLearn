package events;

public class Client {

	public static void main(String[] args) {
		Mouse mouse1=new Mouse("老鼠1");
		Mouse mouse2=new Mouse("老鼠2");
		Cat cat1=new Cat("吃老鼠的猫");
		cat1.addObserver(mouse1);
		cat1.addObserver(mouse2);
		cat1.setcall("大叫一声");
		
	}
}
