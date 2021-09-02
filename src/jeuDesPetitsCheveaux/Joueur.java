package jeuDesPetitsCheveaux;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * Cette classe sert à .........
 *
 * @author <a href="mailto:adnan.kouakoua@univ-lille1.fr">Adnân KOUAKOUA</a>
 * IUT-A Informatique, Universite de Lille.
 * @date 2 sept. 2021
 * @version XX
 */
public class Joueur extends Utilisateur{

	public Joueur(String nom) {
		super(nom);
	}
	
	@Override
	protected boolean estUneIA() {
		return false;
	}

	public String getPseudo() {
		return super.PSEUDO;
	}

	public int getNbPionsEnReserve() {
		return nbPionsEnReserve;
	}

	public void setNbPionsEnReserve(int nbPionsEnReserve) {
		this.nbPionsEnReserve = nbPionsEnReserve;
	}

	
}
