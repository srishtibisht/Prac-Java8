package meta.data.ofClass;

import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) throws Exception {

		Class c = Class.forName("meta.data.ofClass.Employee");
//		System.out.println("Class : " + c);

		String s = c.getName();
		System.out.println("CLASS NAME : " + s);
		System.out.println("-----------------------------");

		System.out.println("SUPER CLASS : " + c.getSuperclass().getName());

		System.out.println("-----------------------------");

		Class[] totalInterfaces = c.getInterfaces();
		for (int i = 0; i < totalInterfaces.length; i++) {
			System.out.print((i + 1) + " INTERFACE NAME : " + totalInterfaces[i].getName() + "   ");
		}

		System.out.println("-----------------------------");

		int i = c.getModifiers();
		System.out.println("Total no. of modiers: " + i);

		System.out.println("-----------------------------");

		System.out.println("Access Modifiers : " + Modifier.toString(i));

		System.out.println("-----------------------------");

	}
}
