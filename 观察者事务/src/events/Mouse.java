package events;

import java.util.Observable;
import java.util.Observer;

public class Mouse implements Observer{

	private String name;
	public Mouse() {
	}
	
	public Mouse(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		Cat cat=(Cat)o;
		System.out.println(this.name+"听到了"+cat.getName()+"突然"+arg+" | 就逃跑了！");
		
	}
	
	

}
