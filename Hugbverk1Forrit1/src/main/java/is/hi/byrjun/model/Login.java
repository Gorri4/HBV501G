package is.hi.byrjun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
/**
 * 
 * @author gudmundurorripalsson
 *	Módel klasi fyrir Login
 */
@Entity
@Table (name="Login")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	private String userinn;
	@NotNull
	private String password;
	private String email;

	public Login(String userinn, String password,String email) {
		this.userinn = userinn;
		this.password = password;
		this.email = email;
	}
	
	public Login(){
		
	}
	
	public String getUser(){
		return userinn;
	}
	
	public String getPassword(){
		return password;
	}
}
