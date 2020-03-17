package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handySmurf = new Smurf("Handy");
	handySmurf.eat();
	Smurf papaSmurf = new Smurf("Papa");
	papaSmurf.getHatColor(true);
	papaSmurf.isGirlOrBoy(false);
	Smurf smurfette = new Smurf("Smurfette");
	smurfette.getHatColor(false);
	smurfette.isGirlOrBoy(true);
}
}
