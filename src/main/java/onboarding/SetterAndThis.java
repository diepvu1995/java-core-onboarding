package onboarding;

class Frog {
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age){
		setAge(age);
		setName(name);
		System.out.println("My name is: " + name + " I am " + age +" Years old");
	}
}

public class SetterAndThis {
	public static void main(String[] args) {
		Frog frog = new Frog();
		//frog.name = "Diep Vu";
		//frog.age = 21;
		
		frog.setName("Diep vu");
		frog.setAge(21);
		
		frog.setInfo("Vu Van Diep", 22);

		//System.out.println(frog.getName());
	}
}
