import java.util.Scanner;

//4. Napisz program, który wczytuje ze standardowego wejścia nieujemną liczbę całkowitą
//        n i wypisuje na standardowym wyjściu element ciągu Fibonacciego o indeksie n.

public class Zadanie4 {
    public static void main(String[] args) {

        int n = setInt();
        int last = countFib(n);
        System.out.println(last);



//        int [] fib = new int[n];
//        fib[0]=1;
//        fib[1]=1;
//
//        for(int i = 0; i<n; i++){
//            if(i>1) {
//                fib[i] = fib[i-1] + fib[i - 2];
//            }
//
//        }

    }

    static int setInt() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita:");
        int n = in.nextInt();
        return n;
    }

    static int countFib(int n) {

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 1; i<n; i++){

            if ( i > 1){
                return fib[i] = fib[i - 1] + fib[i - 2];
            }

        }

//        int[] fib = new int[n];
//        fib[0] = 0;
//        fib[1] = 1;
//
//        for (int i = 1; i < n; i++) {
//            if (i > 1) {
//                fib[i] = fib[i - 1] + fib[i - 2];
//            }
//
//        }
//
//        return fib[fib.length-1];
    return fib[fib.length];
    }
}
