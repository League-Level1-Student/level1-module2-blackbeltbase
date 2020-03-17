package _06_minion;

public class Minion {

	private String name; 
		private int eyes; 
		private String color; 
		private String master;
		
		Minion(String name, int numEyes, String color,  String master) {
			this.name = name;
			this.color = color;
			this.eyes = numEyes;
			
		}

		public String getName() {
			return name;
		}
		
		public String getColor() {
			return color;
			}
		public int getEyes() {
	return eyes;
		}
		public void setMaster(String master) {
			this.master = master;
		}
		public String getMaster() {
			return master;
		}
		
}
