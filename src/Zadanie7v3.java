public class Zadanie7v3 {

    final int t =3;

    public static void main(String[] args) {

        final int t = 3;
        int [] array = {1, 2, 1};
        int [] tab2 = new int[5];
        checkDeletions(array, t);


    }

    static void checkDeletions(int []array, int t) {
        int whichOne = 1;
        for (int i = 0; i < array.length-1; i++) {

            if (array[i + 1] + array[i] == t) {

                createNewArray(array, t, whichOne);
            }
            whichOne++;
        }
            showArray(array);
    }

    static void createNewArray(int []array, int t, int whichOne){
        int j = 0;
        int [] newArray = new int [array.length-1];

        for(int i = 0; i<array.length; i++){
            if(i==whichOne){

                continue;
            }
                newArray[j] = array[i];
            j++;
        }
        checkDeletions(newArray, t);
    }

    static void showArray(int array[]){
        for(int i = 0; i<array.length; i++){

            System.out.print(array[i]);

        }
        System.out.println();
    }



}
