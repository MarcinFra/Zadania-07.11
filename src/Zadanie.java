//1. Napisz program, który wczytuje ze standardowego wejścia trzy liczby całkowite
//i wypisuje na standardowym wyjściu ich średnią arytmetyczną.

import java.util.Scanner;


public class Zadanie {

    static int setNumber(int i){

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe " + i);
        int firstNumber = in.nextInt();

        return firstNumber;
    }

    static int sumInts(int [] number){

        int i;
        int sum = 0;
        for(i = 0; i<=2; i++){
            number[i] = setNumber(i);
            sum += number[i];
        }
        return sum;
    }

    static double countAvg(int sum){
        double avg = sum/3;
        return avg;
    }


    public static void main(String[] args) {

        int [] number = new int [3];





    }

}
