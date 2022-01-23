package Singleton;

public class demo extends SingletonDemo{

	public static void main(String[] args) {
		//SingletonDemo s=new SingletonDemo();
		SingletonDemo object = getObject();
		object.suma();
		object.s();

	}

}
