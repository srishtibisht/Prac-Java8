package customize.annotations;

@ACourse(cId = "12",cName = "Java",cCost = 10)
public class AStudent {

	public int id;
	public String name;
	public String address;

	public AStudent(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void getStudentDetails() {
		System.out.println("Student Details : --");
		System.out.println("Id : " + id + "\t Name : " + name + " Address : " + address);
	}
}
