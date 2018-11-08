import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj stringa:");
        String n = in.next();


        char [] chars = n.toCharArray();
        int arrayLength = n.length();


//        char [] lewa = {'w','p','b','s'};
//        char [] prawa = {'m','q','d','z'};

        int punktyLewa = 0;
        int punktyPrawa = 0;

        int i = 0;


        for(i = 0;i<arrayLength; i++) {


                switch (chars[i]) {
                    case 'w':
                        punktyLewa += 4;
                        break;

                    case 'p':
                        punktyLewa += 3;
                        break;

                    case 'b':
                        punktyLewa += 2;
                        break;

                    case 's':
                        punktyLewa += 1;
                        break;

                    case 'm':
                        punktyPrawa += 4;
                        break;

                    case 'q':
                        punktyPrawa += 3;
                        break;

                    case 'd':
                        punktyPrawa += 2;
                        break;

                    case 'z':
                        punktyPrawa += 1;
                        break;

                }

                }




        if(punktyPrawa>punktyLewa){
            System.out.println("Prawa wygrala o: "+(punktyPrawa-punktyLewa)+" Punktow!");
        }else if(punktyLewa>punktyPrawa){
            System.out.println("Lewa wygrala o: "+(punktyLewa-punktyPrawa)+" Punktow!");
        }else{
            System.out.println("Remis: "+punktyPrawa+"Punktow");
        }

    }



}
