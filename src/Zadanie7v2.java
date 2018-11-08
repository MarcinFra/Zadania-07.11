//7. Dana jest wejściowa tablica integerów. Należy znaleźć czy istnieją pary liczb sumujące się do podanej sumy (t). Jeśli tak, należy usunąć drugą liczbę z pary z tablicy i zwrócić tablicę wynikową.
//        Przykład:
//
//        x = [1, 2, 3, 4, 5]
//        t = 3
//
//        1+2 = t, więc wyrzucamy 2. Żadna inna para nie sumuje się do t, więc wynikiem jest:
//        [1, 3, 4, 5]

import java.util.Scanner;

public class Zadanie7v2 {


    static char[] doublingArray(int length){

        char [] array2 = new char[length];

        return array2;
    }

    static char setChar(char arrayCharI, Scanner in){

        System.out.println("Podaj cyfre calkowita:");
        arrayCharI = in.next().charAt(0);

        return arrayCharI;
    }

    static boolean ifBreak(char arrayCharI){

        if(arrayCharI=='q'){
            return true;
        }

        return false;
    }

    static void fillArray(char [] array, Scanner in) {
        int j = 1;
        boolean check = false;
        for (int i = 0; i <= 9; i++) {

            array[i] = setChar(array[i], in);

            if (ifBreak(array[i])) {

                break;
            }
            else if(i==9){
                newArray(array, in);
            }
//            check = checkIfNewArray(j, array.length);
//
//        }
//        if(check==true){
//            newArray(array, in);
//        }
        }
    }


    static void newArray(char [] array, Scanner in){

            char[] array2 = doublingArray(2 * array.length);

            for (int i = 0; i < array2.length; i++) {

                if (i < array2.length) {

                    array2[i] = array[i];

                    if (ifBreak(array[i])) {
                        break;
                    }

                } else if (i == array.length - 1) {

                    newArray(array, in);

                } else if (i > array.length)

                    array2[i] = setChar(array[i], in);
            }

        }



    public static void main(String[] args) {

        char [] array = new char [10];
        final int T = 3;
        Scanner in = new Scanner(System.in);
        boolean stop = false;

        fillArray(array, in);

        }


//        for(int i = 0; i<=3; i++){
//
//            if(tab[i]+tab[i+1]==t){
//
//                tab2[i+1]=tab[i+1];
//
//            }
//
//        }
//
//
//
//        for(int i = 0; i<=4; i++){
//
//            if(tab[i]==tab2[i]){
//                tab[i]=0;
//            }
//        }
//
//
//        int diff = 0;
//
//        for(int i = 0; i<=4;i++){
//            if(tab[i]==0){
//                diff++;
//            }
//        }
//
//
//
//        int sum = 5 - diff;
//
//        int [] tab3 = new int[sum];
//
//        int j = 0;
//
////        for(int i=0;i<5;i++){
////            System.out.println(tab[i]);
////        }
//
//        for(int i = 0; j<sum; i++){
//
//            if(tab[i]!=0){
//                tab3[j]=tab[i];
//                j++;
//            }
//        }
//
//        for(int i = 0; i<sum; i++){
//
//            System.out.println(tab3[i]);
//
//        }


    }



