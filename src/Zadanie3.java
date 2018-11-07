import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] tab = new int[3];

        for(int i = 0; i<=2; i++){
            System.out.println("Podaj liczbe "+i+": ");
            tab[i] = in.nextInt();
        }

        int biggest = tab[0];

        for(int i = 0; i<=1; i++){
            if(tab[i]>tab[i+1]){
                biggest=tab[i];
            }
        }
        for(int i = 0; i<=1; i++){
            if(biggest==tab[i]){
                System.out.println(biggest);
            }
        }
    }


}
