package ObjTicTacToe;

import java.util.Scanner;

public class Game {

    int x;
    int y;

    public void inputCoordinates(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz x: ");
        x = scanner.nextInt();
        System.out.println("wpisz y: ");
        y = scanner.nextInt();
    }


}
