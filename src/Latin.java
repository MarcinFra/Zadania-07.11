import java.util.Scanner;

public class Latin {

    public static void main(String[] args) {

        char [] latinArray = new char[25];
        String string = setString();
        char [] array = ReplaceSpaces(string);
        latinArray = iteration(latinArray);

    }

    static String setString(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string: ");
        String string = scanner.toString();

        return string;
    }

    static char[] ReplaceSpaces(String replaceSpaces){

        replaceSpaces = replaceSpaces.trim();
        char [] array = replaceSpaces.toCharArray();

        return array;
    }

    static void createLatinArray(){

        char [] array = new char[25];
    }

    static char[] iteration(char []array){

        for(int i = 0; i<array.length; i++){

            for(int j = 0; j<array.length; j++){


            }
        }
        return array;
    }



}
