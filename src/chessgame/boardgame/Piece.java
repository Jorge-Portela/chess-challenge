package chessgame.boardgame;

public class Piece {
    protected Position position;
     private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    //Access allowed only for subclasses or classes of the same package
    protected Board getBoard() {
        return board;
    }
}
