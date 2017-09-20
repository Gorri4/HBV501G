package is.hi.byrjun.controller;

public class Spurningar {
	
	
	private String spurning;
	private String svarmog1;
	private String svarmog2;
	private String svarmog3;
	private String svarmog4;
	private String rettSvar;
	
	public Spurningar(String spurning, String svarmog1, String svarmog2, String svarmog3, String svarmog4, String rettSvar) {
		this.spurning = spurning;
		this.svarmog1 = svarmog1;
		this.svarmog2 = svarmog2;
		this.svarmog3 = svarmog3;
		this.svarmog4 = svarmog4;
		this.rettSvar = rettSvar;
	}

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
