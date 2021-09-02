package jeuDesPetitsCheveaux;
/**
 * 
 * 
 * @author anthony.scandella.etu
 * @date 2 sept. 2021
 */

public class Ia extends Utilisateur{

	public Ia(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean estUneIA() {
		return true;
	}

}
