package Abstraction;
                         //implements
public class  Abstraction2 extends Abstraction1 {

	public static void main(String[] args) {
		Abstraction2 a=new Abstraction2();
		
		a.id();
		a.name();
	}

	@Override
	public void name() {
		System.out.println("don sitting uh");
		
	}

}
