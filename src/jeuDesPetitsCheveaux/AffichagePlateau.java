/**
 * 
 */
package jeuDesPetitsCheveaux;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author julie.catteau4.etu
 * @date 2 sept. 2021
 * @version 01/09/2021
 */
public class AffichagePlateau {
	public static Pion p= new Pion(Couleur.JAUNE,3,1,'A');

	
	private static BufferedReader lecteurAvecBuffer;
	
	/**
	 * permet de lire ligne par ligne un fihier txt puis l'affiche
	 * @param String url : le chemin du fichier txt
	 * @author julie.catteau4.etu
	 * @version 01/09/2021
	 */
	public static void loadPlateau(String url) throws IOException {
		lecteurAvecBuffer=null;
	    String ligne;
 
	    try{
	    	lecteurAvecBuffer = new BufferedReader(new FileReader(new File(url)));
	    }catch(FileNotFoundException e){
	    	System.out.println("Impossible d'ouvrir le fichier !");
	    }
	    
	    try {
	    	while ((ligne = lecteurAvecBuffer.readLine()) != null) {
		    	System.out.println(ligne);
		    }
		    lecteurAvecBuffer.close();
	    }catch(NullPointerException n) {
	    	System.out.println("Impossible de lire le fichier !");
	    }
	    
	}
	
	/**
	 * permet de lire caractère par caractère un fichier txt 
	 * puis de le stocker dans une array 2D de char
	 * @param String url : le chemin du fichier txt
	 * @return char[][]
	 * @author julie.catteau4.etu
	 * @version 01/09/2021
	 */
	public static char[][] printPlateau(String url) throws IOException {
		lecteurAvecBuffer = null;
		int ca;
		char c;
		char[][] cases = new char[11][11];
		
		try{
	    	lecteurAvecBuffer = new BufferedReader(new FileReader(new File(url)));
	    }catch(FileNotFoundException e){
	    	System.out.println("Impossible d'ouvrir le fichier !");
	    }
		
		try {
			int idxL = 0;
			int idxC = 0;
			while ((ca = lecteurAvecBuffer.read()) != -1) {
				c = (char) ca;
				if(c=='\n') {
			    	idxL++;
			    	idxC=0;
			    }else{
			    	cases[idxL][idxC]=c;
			    	idxC++;
			    }
			}
			lecteurAvecBuffer.close();
		}catch(NullPointerException n) {
		    System.out.println("Impossible de lire le fichier !");
		}
		return cases;
	}
	
	/**
	 * Affiche le plateau et colore les caractères 
	 * correspondant aux pions.
	 * @author julie.catteau4.etu
	 * @version 01/09/2021
	 */
	public static void affichagePlateau() throws IOException {
		char[][] cases = printPlateau("src/jeuDesPetitsCheveaux/plateau");
		char car;
		for(int idxL=0; idxL<cases.length; idxL++) {
			for(int idxC=0; idxC<cases.length; idxC++) {
				car = cases[idxL][idxC];
				if(car==p.pos) {
			    	System.out.print("[33m♞[0m");
			    }else if((car>='A' && car<='h')) {
					System.out.print("○");
				}else if(car=='@') {
			    	System.out.print("[31m♞[0m");
			    }else if(car=='&') {
			    	System.out.print("[34m♞[0m");
			    }else if(car=='!') {
			    	System.out.print("[33m♞[0m");
			    }else if(car=='?') {
			    	System.out.print("[32m♞[0m");
			    }else {
					System.out.print(car);
				}
//				if(car==p.pos) {
//			    	System.out.print("j");
//			    }else if((car>='A' && car<='f')) {
//					System.out.print("○");
//				}else if(car=='@') {
//			    	System.out.print("r");
//			    }else if(car=='&') {
//			    	System.out.print("b");
//			    }else if(car=='!') {
//			    	System.out.print("j");
//			    }else if(car=='?') {
//			    	System.out.print("v");
//			    }else {
//					System.out.print(car);
//				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws IOException {
		//loadPlateau("src/jeuDesPetitsCheveaux/terrain");
		affichagePlateau();
		Scanner s=new Scanner(System.in);
		int i;
		while(true) {
			i=s.nextInt();

			Actions.avancer(p, i);
		}
		
	}

}
