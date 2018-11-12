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

    static int countFibonacci(int numberToCount){

        if(numberToCount == 0){
            return 0;
        }else if(numberToCount ==1){
            return 1;
        }else{
         return countFibonacci(numberToCount-1) + countFibonacci(numberToCount-2);
        }
    }

    static void showFibNumber(int fibonnaciNumber){
        System.out.println(fibonnaciNumber);
    }


}
