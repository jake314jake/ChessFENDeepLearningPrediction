package FEN.parser;

public enum Piece {
	whitePawn('P'),
	whiteKnight('N'),
	whiteBishop('B'),
	whiteRook('R'),
	whiteQueen('Q'),
	whiteKing('K'),
	blackPawn('p'),
	blackKnight('n'),
	blackBishop('b'),
	blackRock('r'),
	blackQueen('q'),
	blackKing('k');
	
	final char pieceNotation ;
	Piece(char pieceNotation){
		this.pieceNotation=pieceNotation;
	}
	static boolean isPiece(char pieceNotation) {
		for(Piece pn : Piece.values() ) {
			if (pn.pieceNotation==(pieceNotation))
				return true;
			
			
		}
		return false;
		
	}
}
