import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("wpisz liczbe calkowita");
        int n = in.nextInt();

        if(n<0){
            n *= -1;
        }
        System.out.println(n);



    }

}
