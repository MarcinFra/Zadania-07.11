import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita:");
        int n = in.nextInt();
        double sum = 0.0;


        for(double i = 0.0; i<n; i++){

            sum = sum + Math.pow(i,2);


        }
        System.out.println(sum);

    }

}
