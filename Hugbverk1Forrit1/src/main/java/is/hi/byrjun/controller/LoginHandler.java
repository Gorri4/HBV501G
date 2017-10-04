package is.hi.byrjun.controller;

/**
 * Klasi sem er notaður til að sjá hvort notendanafn
 * og lykilorð sé rétt.
 * 
 * @author Helgi
 *
 */
public class LoginHandler {

	String[] users = {"Helgi", "Ómar", "Arnór", "Gummi"};
	String[] passwords = {"Helgi1", "Ómar1", "Arnór1", "Gummi1"};
	
	String user;
	String password;
	
	/**
	 * Lætur global breyturnar fá notendanafnið og lykilorðið
	 * sem var stimplað inn.
	 * 
	 * @param user heldur utanum notendanafnið
	 * @param password heldur utanum lykilorðið
	 */
	public LoginHandler(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	/**
	 * Kíkir hvort notendanafnið og passwordið passar.
	 * 
	 * @return true ef notendanafn og lykilorð er rétt, false annars
	 */
	public boolean checkLoginInfo() {
		for (int i = 0; i < 4; i++) {
			if (user.equals(users[i]) && password.equals(passwords[i]))
				return true;
		}
		return false;
	}
}

