//7. Dana jest wejściowa tablica integerów. Należy znaleźć czy istnieją pary liczb sumujące się do podanej sumy (t). Jeśli tak, należy usunąć drugą liczbę z pary z tablicy i zwrócić tablicę wynikową.
//        Przykład:
//
//        x = [1, 2, 3, 4, 5]
//        t = 3
//
//        1+2 = t, więc wyrzucamy 2. Żadna inna para nie sumuje się do t, więc wynikiem jest:
//        [1, 3, 4, 5]

public class Zadanie7 {

    public static void main(String[] args) {


        int [] tab = {1, 2, 3, 4, 5};
        int [] tab2 = new int[5];
        final int t = 3;

        for(int i = 0; i<=3; i++){

            if(tab[i]+tab[i+1]==t){

                tab2[i+1]=tab[i+1];

            }

        }



        for(int i = 0; i<=4; i++){

            if(tab[i]==tab2[i]){
                tab[i]=0;
            }
        }


        int diff = 0;

        for(int i = 0; i<=4;i++){
            if(tab[i]==0){
                diff++;
            }
        }



        int sum = 5 - diff;

        int [] tab3 = new int[sum];

        int j = 0;

//        for(int i=0;i<5;i++){
//            System.out.println(tab[i]);
//        }

        for(int i = 0; j<sum; i++){

            if(tab[i]!=0){
                tab3[j]=tab[i];
                j++;
            }
        }

        for(int i = 0; i<sum; i++){

            System.out.println(tab3[i]);

        }



    }
}
