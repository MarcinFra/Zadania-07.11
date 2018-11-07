import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita:");
        int n = in.nextInt();

        int [] fib = new int[n];
        fib[0]=1;
        fib[1]=1;

        for(int i = 0; i<n; i++){
            if(i>1) {
                fib[i] = fib[i-1] + fib[i - 2];
            }

        }


        System.out.println(fib[n-1]);

    }


}
