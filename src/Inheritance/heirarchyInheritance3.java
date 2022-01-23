package Inheritance;

public class heirarchyInheritance3 extends heirarchyInheritance1 {
	String son2="Dilip";
	String wife2=null;
	private void son2() {
		System.out.println("Second son Name is:"+son2);
	}
	private void wife2() {
		System.out.println("Wife name is:"+wife2);
	}

	public static void main(String[] args) {
		heirarchyInheritance3 i=new heirarchyInheritance3();
		i.Father();
		i.Mother();
		i.son2();
		i.wife2();
		System.out.println(i.father);
		System.out.println(i.mother);
		System.out.println(i.son2);
        System.out.println(i.wife2);
	}

}
