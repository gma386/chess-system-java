package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //por padr�o ja � nulo, s� est� aqui por visualiza��o e did�tica
	}

	protected Board getBoard() {
		return board;
	}

	
	
}
