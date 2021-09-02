package jeuDesPetitsCheveaux;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Actions {
	public static int rouleDe() {
		Random r = new Random();
		return r.nextInt(6) + 1;
	}
	
	public static void menuPrincipal() throws IOException {
		AffichagePlateau.loadPlateau("src/jeuDesPetitsCheveaux/terrain");
		
	}
	public static boolean aFaitSix() {
		return rouleDe() == 6;
	}
	
	/**
	 * méthode qui permet de choisir le nombre de joueurs humain
	 * remplis les joueurs manquant par des IA.
	 * @return int : le nombre de joueurs
	 * @author anthony.scandella.etu
	 * @version 02/09/2021
	 */
	public static int choixNbJoueur() {
		Scanner scanner = new Scanner( System.in );
		System.out.println(" Nombre de joueurs ?");
		int a=10;
		while (a<0 && a>4) {
		try {
				a= scanner.nextInt();
			
		} catch (Exception exception ) {
				System.out.println("Saisie invalide !");
				choixNbJoueur();
		}	
		System.out.println("res="+a);
		}
		return a;
	}
	
	public static void affichCouleur(Couleur c, String s) {
		System.out.println(c.getCodeCouleur()+s+Couleur.RESET.getCodeCouleur());
	}
	
	/**
	 * méthode qui permet de choisir un pion 
	 * à déplacer parmi ceux à la disposition du joueur
	 * @author romann.cornet.etu
	 * @return pion : le pion choisi
	 * @version 02/09/2021
	 */
	public static Pion choisirPion() {
		Scanner scanner = new Scanner( System.in );
		System.out.println("id?");
		try {
			double a= scanner.nextDouble();
			System.out.println("res="+a);
			
//			for(Case c:Plateau.TERRAIN) {
//				//verif si le pion lui appartient et poser limites
//				if(c.pion.getId()==a ) {
//					return c.pion;
//				}
//			}
			
		} catch (Exception e) {
			System.out.println("Saisie invalide!");
			choisirPion();
		}	
		



		return null;
	}
	
	/**
	 * méthode qui sort un pion de la réserve de pion d'un joueur 
	 * pour le rendre jouable
	 * @param Joueur j : joueur choisi
	 * @return boolean : la réserve est-elle vide ?
	 * @author romann.cornet.etu
	 * @version 02/09/2021
	 */
	public static boolean sortirPionReserve(Joueur j ) {//A FINIRRRRRRRRRRRRRRRRRRRRR il manque la case de départ à vérif si vide
		if(aFaitSix() && j.getNbPionsEnReserve()>0 ) {
			
			j.setNbPionsEnReserve(j.getNbPionsEnReserve()-1);
			return true;
		}
		return false;
	}

		
	public static void retourReserve(Pion p, Joueur j) {
		for(Case c:Plateau.TERRAIN) {
			if(c.pion.equals(p)) {
				c=null;
			}
		}
		j.nbPionsEnReserve++;
	}
	
	public static void mangerPion(Pion loup, Pion mouton) {
		int jLoup=(int)loup.getProprietaire();
		int numPionLoup=(int)loup.getNumPion();
		
		int jMouton=(int)mouton.getProprietaire();
		int numPionMouton=(int)loup.getNumPion();
		
		if(jLoup!=jMouton) {
//			retourReserve(mouton,);
		}
	}
	
	public static void avancer(Pion p, int nbCases) throws IOException {
		for (int j = 0; j < nbCases; j++) {
			if(p.nbCasesParcourues!=40) {
				p.pos++;
				p.nbCasesParcourues++;
			}else if(p.nbCasesParcourues==40 && nbCases==1) {
				
			}
			
		}
		AffichagePlateau.affichagePlateau();
	}


	public static void main(String[] args) throws IOException {
		//menuPrincipal();
		choixNbJoueur();
	}
}
