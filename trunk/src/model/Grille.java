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

	/** Constante déterminant le nombre de ligne */
	private static final int NUM_LIGNE = 6;
	/** Constante décrivant le nombre de colonne */
	private static final int NUM_COLONNE = 7;

	/** Constante pour que le jeu continue */
	public static final int CONTINUE = 0;
	/** Constante pour la partie est bloqué */
	public static final int STUCK = -1;
	/** Constante pour une partie gagné */
	public static final int WIN = 1;

	/** Grille de jeu */
	private Case[][] grille = new Case[NUM_LIGNE][NUM_COLONNE];

	/**
	 * Constructeur par défaut
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
	 *            Ligne où ajouter
	 * @param column
	 *            Colonne où ajouter
	 * @return 0 partie continue, 1 partie gagné, -1 partie bloqué
	 */
	public int addPiece(Piece piece, int row, int column) {
		if (grille[row][column].isFree())
			grille[row][column].setEtat(piece.getType());
		else
			throw new NoFreeSpaceException("La case suivante est occupée.");

		return checkWin();
	}

	/**
	 * TODO Remplir Methode qui vérifie si la partie est terminé, bloqué ou peut
	 * continuer
	 * 
	 * @return 0 partie continue, 1 partie gagné, -1 partie bloqué
	 */
	private int checkWin() {
		return 0;
	}

	/**
	 * Classe Exception pour gérer les cas où l'on ne peut pas poser une piece
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
