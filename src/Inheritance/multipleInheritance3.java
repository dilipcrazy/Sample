package Inheritance;

public class multipleInheritance3 implements multipleInheritance2 {

	@Override
	public void father2(String father2) {
		System.out.println(father2);
		
	}

	@Override
	public void mother2(String mother2) {
		System.out.println(mother2);
		
	}

	@Override
	public void father1(String father1) {
		System.out.println(father1);
	}

	@Override
	public void mother1(String mother1) {
		System.out.println(mother1);
		
	}
	public static void main(String[] args) {
     multipleInheritance3 i=new multipleInheritance3();		
      
     i.father1(father1);
     i.mother1(mother1);
     i.father2(father2);
     i.mother2(mother2);
     
    System.out.println( multipleInheritance1.father1);
    System.out.println(multipleInheritance1.mother1);
    System.out.println(multipleInheritance2.father2);
    System.out.println(multipleInheritance2.mother2);
    System.out.println(i.no); 
     
     
     
	}


}
