package chess.application;

import chess.boardGame.Position;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner reader = new Scanner(System.in);

        Position ps1 = new Position(reader.nextInt(), reader.nextInt());

        System.out.println(ps1);


        reader.close();
    }
}
