package events;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Cat extends Observable{
	private String name;
	private List<String> books;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cat(String name) {
		super();
		this.name = name;
	 books=new ArrayList<String>();
	}
	public void setcall(String catcall)
	{
		
		System.out.println(this.name+"·¢³öÁË"+catcall);
		books.add(catcall);
		setChanged();
		notifyObservers(catcall);
		
	}
	}
