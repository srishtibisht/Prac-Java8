package customize.annotations.method;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws Exception {

		Student student = new Student(100, "Sri", "India");
		student.getStudentDetails();

		Class c = student.getClass();

		Method m1 = c.getMethod("getStudentDetails");
		Annotation ann = m1.getAnnotation(Course.class);

		Course course = (Course) ann;


		System.out.println("-----Course Details-------");
		System.out.println("Course Id : " + course.cId() + ", \tCourse name : " + course.cName() + ", \t Course Cost : "
				+ course.cCost());
	}
}
