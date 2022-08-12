package meta.data.ofClass;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable {

	public int id;
	public static String name;
	public final String address;

	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void add(int id, String name, String address) {
		Employee e = new Employee(id, name, address);

	}

	public void search(int id) {
		if (this.id == id) {
			System.out.println("Id is present");
		}
	}

}
