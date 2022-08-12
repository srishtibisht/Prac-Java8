package meta.data.ofVariables;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) throws Exception {

		Employee e = new Employee();
		Class c = e.getClass();

		// This will only display the public fields of class and parent class
		Field[] fields1 = c.getFields();

		System.out.println("Public fields of current class and parent class");
		for (Field result : fields1) {
			System.out.println(result.getName());
		}

		System.out.println("-------------------------------");

		// This will display all the fields of present class
		Field[] fields2 = c.getDeclaredFields();

		System.out.println("All the modifiers, data type and fields of current class only");
		for (Field result : fields2) {
			System.out.print(result.getType().getName() + " -- ");

			int i = result.getModifiers();
			System.out.print(Modifier.toString(i) + "  --  ");

			System.out.println(result.get(result));
		}

	}
}
