package onboarding.misc;

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void height(int height){
		System.out.println("Your height is: " + height);
	}
	public void move(String direction, double distance){
		System.out.println("Moving "+ distance + " metres in direction " + direction);
	}
}

public class MethodParemeter {
	public static void main(String[] args) {
		Robot diep = new Robot();
		diep.speak("Say oh year: Diep Vu");
		diep.height(170);
		diep.move("WEST", 56.9);
		
		String greetng = "Hello there";
		diep.speak(greetng);
		
		int value=14;
		diep.height(value);

	}
}
