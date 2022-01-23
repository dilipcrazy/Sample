package PolyMorphism;

public class MethodOverriding1 extends MethodOverloading {
	public void c() {
		System.out.println("This is my nation");
		}
	public void b() {
		System.out.println("This is Alphabet");
	}
	protected void a() {
		System.out.println("suma");
	}
public static void main(String[] args) {
	MethodOverriding1 m=new MethodOverriding1();
	m.a("Rossy", 2);
	m.b();
	m.c();
	
     	
}
}
