package odevCamp3;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		
		System.out.println("Say�n "+ user.getFirstName() + user.getLastName() + "kayd�n�z ba�ar�l� bir �ekilde al�nm��t�r");
	}
  @Override
	public void delete(User user) {
		System.out.println("Say�n "+user.getFirstName() + user.getLastName() + "kayd�n�z ba�ar�l� bir �ekilde silinmi�tir");
	}
  @Override
	public void update(User user) {
		System.out.println("Say�n "+user.getFirstName() + user.getLastName() + " bilgileriniz ba�ar�l� bir �ekilde g�ncellenmi�tir");
	}
  @Override
	public void showInformation(User user) {
		System.out.println("��rencinin ad� :" + user.getFirstName() + " soyad� :" + user.getLastName() + " e-mail bilgileri : "+ user.getEmail()+" �ifreniz:"+user.getPassword());
	}
  
  public void enrolToCourse(Student student) {
	  	 System.out.println("Kaydoldu�unuz kurs: "+ student.getEnrolToCourse());
  }
  
  public void percentageFinish(Student student) {
	  System.out.println(student.getEnrolToCourse() +" kursunu bitirme y�zdeniz : %"+student.getPercentageFinish());
  }
	
}
