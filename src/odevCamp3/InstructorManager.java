package odevCamp3;

public class InstructorManager extends UserManager{
  @Override
	public void add(User user) {
		
		System.out.println("Sayýn "+user.getFirstName() + user.getLastName() + " eðitmen olarak kaydýnýz baþarýlý bir þekilde alýnmýþtýr.");
	}
  @Override
	public void delete(User user) {
		System.out.println("Sayýn "+user.getFirstName() + user.getLastName() + "kaydýnýz baþarýlý bir þekilde silinmiþtir.");
	}
  @Override
	public void update(User user) {
		System.out.println("Sayýn "+user.getFirstName() + user.getLastName() + " bilgileriniz baþarýlý bir þekilde güncellenmiþtir.");
	}
	@Override	
	public void showInformation(User user) {
		System.out.println("Eðitmenin adý :" + user.getFirstName() + " soyadý :" + user.getLastName() + " e-mail bilgileri : "+ user.getEmail()+" þifreniz: "+user.getPassword());
	}
	
	public void addToLessonName(Instructor instructor) {
		System.out.println("Sayýn "+ instructor.getFirstName() +instructor.getLastName()+instructor.lessonCategory+" kategorisine "+instructor.lessonName +" kursunuz eklenmiþtir");
	}
	
}
