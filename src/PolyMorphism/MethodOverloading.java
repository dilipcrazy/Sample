package PolyMorphism;

public class MethodOverloading {
	String name="rossy";
 protected void a(String name)
 {
	System.out.println("My name is:"+name);
}
 protected void a(String name,int id)
{   String name1="rossy";
	System.out.println("Iam:"+name);
	System.out.println("My identy no:"+id);
}
 protected void a(long ph)	
{
	System.out.println("Phone no is:"+ph);
}
public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.a("Dilip");
		m.a("Siva", 51152);
		m.a(98570897);
        m.a("Mohana");
        m.a("Mohana", 2);
        System.out.println(m.name);
	}

}
