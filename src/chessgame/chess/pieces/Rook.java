package chessgame.chess.pieces;


import chessgame.boardgame.Board;
import chessgame.chess.ChessPiece;
import chessgame.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color){
        super(board,color);
    }

    @Override
    public String toString(){
        return "R";
    }

}
