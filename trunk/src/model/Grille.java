/**
 * 
 */
package model;

/**
 * 
 * Grille de Jeu
 * 
 * @author Andrea
 * @version 1.0
 * @date 10 sept. 2009 2009
 * 
 */
public class Grille {

	/** Constante d�terminant le nombre de ligne */
	private static final int NUM_LIGNE = 6;
	/** Constante d�crivant le nombre de colonne */
	private static final int NUM_COLONNE = 7;

	/** Constante pour que le jeu continue */
	public static final int CONTINUE = 0;
	/** Constante pour la partie est bloqu� */
	public static final int STUCK = -1;
	/** Constante pour une partie gagn� */
	public static final int WIN = 1;

	/** Grille de jeu */
	private Case[][] grille = new Case[NUM_LIGNE][NUM_COLONNE];

	/**
	 * Constructeur par d�faut
	 */
	public Grille() {
		for (Case[] ligne : grille)
			for (Case caseJeu : ligne)
				caseJeu = new Case();
	}

	/**
	 * Ajoute une piece a la grille de jeu
	 * 
	 * @param piece
	 *            Piece a ajouter
	 * @param row
	 *            Ligne o� ajouter
	 * @param column
	 *            Colonne o� ajouter
	 * @return 0 partie continue, 1 partie gagn�, -1 partie bloqu�
	 */
	public int addPiece(Piece piece, int row, int column) {
		if (grille[row][column].isFree())
			grille[row][column].setEtat(piece.getType());
		else
			throw new NoFreeSpaceException("La case suivante est occup�e.");

		return checkWin();
	}

	/**
	 * TODO Remplir Methode qui v�rifie si la partie est termin�, bloqu� ou peut
	 * continuer
	 * 
	 * @return 0 partie continue, 1 partie gagn�, -1 partie bloqu�
	 */
	private int checkWin() {
		return 0;
	}

	/**
	 * Classe Exception pour g�rer les cas o� l'on ne peut pas poser une piece
	 * 
	 * @author Andrea
	 * @version 1.0
	 * @date 10 sept. 2009 2009
	 * 
	 */
	class NoFreeSpaceException extends RuntimeException {

		public NoFreeSpaceException(String mess) {
			super(mess);
		}
	}
}
