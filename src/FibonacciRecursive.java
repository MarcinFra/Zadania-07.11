import java.util.Scanner;

public class FibonacciRecursive {

    public static void main(String[] args) {

        int numberToCount = setElement();
        int fibonnaciNumber = countFibonacci(numberToCount);
        showFibNumber(fibonnaciNumber);

    }

    static int setElement(){
        int numberToCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        return scanner.nextInt();
    }

    static int countFibonacci(int n){

        return n<2 ? n:countFibonacci(n-1) + countFibonacci(n-2);
    }

    static void showFibNumber(int fibonnaciNumber){
        System.out.println(fibonnaciNumber);
    }


}
