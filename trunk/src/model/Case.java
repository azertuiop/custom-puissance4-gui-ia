/**
 * 
 */
package model;

/**
 * 
 * Case de jeu sur la grille
 * 
 * @author Andrea
 * @version 1.0
 * @date 10 sept. 2009 2009
 * 
 */
public class Case {

	/** Etat d'une caseee */
	private int etat;

	public static final int CASE_VIDE = 0;

	/**
	 * Case de jeu, utiliser les constantes
	 * 
	 * @param etat
	 *            Etat de la case
	 * @exception - Si etat non valide
	 */
	public Case(int etat) {
		if (!Case.isValid(etat))
			throw new IllegalArgumentException("Etat non homologu�");

		this.etat = etat;
	}

	/** Constructeur par d�faut, Case vide */
	public Case() {
		this(Case.CASE_VIDE);
	}

	/**
	 * @return the etat
	 */
	public int getEtat() {
		return etat;
	}

	/**
	 * @param etat
	 *            the etat to set
	 */
	public void setEtat(int etat) {
		this.etat = etat;
	}

	/** Teste la validit� d'une case */
	public static boolean isValid(int etat) {
		return Piece.isValid(etat) || etat == Case.CASE_VIDE;
	}

	public boolean isFree() {
		return etat == 0;
	}
}
