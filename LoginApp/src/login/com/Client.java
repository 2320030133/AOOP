package login.com;

public class Client {
	public static void main(String[] args) {
		
		 LoginSystem login_user1 = LoginSystem.getUser();
	        login_user1.login("Adhi");
	        
	        LoginSystem user2 = LoginSystem.getUser();
	        user2.login("Alex");
	}
}