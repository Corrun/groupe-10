package jeuDesPetitsCheveaux;

public enum Action {
	REJOUER("Vous pouvez rejouer", Actions.rouleDe());
	String message;
	int resultatDeAction;
	
	//Constructeur de la classe
	private Action(String message, int rouleDe) {
		
		this.message=message;
		this.resultatDeAction=rouleDe;
	}
}
