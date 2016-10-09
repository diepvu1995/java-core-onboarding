package onboarding;

import onboarding.java.StringUtil;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();
        int a = stringUtil.findSubString("Hello world ,Hello Reader", "Hello");
        System.out.println(a);

        String upper = StringUtil.upper("this-is-Java");
        System.out.println(upper);

        String lower = StringUtil.lower("this-is-Java");
        System.out.println(lower);
        String transform = StringUtil.transform("Hello world ,Hello Reader", "UP");
        System.out.println(transform);

        int position = StringUtil.findSubString("Hello world ,hello Reader", "hello", false);
        System.out.println(position);

        StringBuilder stringBuilder = StringUtil.removeCharAt("this is java", 3);
        System.out.println(stringBuilder);

        String removeChar = StringUtil.removeChar("Hello", 'e');
        System.out.println(removeChar);

        String reverse = StringUtil.reverse("this is java");
        System.out.println(reverse);
    }
}
