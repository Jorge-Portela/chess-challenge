package chessgame.application;

import chessgame.boardgame.Board;
import chessgame.chess.ChessMatch;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

        reader.close();
    }
}
