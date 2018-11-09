//2. Napisz program, który wczytuje ze standardowego wejścia liczbę całkowitą
//n i wypisuje na standardowe wyjście wartość bezwzględną z n.


import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {


        int number = readNumberFromConsole(1);
        int abs = number;

        System.out.println("wartosc bezwzgledna: " + abs);


//        Scanner in = new Scanner(System.in);
//        System.out.println("wpisz liczbe calkowita");
//        int n = in.nextInt();
//
//        if(n<0){
//            n *= -1;
//        }
//        System.out.println(n);
//


    }

    static int readNumberFromConsole(int i){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe " + i);
        int firstNumber = in.nextInt();
        return firstNumber;
    }

}
