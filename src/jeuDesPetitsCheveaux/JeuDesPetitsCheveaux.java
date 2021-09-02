/*
 * This file is licensed to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package jeuDesPetitsCheveaux;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
/**
 * 
 * Cette classe sert à .........
 *
 * @author <a href="mailto:adnan.kouakoua@univ-lille1.fr">Adnân KOUAKOUA</a>
 * IUT-A Informatique, Universite de Lille.
 * @date 2 sept. 2021
 */
public class JeuDesPetitsCheveaux {
	
	protected Scanner scanner = new Scanner(System.in); 
	private List<Utilisateur> utilisateurs= new ArrayList<>();

	private static final int NOMBREMAXJOUEUR=4;
	
	public JeuDesPetitsCheveaux(List<Joueur> joueurs) {
		if(joueurs.size()>4) {
			for(int i=0; i<4;i++) {
				addUtilisateur(utilisateurs.get(i));
			}
		}
		else {
			for(int i=0; i<joueurs.size();i++) {
				addUtilisateur(utilisateurs.get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		//Actions.affichCouleur(Couleur.ROUGE,"NAPS GOAT");
		System.out.println("[31mNAPS GOAT[0m");
	}

	private void attributionDesJoueurs() {
		System.out.println("");
		
		System.out.println();
	}
												
	
	
	
	
	public Utilisateur aGagner () {

		for(int i=0; i< utilisateurs.size();i++) {
			
			Utilisateur joueur =this.utilisateurs.get(i);
			
			if(joueur.nbPionsEnReserve==0) {
				for(int j=0;j<4;j++) {
					if(joueur.getEcurie()[j] == null) return null;
					
				}
				return joueur;
			}
		}

		return null;
		
	}
	
	
	
	
	
	
	private void ajouterJoueur() {
		int nombreBot=0;
		String entree="";
		if(utilisateurs.size()<4) {
			System.out.println("Ajouter un utilisateur :");
			System.out.println("Souhaitez-vous qu'il soit un joueur ou une IA ?");
			entree=scanner.next();
			while(!entree.toLowerCase().equals("ia") || !entree.toLowerCase().equals("joueur")) {
				entree=scanner.next();
			}
			if(entree.toLowerCase().equals("IA")) {
				nombreBot++;
				
				addUtilisateur(new Ia("bot n°"+nombreBot));
			}
			if(entree.toLowerCase().equals("joueur")) {
				System.out.println("choissisez un pseudo :");
				entree=scanner.next();
				addUtilisateur(new Joueur(entree));
			}
			
		}
	}
	
	private boolean addUtilisateur(Utilisateur u) {
		if(utilisateurs.size()<=NOMBREMAXJOUEUR) {
			utilisateurs.add(u);
			return true;
		}
		return false;
	}
	
	
	public Set<Integer> coupsPossibles(){
		return null;
	}
	
	//public List<>coupsPossibles() {
	
	

}
