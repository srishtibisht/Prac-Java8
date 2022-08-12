package meta.data.ofMethods;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
	public static void main(String[] args) throws Exception {

		Class c = Class.forName("meta.data.ofMethods.Employee");
		System.out.println("Class name : " + c.getName());

		System.out.println("---------------------------------------------");

		System.out.println("Public methods of current class and parent class \n");
		Method[] m1 = c.getMethods();
		for (Method res : m1) {
			System.out.println("Method name : " + res.getName());
		}

		System.out.println("\n---------------------------------------------");

		System.out.println("All the methods of current class only \n");
		Method[] m2 = c.getDeclaredMethods();
		for (Method res : m2) {
			System.out.print("Method name : " + res.getName() + ",  ");
			int i = res.getModifiers();
			System.out.println("Modifer Type : " + Modifier.toString(i));

//			System.out.println(res.getDefaultValue());
		}

	}
}
