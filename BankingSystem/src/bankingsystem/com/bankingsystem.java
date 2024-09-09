package bankingsystem.com;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 banklogin bankLogin = banklogin.getInstance();
	        bankaccount account = new bankaccount(1000.0);
	        
	        account.viewBalance();
	        bankLogin.login();
	        account.viewBalance();
	        account.deposit(500.0);
	        account.withdraw(1000.0);
	        account.viewBalance();
	        bankLogin.logout();
	        account.viewBalance();
	        account.deposit(100.0);
	    }
	}