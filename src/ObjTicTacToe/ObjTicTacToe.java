package objective;

import java.util.Scanner;

public class ObjTicTacToe {

    public static void main(String[] args) {

        System.out.println("hi");
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj cos: ");
        int x = scanner.nextInt();

        clearScreen();

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}
