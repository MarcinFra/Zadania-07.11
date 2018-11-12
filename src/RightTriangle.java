import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {

        double a = setSide('a');
        double b = setSide('b');
        double c = setSide('c');
        System.out.println(ifRight(a, b, c));

    }

    static double setSide(char side){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type "+side +" side length: ");
        return scanner.nextDouble();

    }

    static boolean ifRight(double a, double b, double c){
        double squareSumOfCathetus = Math.pow(a,2) + Math.pow(b,2);
        double SquareC = Math.pow(c,2);

        if(squareSumOfCathetus == SquareC){
            return true;
        }else{
            return false;
        }
    }

}
