
package is.hi.byrjun.controller;

public class SpurningaHandler {
	Spurningar[] spurningaFylki = new Spurningar[4];
	DatabaseManager dm = new DatabaseManager();
	String[] choices;

	Spurningar eyd1 = new Spurningar("Mér finnst gaman að ______ í sjónum","skrifa","synda","baka","lesa","synda");
	Spurningar eyd2 = new Spurningar("Ég ______ á sjónvarpið","hoppa","borða","horfi","æli","horfi");
	Spurningar eyd3 = new Spurningar("Karlinn ______ á tölvunni","hleypur","kveikir","rífur","syngur","kveikir");
	Spurningar eyd4 = new Spurningar("Barnið ______ mömmu sína","leiðir","les","syngur","syndir","leiðir");
	Spurningar eyd5 = new Spurningar("Rithöfundurinn ______ bók","bakar","hleypur","kveikir","skrifar","skrifar");
	Spurningar eyd6 = new Spurningar("Mamma ______ köku","bakar","rífur","hleypur","syngur","bakar");
	Spurningar eyd7 = new Spurningar("Hlauparinn ______ 4 km","leiðir","syngur","hleypur","kveikir","hleypur");
	
	
	Spurningar[] eyduFyllingar = {eyd1, eyd2, eyd3, eyd4, eyd5, eyd6, eyd7};

	
	public SpurningaHandler() {
		
		for(int i = 0; i < spurningaFylki.length ; i++) {
			choices = dm.getChoices(i+1);
			spurningaFylki[i] = new Spurningar(dm.getQuestion(i+1),choices[0],choices[1],choices[2],choices[3],dm.getAnswer(i+1));
			}
		System.out.println(spurningaFylki[0].getSpurning());
	}
	
	public Spurningar getSpurning(int i){
		return spurningaFylki[i];
	}
	
	public Spurningar getEydufyllingar(int i) {
		return eyduFyllingar[i];
	}
	
	
}

