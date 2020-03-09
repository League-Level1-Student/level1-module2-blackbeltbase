package _01_getters_and_setters;

public class PersonRunner {
public static void main(String[] args) {
	Person human1 = new Person();
	human1.setName("Joe");
	human1.setSuperpower("stretchy limbs");
	human1.getName();
	human1.getSuperpower();
	System.out.println(human1);
	Person human2 = new Person();
	human2.setName("Bill");
	human2.setSuperpower("x-ray vision");
	human2.getName();
	human2.getSuperpower();
	System.out.println(human2);
	Person human3 = new Person();
	human3.setName("Bob");
	human3.setSuperpower("super strength");
	human3.getName();
	human3.getSuperpower();
	System.out.println(human3);
}
}
