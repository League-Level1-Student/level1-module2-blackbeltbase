package _01_getters_and_setters;

public class Person {

	private String name;
	private String superpower;
	
	public String toString() {
		return name+" has mad "+superpower+" skills.";
	}
	String getName() {
	return name;
	}
	
	String getSuperpower() {
	return superpower;
	}
	
	void setName(String name) {
		this.name = name;
		
	}
	
	void setSuperpower(String superpower) {
		this.superpower = superpower;

	}
}
