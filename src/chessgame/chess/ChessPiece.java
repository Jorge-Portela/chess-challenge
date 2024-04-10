package chessgame.chess;

import chessgame.boardgame.Piece;
import chessgame.boardgame.Board;


public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(){}

    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    
}
