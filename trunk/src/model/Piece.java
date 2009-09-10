/**
 * 
 */
package model;

/**
 * Classe d�crivant les pi�ces du jeu
 * 
 * @author Andrea
 * @version 1.0
 * @date 10 sept. 2009 2009
 * 
 */
public class Piece {

	/**
	 * Piece Jaune
	 * 
	 * @see Piece#type
	 */
	public static final int PIECE_JAUNE = 1;
	/**
	 * Piece Rouge
	 * 
	 * @see Piece#type
	 */
	public static final int PIECE_ROUGE = 2;

	/*
	 * Pour eviter de recreer des pieces...
	 */
	// public static final Piece PION_ROUGE = new Piece(PIECE_ROUGE);
	// public static final Piece PION_JAUNE = new Piece(PIECE_JAUNE);
	/** Type de pi�ce */
	private int type;

	/**
	 * Constructeur par d�faut d'une piece, conseill� d'utiliser les constantes
	 * 
	 * @param type
	 *            Type de piece
	 * @exception - Si etat non valide
	 */
	public Piece(int type) {
		if (Piece.isValid(type))
			throw new IllegalArgumentException("Piece non homologu�e.");

		this.type = type;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	private void setType(int type) {
		this.type = type;
	}

	/** Teste la validit� d'une piece */
	public static boolean isValid(int type) {
		return type == Piece.PIECE_JAUNE || type == Piece.PIECE_ROUGE;
	}

}
