package is.hi.byrjun.controller;

public class SpurningaHandler {
	
	DatabaseManager dm = new DatabaseManager();
	String[] choices = dm.getChoices(2);
	//virkar
	
	Spurningar spurn1 = new Spurningar(dm.getQuestion(2),choices[0],choices[1],choices[2],choices[3],dm.getAnswer(2));
	Spurningar spurn2 = new Spurningar("Orange","Pera","Appelsína","Vínber","Epli","Appelsína");
	Spurningar spurn3 = new Spurningar("Man","Kona","Vatn","Strákur","Maður","Maður");
	Spurningar spurn4 = new Spurningar("Boy","Kona","Vatn","Strákur","Maður","Strákur");
	Spurningar spurn5 = new Spurningar("Woman","Maður","Kona","Strákur","Vatn","Kona");
	Spurningar spurn6 = new Spurningar("Table","Borð","Stóll","Sófi","Rúmföt","Borð");
	Spurningar spurn7 = new Spurningar("Chair","Borð","Rúmföt","Stóll","Fiskur","Borð");
	
	Spurningar eyd1 = new Spurningar("Mér finnst gaman að ______ í sjónum","skrifa","synda","baka","lesa","synda");
	Spurningar eyd2 = new Spurningar("Ég ______ á sjónvarpið","hoppa","borða","horfi","æli","horfi");
	Spurningar eyd3 = new Spurningar("Karlinn ______ á tölvunni","hleypur","kveikir","rífur","syngur","kveikir");
	Spurningar eyd4 = new Spurningar("Barnið ______ mömmu sína","leiðir","les","syngur","syndir","leiðir");
	Spurningar eyd5 = new Spurningar("Rithöfundurinn ______ bók","bakar","hleypur","kveikir","skrifar","skrifar");
	Spurningar eyd6 = new Spurningar("Mamma ______ köku","bakar","rífur","hleypur","syngur","bakar");
	Spurningar eyd7 = new Spurningar("Hlauparinn ______ 4 km","leiðir","syngur","hleypur","kveikir","hleypur");
	
	
	Spurningar[] spurningaFylki = {spurn1, spurn2,spurn3,spurn4,spurn5,spurn6,spurn7};
	Spurningar[] eyduFyllingar = {eyd1, eyd2, eyd3, eyd4, eyd5, eyd6, eyd7};
	
	
	public SpurningaHandler(){
	}
	
	public Spurningar getSpurning(int i){
		return spurningaFylki[i];
	}
	
	public Spurningar getEydufyllingar(int i) {
		return eyduFyllingar[i];
	}
	
	
}
