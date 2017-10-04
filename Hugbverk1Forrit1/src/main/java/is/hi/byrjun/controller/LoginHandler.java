package is.hi.byrjun.controller;

public class LoginHandler {

	String[] users = {"Helgi", "Ómar", "Arnór", "Gummi"};
	String[] passwords = {"Helgi1", "Ómar1", "Arnór1", "Gummi1"};
	
	String user;
	String password;
	
	public LoginHandler(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	public boolean checkLoginInfo() {
		for (int i = 0; i < 4; i++) {
			if (user.equals(users[i]) && password.equals(passwords[i]))
				return true;
		}
		return false;
	}
}

