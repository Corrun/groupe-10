package jeuDesPetitsCheveaux;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class CasesSpeciales extends Case{
	private static String[][] questions = new String[30][5];
	
	public CasesSpeciales() {
		super();
	}
	
	public static String[][] csvToTab(String filename) throws FileNotFoundException, IOException{
		try (BufferedReader br = new BufferedReader(new FileReader("src/jeuDesPetitsCheveaux/"+filename+".csv"))) {
		    String line;
		    int idxL=0;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(",");
		        for(int idxC=0; idxC<values.length; idxC++) {
		        	questions[idxL][idxC]=values[idxC];
		        }
		        idxL++;
		    }
		}
		return questions;
	}
	
	public static String saisieQCM(){
		Scanner tmp = new Scanner(System.in);
		String reponse = "D";
		while (!reponse.equals("A") && !reponse.equals("B") && !reponse.equals("C")){
			System.out.println("Pour répondre choisis la lettre qui correspond à ta réponse : soit A, B ou C");
			reponse = tmp.next();
		}
		return reponse;
	}
	
	public static int afficherQuestions(String[][] questions) {
		Random rand = new Random();
		int ligne = rand.nextInt(30);
		char lettre = 'A';
		final int idLettre=1;
		System.out.println(questions[ligne][0]);
		for(int idxC=1; idxC<4; idxC++) {
			System.out.print(lettre+"."+questions[ligne][idxC]+" ");
			lettre = (char) (lettre + idLettre);
		}
		System.out.println();
		return ligne;
	}
	
	
	public static boolean bonneReponse(String reponse, int ligne) {
		return questions[ligne][4].equals(reponse);
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int ligne = afficherQuestions(csvToTab("enigmes"));
		String reponse = saisieQCM();
		if(bonneReponse(reponse, ligne)) {
			System.out.println("gagnee");
		}else {
			System.out.println("perdu");
		}
		
	}
}
