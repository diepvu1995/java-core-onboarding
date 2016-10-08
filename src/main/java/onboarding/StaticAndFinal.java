package onboarding;

class Thing {
	public final static int LUCKY_NUMBER = 7;

	public String name;
	public static String description;

	public static int count = 0;
	public int id;

	public Thing() {
		id = count;
		count++;
	}

	public void showname() {
		System.out.println("object id is: " + id +" "+ description + ":" + name);
	}

	public static void showInfo() {
		System.out.println(description);
		// System.out.println(name); won't work
		System.out.println("hello");
	}

}

public class StaticAndFinal {
	public static void main(String[] args) {
		// neu static la thuoc khai bao bien thi co the truy van truc tiep thong
		// qua Lop
		Thing.description = "I am a good man";
		System.out.println(Thing.description);

		// co the goi truc tiep mot ham trong lop do
		Thing.showInfo();

		System.out.println("before creating object: count is " + Thing.count);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		System.out.println("after creating object: count is " + Thing.count);

		thing1.name = "Bob";
		thing2.name = "John";
		thing1.description = "handsome";
		System.out.println(thing1.name);

		thing1.showname();
		thing2.showname();

		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);
	}
}
