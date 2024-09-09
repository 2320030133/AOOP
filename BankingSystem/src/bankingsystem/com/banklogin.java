package bankingsystem.com;

public class banklogin {
    private static banklogin instance;
    private boolean loggedIn;
    private banklogin() {
        loggedIn = false;
    }
    public static banklogin getInstance() {
        if (instance == null) {
            instance = new banklogin();
        }
        return instance;
    }
    public void login() {
        loggedIn = true;
        System.out.println("User logged in.");
    }
    public void logout() {
        loggedIn = false;
        System.out.println("User logged out.");
    }
    public boolean isLoggedIn() {
        return loggedIn;
    }
}
