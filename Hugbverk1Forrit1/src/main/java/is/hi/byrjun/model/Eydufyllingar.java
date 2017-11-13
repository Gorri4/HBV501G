package is.hi.byrjun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Eydufyllingar")
public class Eydufyllingar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//breta
	private Long id;
	private String spurningEydu;
	private String svarmog1Eydu;
	private String svarmog2Eydu;
	private String svarmog3Eydu;
	private String svarmog4Eydu;
	private String rettSvarEydu;

	
	//Smiður fyrir spurningaklasann
	public Eydufyllingar(String spurningEydu, String svarmog1Eydu, String svarmog2Eydu, String svarmog3Eydu, String svarmog4Eydu, String rettSvarEydu) {
		this.spurningEydu = spurningEydu;
		this.svarmog1Eydu = svarmog1Eydu;
		this.svarmog2Eydu = svarmog2Eydu;
		this.svarmog3Eydu = svarmog3Eydu;
		this.svarmog4Eydu = svarmog4Eydu;
		this.rettSvarEydu = rettSvarEydu;
	}
	
	public Eydufyllingar(){
		
	}
	
	//föll sem ná í breytur hluta af klasanum
	public String getSpurning(){
		return spurningEydu;
	}
	
	public String getSvarmog1(){
		return svarmog1Eydu;
	}
	
	public String getSvarmog2(){
		return svarmog2Eydu;
	}
	
	public String getSvarmog3(){
		return svarmog3Eydu;
	}
	
	public String getSvarmog4(){
		return svarmog4Eydu;
	}
	
	public String getrettSvar(){
		return rettSvarEydu;
	}
}
