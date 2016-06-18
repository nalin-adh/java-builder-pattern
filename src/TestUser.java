
public class TestUser {

	public User getUser(){
		return new User.UserBuilder("Nalin", "Adhikari").address("Kathmandu").state("Bagmati").country("Nepal").build();
	}
	
	public static void main(String [] args){
		TestUser tUser = new TestUser();
		System.out.println(tUser.getUser().toString());
	}
}
