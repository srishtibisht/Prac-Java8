package meta.data.ofMethods;

import java.io.Serializable;

public class Employee extends ATest implements Serializable, Cloneable {

	public static int id = 29;
	static String name = "Srishti";
	public static String address = "Delhi";

	public void displayName(String name) {
		System.out.println("Name : " + name);
	}

	protected void display() {
		System.out.println("Child class method ");
	}

}
