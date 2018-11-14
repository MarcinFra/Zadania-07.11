package ObjTicTacToe;

import java.util.Scanner;

public class ConsoleReader {

    private Scanner scanner;


    public ConsoleReader() {
        scanner = new Scanner(System.in);
    }

    public int readCoordinate(){

        int coordinate = scanner.nextInt();

        return coordinate;
    }

    public String readPlayerName(){

        String string = scanner.toString();

        return string;
    }


}
