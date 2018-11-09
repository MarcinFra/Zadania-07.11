//8. Istnieją dwie grupy walczących liter. Napisz program, który wczytuje String rozgrywki składający się z liter oraz decyduje, która grupa zwyciężyła turę.
//        Lewa strona:
//        w - 4
//        p - 3
//        b - 2
//        s - 1
//        Prawa strona:
//        m - 4
//        q - 3
//        d - 2
//        z - 1
//        Pozostałe litery nie mają znaczenia w rozgrywce.
//        Przykład: "zdqmwpbs"
//        Przydatna będzie metoda: String.toCharArray



import java.util.Scanner;

public class Zadanie8v2 {

    public static void main(String[] args) {

        char[] array = new char[5];
        final int T = 3;
        Scanner in = new Scanner(System.in);
        boolean stop = false;

        fillArray(array, in);


    }


    static char[] doublingArray(int length) {

        char[] array2 = new char[length];

        return array2;

    }

    static char[] newArray(char[] array, Scanner in) {

        char[] array2 = doublingArray(2 * array.length);

        return array2;

    }

    static void fillArray(char[] array, Scanner in) {
        for (int i = 0; i < array.length; i++) {

            array[i] = setChar(array[i], in);

            if (ifBreak(array[i])) {

                break;
            } else if (i == array.length - 1) {
                char[] array2 = newArray(array, in);
                fillArray(array2, in);

            }
        }
    }

    static char setChar(char arrayCharI, Scanner in) {

        System.out.println("Podaj cyfre calkowita:");
        arrayCharI = in.next().charAt(0);

        return arrayCharI;
    }

    static boolean ifBreak(char arrayCharI) {

        if (arrayCharI == 'q') {
            return true;
        }

        return false;
    }
}