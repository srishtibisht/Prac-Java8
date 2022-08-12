package customize.annotations;

import java.lang.annotation.Annotation;

public class ATest {

	public static void main(String[] args) throws Exception {

		AStudent student = new AStudent(1, "Srishti", "Delhi");
		student.getStudentDetails();

		Class cl = student.getClass();

		Annotation annotation = cl.getAnnotation(ACourse.class);

		ACourse course = (ACourse) annotation;

		System.out.println("-----Course Details-------");
		System.out.println("Course Id : " + course.cId() + ", \tCourse name : " + course.cName() + ", \t Course Cost : "
				+ course.cCost());

	}

}
