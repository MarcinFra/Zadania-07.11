//5. Napisz program, który wczytuje ze standardowego wejścia nieujemną liczbę całkowitą n i
//        wypisuje na standardowym wyjściu sumę kwadratów liczb od 0 do n, czyli wartość 0^2 + 1^2 + 3^2 + ... + n^2.

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {


        int n = setInt();

        double sum = countSum(n);



        System.out.println(sum);

    }

    static int setInt(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita:");
        int n = in.nextInt();

        return n;
    }

    static double countSum(int n){
        double sum = 0.0;
        for(double i = 0.0; i<n; i++) {

            sum = sum + Math.pow(i, 2);
        }

        return sum;
    }

}
