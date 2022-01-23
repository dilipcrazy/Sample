package Singleton;

public class SingletonDemo {
static SingletonDemo a;
public SingletonDemo() {
	
}

  public static SingletonDemo getObject() {
	         System.out.println(System.identityHashCode(a));
	  if(a==null) {
		  a=new SingletonDemo();
	  }
	return a;
  }
 protected void suma()
 {
	 System.out.println(System.identityHashCode(a));
 }
 protected void s() {
	 System.out.println(System.identityHashCode(a));
 }
  public static void main(String[] args) {
	SingletonDemo object = getObject();
	object.suma();
	SingletonDemo object2=getObject();
	object2.s();
	
}
}