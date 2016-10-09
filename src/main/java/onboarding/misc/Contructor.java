package onboarding.misc;
class Machine {
	private String name;
	private int code;
	// create contructor
	public Machine() {
		//this line to call third contructor
		this("Manchester United", 0);
		
		System.out.println("Contructor running!");
		name = "Diep Vu";
	};
	public Machine(String newName) {
		System.out.println("Second contructor running!");
		this.name = newName;
	}
	public Machine(String newName, int newCode) {
		System.out.println("Third contructor running!");
		this.name = newName;
		this.code = newCode;
		System.out.println(newCode + newName);
	}
}
public class Contructor {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		//Machine machine2 = new Machine("Diep Vu");
		//Machine machine3 = new Machine("david", 7);
	}
}
