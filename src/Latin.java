import java.util.Scanner;

public class Latin {

    public static void main(String[] args) {

        char [] latinArray = createLatinArray();
        String string = setString();
        char [] stringArray = ReplaceSpaces(string);

    }

    static char[] createLatinArray(){
        char [] array = new char[25];

        for(int i = 0; i<array.length; i++){
            array[i] = (char)(97+i);
        }
        return array;
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



    static char[] iteration(char []array){

        for(int i = 0; i<array.length; i++){

            for(int j = 0; j<array.length; j++){


            }
        }
        return array;
    }



}
