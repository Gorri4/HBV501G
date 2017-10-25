package is.hi.byrjun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Login")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//breta
	private int id;
	private String user;
	private String password;

	
	//Smiður fyrir spurningaklasann
	public Login(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	public Login(){
		
	}
	
	//föll sem ná í breytur hluta af klasanum
	public String getUser(){
		return user;
	}
	
	public String getPassword(){
		return password;
	}
}
