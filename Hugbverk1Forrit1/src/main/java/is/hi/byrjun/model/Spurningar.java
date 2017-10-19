package is.hi.byrjun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Spurningar")
public class Spurningar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//breta
	private int id;
	private String spurning;
	private String svarmog1;
	private String svarmog2;
	private String svarmog3;
	private String svarmog4;
	private String rettSvar;

	
	//Smiður fyrir spurningaklasann
	public Spurningar(String spurning, String svarmog1, String svarmog2, String svarmog3, String svarmog4, String rettSvar) {
		this.spurning = spurning;
		this.svarmog1 = svarmog1;
		this.svarmog2 = svarmog2;
		this.svarmog3 = svarmog3;
		this.svarmog4 = svarmog4;
		this.rettSvar = rettSvar;
	}
	
	//föll sem ná í breytur hluta af klasanum
	public String getSpurning(){
		return spurning;
	}
	
	public String getSvarmog1(){
		return svarmog1;
	}
	
	public String getSvarmog2(){
		return svarmog2;
	}
	
	public String getSvarmog3(){
		return svarmog3;
	}
	
	public String getSvarmog4(){
		return svarmog4;
	}
	
	public String getrettSvar(){
		return rettSvar;
	}
}
