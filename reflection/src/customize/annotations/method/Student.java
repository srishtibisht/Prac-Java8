package customize.annotations.method;

public class Student {

	public int id;
	public String name;
	public String address;

	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Course(cId = "1", cName = "c++", cCost = 20)
	public void getStudentDetails() {
		System.out.println("--------Student Details------");
		System.out.println("Id : " + id + "\t Name : " + name + " Address : " + address);
	}

}
