package Inheritance;

public class singleInheritance2 extends singleInheritance1{

	public static void main(String[] args) {
		singleInheritance2 i=new singleInheritance2();
		/*i.Parent();
		i.Parent1();
	    System.out.println(i.name);
	    System.out.println(i.name1);*/
	
		i.Parent1("Tom",0);
		i.Parent1("Bruce");
		System.out.println(i.name);
		System.out.println(i.name1);
		
	}

}
