package onboarding.java;

public class TutIfFuntion {
	public static void main(String[] args) {
		int myInt = 20;
		if (myInt > 30) {
			System.out.println("yes it is true");
		} else if (myInt < 5) {
			System.out.println("No it is false");
		} else {
			System.out.println("None of the obove");
		}
		int loop = 0;
		while (true) {
			System.out.println("loop : " + loop);
			if(loop==7){
				break;
			}
			loop++;
			System.out.println("Running");
		}

		// for(;;){
		// System.out.println("loop : 1");
		// }
	}
}
