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
/**
 * 
 * @author <a href="mailto:adnan.kouakoua.etu@univ-lille.fr">Adnân KOUAKOUA</a>
 *         IUT-A Informatique, Université de Lille.
 * @date 1 sept 2021
 */

public class Case {
	
	Pion pion;
	private boolean estSpeciale;
	
	//Constructeur de la classe
	public Case(Pion pion) {
		this.pion=pion;
	}
	
	public Case() {
		this.pion=null;
		this.estSpeciale=false;
	}


	/**
	 * méthode qui vérifie si la case est spéciale
	 * @return boolean
	 * @author julie.catteau4.etu
	 * @version 02/09/2021
	 */

	public Pion getPion() {
		return pion;
	}

	public void setPion(Pion pion) {
		this.pion = pion;
	}

	public boolean isEstSpeciale() {
		return estSpeciale;
	}

	public void setEstSpeciale(boolean estSpeciale) {
		this.estSpeciale = estSpeciale;
	}

	public boolean deviensSpeciale() {
		return this.estSpeciale=true;
	}
	
	/**
	 * méthode qui vérifie si le joueur possède encore un pion 
	 * dans sa réserve de pion
	 * @return boolean
	 * @author julie.catteau4.etu
	 * @version 02/09/2021
	 */
	public boolean presencePion() {
		return this.pion!=null;
	}
}
