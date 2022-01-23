package PolyMorphism;

public class MethodOverriding2 extends MethodOverriding1 {
     
	 public void a() {
		System.out.println("This is my letter");
      super.a();
      
	}
	 public void b() {
		 System.out.println("this is suma");
		 super.b();
	 }
	
	
	
	
	public static void main(String[] args) {
		MethodOverriding2 m=new MethodOverriding2();
		m.a();
		m.b();
		
		
		

	}

}
