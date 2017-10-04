package is.hi.byrjun.controller;

/**
 * Klasi sem er nota�ur til a� sj� hvort notendanafn
 * og lykilor� s� r�tt.
 * 
 * @author Helgi
 *
 */
public class LoginHandler {
	//Harðkóðuð gildi fyrir user-a og password þeirra
	String[] users = {"Helgi", "�mar", "Arn�r", "Gummi"};
	String[] passwords = {"Helgi1", "�mar1", "Arn�r1", "Gummi1"};
	
	String user;
	String password;
	
	/**
	 * L�tur global breyturnar f� notendanafni� og lykilor�i�
	 * sem var stimpla� inn.
	 * 
	 * @param user heldur utanum notendanafni�
	 * @param password heldur utanum lykilor�i�
	 */
	public LoginHandler(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	/**
	 * K�kir hvort notendanafni� og passwordi� passar.
	 * 
	 * @return true ef notendanafn og lykilor� er r�tt, false annars
	 */
	public boolean checkLoginInfo() {
		for (int i = 0; i < 4; i++) {
			if (user.equals(users[i]) && password.equals(passwords[i]))
				return true;
		}
		return false;
	}
}

