import java.util.Scanner;

public class Zadanie {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe 1:");
        int firstNumber = in.nextInt();
        System.out.println("Podaj liczbe 2:");
        int secondNumber = in.nextInt();
        System.out.println("Podaj liczbe 3:");
        int thirdNumber = in.nextInt();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

        double avg = (firstNumber + secondNumber + thirdNumber)/3;

        System.out.println(avg);



        

    }

}
