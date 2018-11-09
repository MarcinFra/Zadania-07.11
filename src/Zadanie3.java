//3. Napisz program, który wczytuje ze standardowego wejścia trzy liczby całkowite i wypisuje na standardowym
//wyjściu największą z ich wartości (pamiętaj o przypadku gdy wszystkie podane liczby lub dwie z nich są równe).


import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        int firstNumber = readNumberFroConsole(1);
        int secondNumber = readNumberFroConsole(2);
        int thirdNumber = readNumberFroConsole(3);

//        Scanner in = new Scanner(System.in);
//        int [] tab = new int[3];
//
//        for(int i = 0; i<=2; i++){
//            System.out.println("Podaj liczbe "+i+": ");
//            tab[i] = in.nextInt();
//        }
//
//        int biggest = tab[0];
//
//        for(int i = 0; i<=1; i++){
//            if(tab[i]>tab[i+1]){
//                biggest=tab[i];
//            }
//        }
//        for(int i = 0; i<=1; i++){
//            if(biggest==tab[i]){
//                System.out.println(biggest);
//            }
//        }
    }
    static int[] findGreatestNumbers(int... numbers){

        int[] result = new int[numbers.length];
        int resultCount = 0;

        int greatest = numbers[0];

            for(int i = 0; i < numbers.length; i++){
                if(numbers[i]>greatest){
                    greatest = numbers[i];
                }
            }
            int greatestCount = 0;

            for(int i = 0; i < numbers.length; i++){


        }
    return numbers;
    }

    static int readNumberFroConsole(int numberInOrder){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: "+numberInOrder);
        return scanner.nextInt();
    }



}
