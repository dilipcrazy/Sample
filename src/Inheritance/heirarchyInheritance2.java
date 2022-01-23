package Inheritance;

public class heirarchyInheritance2 extends heirarchyInheritance1{
String son1="Siva";
String wife1=null;
private void son1() {
	System.out.println("First son Name is:"+son1);
}
private void wife1() {
	System.out.println("son1 wife is:"+wife1);
}
public static void main(String[] args) {
	
	heirarchyInheritance2 i=new heirarchyInheritance2();
	i.Father();
	i.Mother();
	i.son1();
	i.wife1();
	System.out.println(i.father);
	System.out.println(i.mother);
	System.out.println(i.son1);
	System.out.println(i.wife1);
	
}
}
