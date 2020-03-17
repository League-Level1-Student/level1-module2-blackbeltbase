package _03_smurf;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;
	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public void getHatColor(boolean isPapa) {
		String hatColor = null;
		if(isPapa) {
			hatColor = "red";
		}
		else {
			hatColor = "white";
		}
		// 3. Fill in this method
		System.out.println(name+"'s hat is "+ hatColor);
	}

	/* Smurfette is the only female Smurf. */
	public void isGirlOrBoy(boolean isSmurfette) {
		// 4. Fill in this method
	
		if(isSmurfette) {
			System.out.println("She is a girl");
		}
		else {
		System.out.println("He is a boy");}
	}

}


