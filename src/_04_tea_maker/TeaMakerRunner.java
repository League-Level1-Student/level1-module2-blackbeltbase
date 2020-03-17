package _04_tea_maker;

public class TeaMakerRunner {
public static void main(String[] args) {
	new TeaBag("mint");
	Kettle kettle = new Kettle();
	kettle.getWater();
	kettle.boil();
	new Cup();
	
}
}
