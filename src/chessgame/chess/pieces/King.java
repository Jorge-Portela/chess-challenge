package chessgame.chess.pieces;


import chessgame.chess.ChessPiece;
import chessgame.boardgame.Board;
import chessgame.chess.Color;

public class King extends ChessPiece {
    public King(Board board, Color color){
        super(board,color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
