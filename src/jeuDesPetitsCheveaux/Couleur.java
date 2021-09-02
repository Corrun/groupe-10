package jeuDesPetitsCheveaux;
/**
 * 
 * @author <a href="mailto:romann.cornet.etu@univ-lille.fr">Romann CORNET</a>
 *         IUT-A Informatique, Université de Lille.
 * @date 1 sept 2021
 */

public enum Couleur{
	RESET("\u001B[0m"),ROUGE("\u001B[31m"),BLEU("\u001B[34m"),JAUNE("\u001B[33m"),VERT("\u001B[32m");
	
	private String codeCouleur;

	
	//code couleur ANSI
	private Couleur( String codeCouleur ) {
		this.codeCouleur=codeCouleur;
				
	}
	
	public String getCodeCouleur() {
		return this.codeCouleur;
	}
	

}
