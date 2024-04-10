package chessgame.application;

import chessgame.boardgame.Board;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        Board board = new Board(8, 8);


        reader.close();
    }
}