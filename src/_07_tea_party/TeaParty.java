package _07_tea_party;

public class TeaParty {

	   public String welcome(String name, boolean isWoman, boolean isKnighted) {

	      String beforeName;
	      if(isKnighted && isWoman) {
	    	 beforeName = "Lady";
	      }
	      else if(isKnighted && isWoman == false) {
	    	  beforeName = "Sir";
	      }
	      else if(isKnighted == false && isWoman) {
	    	  beforeName = "Ms.";
	      }
	      else {
	    	  beforeName = "Mr.";
	      }
	      return "Hello "+beforeName+" "+name;
	      
       }
}

