package onboarding.java;

public class TutArrayOfString {
	public static void main(String[] args) {
		String[] word = new String[3];
		word[0] = "hello";
		word[1] = "to";
		word[2] = "you";
		System.out.println(word[2]);
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		for(String fruit: fruits){
			System.out.println(fruit);
		}
	}

}
