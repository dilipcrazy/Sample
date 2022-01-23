package Encapsulation;

public class CallMethod {

	public static void main(String[] args) {
		privateInstance obj=new privateInstance();
		obj.setUsername("rosy");
		obj.setPassword(564);
		
		System.out.println(obj.getUsername());
		System.out.println(obj.getPassword());

	}

}
