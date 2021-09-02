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

import java.io.IOException;
import java.util.Scanner;

public class MainLoop {
	protected Scanner scanner = new Scanner(System.in); 
	protected final static String CMD_NEW = "n" ;
	protected final static String CMD_HELP = "h" ;
	protected final static String CMD_QUIT = "q" ;
	
	private static void MenuPrincipal() {
		ToolsForMenu.clearScreen();
		try {
			AffichagePlateau.loadPlateau("src/jeuDesPetitsCheveaux/jeudeschevaux");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String[] s = new String[] {"Jouer","Règles","Quitter"};
		ToolsForMenu.ListOfoptions(false, s);

		int choice = ToolsForMenu.EnterNumber('1', '3');
		
		switch(choice) {
			case 1: MenuJouer(); break;
			case 2: MenuRegles(); break;
			default: System.out.println(); break; 
		}
	}
	
	private static void MenuJouer() {
		ToolsForMenu.clearScreen();
		int nbJoueurs = Actions.choixNbJoueur();
		System.out.println("Fin");
	}
	
	private static void MenuRegles() {
		ToolsForMenu.clearScreen();
		try {
			AffichagePlateau.loadPlateau("src/jeuDesPetitsCheveaux/règles");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		MenuPrincipal();
	
	}
}
