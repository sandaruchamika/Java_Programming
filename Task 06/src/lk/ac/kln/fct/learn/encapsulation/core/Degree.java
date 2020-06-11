package lk.ac.kln.fct.learn.encapsulation.core;

public class Degree implements Cloneable{
	private String name;
	private int id;
	
	public Degree(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Degree clone() throws CloneNotSupportedException {
		return (Degree) super.clone();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
