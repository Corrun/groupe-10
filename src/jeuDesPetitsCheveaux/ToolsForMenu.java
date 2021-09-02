package jeuDesPetitsCheveaux;
import java.io.IOException;
import java.util.Scanner;

/**
 * Classe qui permet de faciliter la création et l'affichage de menus sur le terminal/console
 * @author Hugo Roux
 * @version 02/09/2021
 */

public class ToolsForMenu {
	
	/**
	 * demande à l'utilisateur un d'entrer des caractères
	 * @author Hugo ROUX
	 * @version 02/09/2021
	 */
	public static String AskForString() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
	
	/**
	 * affiche dans la console les options possbles
	 * @param skipALine (boolean) : savoir si on passe une ligne avent d'afficher les options 
	 * @param listOfOptions (String[]) : la list d'option à afficher
	 * @author Hugo ROUX
	 * @version 02/09/2021
	 */
	public static void ListOfoptions(boolean skipALine, String[] listOfoptions) {
		if (skipALine) System.out.println();
		System.out.println("Veuillez choisir une option :");
		for (int l = 0; l < listOfoptions.length; ++l) {
			System.out.println((l+1) + " - " + listOfoptions[l]);
		}
	}
	
	/**
	 * nettoie l'écran dans le terminal et repose le curseur en haut à gauche de la console
	 * @author Hugo ROUX
	 * @version 02/09/2021
	 */
    public static void clearScreen() {
        System.out.print("\u001b[2J");
        cursor(0,0);
    }
    
    /**
	 * repositionne le cursor à la position demandée
	 * @param line (int) : la ligne de la nouvelle position du curseur
	 * @param column (int) : la colonne de la nouvelle position du curseur
	 * @author Hugo ROUX
	 * @version 02/09/2021
	 */
    public static void cursor(int line, int column) {
        System.out.print("\u001b[" + line + ";" + column + "H");
    }
    
    public static int EnterNumber(char min, char max) {
		String inputString  = AskForString();
        if (inputString.length() == 1 && inputString.charAt(0) >= min && inputString.charAt(0) <= max){
            char charNombre = inputString.charAt(0); 
            int nombre = charNombre -'0';
            return nombre;
        } else {
            System.out.println("Valeur invalide, réessayez : ");
            return EnterNumber(min, max);
        }
    }
    
    /**
	 * Permet de naviguer entre plusieurs fichiers
	 * @param pages (String[]) nom des fichiers .txt à naviguer
	 * @author Hugo ROUX
	 * @version 02/09/2021
     * @throws IOException 
	 */
    
    public static void FileNavigator (String[] pages) throws IOException {
    	int choice = 1;
    	while (choice != 0) {
    		clearScreen();
    		AffichagePlateau.loadPlateau(pages[choice-1]);
    		System.out.println();
    		System.out.println("Veuillez choisir un numéro de page : (actuel " + choice + " sur " + pages.length + ") ou 0 pour quitter");
    		choice = EnterNumber('0', Character.forDigit(pages.length, 10));
    	}
    }
    
}
