package jeuDesPetitsCheveaux;

/**
 * 
 *  * @author anthony.scandella.etu
 * @date 2 sept. 2021
 */
public abstract class Utilisateur {
	
	public final String PSEUDO;
	public int nbPionsEnReserve = 4;
	private final Pion[] ecurie = new Pion[4];
	
	protected abstract boolean estUneIA();
	
	public Utilisateur(String nom) {
		
		this.PSEUDO=nom;
	}
	
	public int getNbPionsEnReserve() {
		
		return nbPionsEnReserve;
	}
	
	public Pion[] getEcurie() {
		
		Pion[]ecurie = new Pion[this.ecurie.length];
		for(int i=0 ; i< this.ecurie.length;i++) {
			
			ecurie[i]=this.ecurie[i];
		}
		
		return ecurie;
	}
}
