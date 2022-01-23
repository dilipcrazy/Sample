package StringMethods;

public class Stringdemo {

	public static void main(String[] args) {
		String s="Selenium";
		System.out.println(s.length());
		String s1="Automation FrameWork";
		System.out.println(s.concat(s1));
		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println(s.charAt(2));
		
		System.out.println(s.replace('e', 'o'));
		System.out.println(s1.replace("Automation", "TestNG"));
		boolean contains = s.contains("Sel");
		System.out.println(contains);
		String substring = s1.substring(0,2);
		System.out.println(substring);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s1.toLowerCase();
		System.out.println(lowerCase);
		
	}

}
