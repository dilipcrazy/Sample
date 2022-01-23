package Inheritance;

public class multilevelInheritance3 extends multilevelInheritance2 {
	String gchild="Mahendira Bahubali";
	private void GrandChild() {
		System.out.println("Grandchild name is:"+gchild);
	}
public static void main(String[] args) {
	multilevelInheritance3 i=new multilevelInheritance3();
	i.father();
	i.mother();
	i.Child1();
	i.Wife1();
	i.GrandChild();
	System.out.println(i.father);
	System.out.println(i.mother);
	System.out.println(i.son1);
	System.out.println(i.wife1);
	System.out.println(i.gchild);
}
}
