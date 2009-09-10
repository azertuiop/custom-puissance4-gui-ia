/**
 * 
 */
package model;

import java.util.Stack;

/**
 * Représente un joueur et ses caractéristiques
 * 
 * @author Andrea
 * @version 1.0
 * @date 10 sept. 2009 2009
 * 
 */
public class Joueur {

	/** Pile de jetons */
	private Stack<Piece> pilePion;

	/** Nombre de pions par joueur */
	private static final int MAX_PION = 21;

	public Joueur(int numero) {
		if (!Piece.isValid(numero))
			throw new IllegalArgumentException(
					"Il n'y a que deux joueurs différent possible.");

		for (int i = 0; i < MAX_PION; i++)
			pilePion.push(new Piece(numero));

		// Autre version que je propose pour éviter de faire des tonnes de
		// 'new'...
		//		
		// if (numero == Piece.PIECE_JAUNE)
		// for (int i = 0; i < MAX_PION; i++)
		// pilePion.push(Piece.PION_JAUNE);
		// else
		// for (int i = 0; i < MAX_PION; i++)
		// pilePion.push(Piece.PION_ROUGE);
	}
}
