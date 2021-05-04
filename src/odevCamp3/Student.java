package odevCamp3;

public class Student extends User{

		int percentageFinish;
		String enrolToCourse;
		
		public String getEnrolToCourse() {
			return enrolToCourse;
		}
		public void setEnrolToCourse(String enrolToCourse) {
			this.enrolToCourse = enrolToCourse;
		}
		public int getPercentageFinish() {
			return percentageFinish;
		}
		public void setPercentageFinish(int percentageFinish) {
			this.percentageFinish = percentageFinish;
		}
}
