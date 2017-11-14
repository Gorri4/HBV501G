package is.hi.byrjun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;


@Entity
@Table (name="Login")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//breta
	private int id;
	@NotNull
	private String userinn;
	@NotNull
	private String password;


	
	//Smiður fyrir spurningaklasann
	public Login(String userinn, String password) {
		this.userinn = userinn;
		this.password = password;
	}
	
	public Login(){
		
	}
	

	//föll sem ná í breytur hluta af klasanum
	public String getUser(){
		return userinn;
	}
	
	public String getPassword(){
		return password;
	}
}
