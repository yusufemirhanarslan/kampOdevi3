package odevCamp3;

public class InstructorManager extends UserManager{
  @Override
	public void add(User user) {
		
		System.out.println("Say�n "+user.getFirstName() + user.getLastName() + " e�itmen olarak kayd�n�z ba�ar�l� bir �ekilde al�nm��t�r.");
	}
  @Override
	public void delete(User user) {
		System.out.println("Say�n "+user.getFirstName() + user.getLastName() + "kayd�n�z ba�ar�l� bir �ekilde silinmi�tir.");
	}
  @Override
	public void update(User user) {
		System.out.println("Say�n "+user.getFirstName() + user.getLastName() + " bilgileriniz ba�ar�l� bir �ekilde g�ncellenmi�tir.");
	}
	@Override	
	public void showInformation(User user) {
		System.out.println("E�itmenin ad� :" + user.getFirstName() + " soyad� :" + user.getLastName() + " e-mail bilgileri : "+ user.getEmail()+" �ifreniz: "+user.getPassword());
	}
	
	public void addToLessonName(Instructor instructor) {
		System.out.println("Say�n "+ instructor.getFirstName() +instructor.getLastName()+instructor.lessonCategory+" kategorisine "+instructor.lessonName +" kursunuz eklenmi�tir");
	}
	
}
