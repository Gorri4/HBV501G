package is.hi.byrjun.controller;

public class SpurningaHandler {
	
	
	
	Spurningar spurn1 = new Spurningar("Apple","Appelsína","Pera","Epli","Ananas","Epli");
	Spurningar spurn2 = new Spurningar("Orange","Pera","Appelsína","Vínber","Epli","Appelsína");
	Spurningar spurn3 = new Spurningar("Man","Kona","Vatn","Strákur","Maður","Maður");
	Spurningar spurn4 = new Spurningar("Boy","Kona","Vatn","Strákur","Maður","Strákur");
	Spurningar spurn5 = new Spurningar("Woman","Maður","Kona","Strákur","Vatn","Kona");
	Spurningar spurn6 = new Spurningar("Table","Borð","Stóll","Sófi","Rúmföt","Borð");
	Spurningar spurn7 = new Spurningar("Chair","Borð","Rúmföt","Stóll","Fiskur","Borð");
	
	Spurningar[] spurningaFylki = {spurn1, spurn2,spurn3,spurn4,spurn5,spurn6,spurn7};
	
	public SpurningaHandler(){
	}
	
	public Spurningar getSpurning(int i){
		return spurningaFylki[i];
	}
	
	
}
