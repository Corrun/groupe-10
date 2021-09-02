package jeuDesPetitsCheveaux;

public class Pion {
	private Couleur couleur;
	private int proprietaire;
	private int numPion;
	public char pos;
	public int nbCasesParcourues=1;
	
	public Pion(Couleur couleur,int x, int y,char c) {
		this.couleur = couleur;
		this.proprietaire=x;
		this.numPion=y;
		this.pos=c;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public int getProprietaire() {
		return proprietaire;
	}

	public int getNumPion() {
		return numPion;
	}

	
	
	
	
	
}
