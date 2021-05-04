package odevCamp3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setUserId(789456);
		student.setFirstName("Yusuf ");
		student.setLastName("Arslan ");
		student.setEmail(" 123@gmail.com ");
		student.setPassword("123456");
		student.setEnrolToCourse("Java&React");
		student.setPercentageFinish(35);
		
		Instructor instructor = new Instructor();
		instructor.setUserId(789457);
		instructor.setFirstName("Engin ");
		instructor.setLastName("Demiroð ");;
		instructor.setEmail(" 132@gmail.com ");
		instructor.setPassword("123456789");
		instructor.setLessonName("Java&React ");
		instructor.setLessonCategory("Yazýlým ");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.showInformation(student);
		studentManager.enrolToCourse(student);
		studentManager.percentageFinish(student);
		
		System.out.println("-------------------------------");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.showInformation(instructor);
		instructorManager.addToLessonName(instructor);
		
	}

}
