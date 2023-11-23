package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //por padrão ja é nulo, só está aqui por visualização e didática
	}

	protected Board getBoard() {
		return board;
	}

	
	
}
