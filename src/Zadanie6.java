import java.util.Scanner;

public class Zadanie6 {

    static void dodawanie(int a, int b) {

        System.out.println(a + b);
        System.out.println();

    }

    static void odejmowanie(int a, int b) {

        System.out.println(a - b);
        System.out.println();

    }

    static void mnozenie(int a, int b) {

        System.out.println(a * b);
        System.out.println();

    }

    static void dzielenie(int a, int b) {

        System.out.println(a / b);
        System.out.println();

    }

    static int chooseOperation(int choose, int firstNumber, int secondNumber, Scanner in){

        System.out.println("wybierz operacje");
        System.out.println();
        choose = in.nextInt();

        switch (choose) {
                case 1:
                    dodawanie(firstNumber, secondNumber);
                    break;
                case 2:
                    odejmowanie(firstNumber, secondNumber);
                    break;
                case 3:
                    mnozenie(firstNumber, secondNumber);
                    break;
                case 4:
                    dzielenie(firstNumber, secondNumber);
                    break;

            }
            return choose;

    }

    static void menu(){


        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnozenie");
        System.out.println("4. dzielenie");
        System.out.println("9. wyjdz");
        System.out.println();

    }

    static int setInt(int number, Scanner in){
        System.out.println("Podaj "+number+" liczbe: ");
        int inputNumber = in.nextInt();
        return inputNumber;
    }

    public static void main(String[] args) {

        int choose = 0;
        Scanner in = new Scanner(System.in);


        while ( choose!=9){

            menu();

            int firstNumber = setInt(1, in);

            int secondNumber = setInt(2, in);

            choose = chooseOperation(choose, firstNumber, secondNumber, in);

//            switch (choose) {
//                case 1:
//                    dodawanie(firstNumber, secondNumber);
//                    break;
//                case 2:
//                    odejmowanie(firstNumber, secondNumber);
//                    break;
//                case 3:
//                    mnozenie(firstNumber, secondNumber);
//                    break;
//                case 4:
//                    dzielenie(firstNumber, secondNumber);
//                    break;
//
//            }


        }


    }
}
