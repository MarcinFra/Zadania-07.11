import java.lang.reflect.Array;

public class Funkcja1 {

    public static void main(String[] args) {

        int[] yCoordinates = {1, 2, 3, 4, 5};
        int [] xCoordinates = {5, 6, 7, 8, 9};
        double[] someDoubles = {10,5};
        System.out.println(countAvg(yCoordinates));

    }


    static double countVelocity(double time, double route){
        double velocity = route / time;

        return velocity;
    }

    static int countSumOfElements(int[] inputArray){
        int sum = 0;
        for(int i = 0; i < inputArray.length; i++){
            sum += inputArray[i];
        }

        return sum;
    }

    static double countAvg(int [] inputArray){

        int sum = 0;

        for(int i = 0; i<inputArray.length; i++){
            sum += inputArray[i];
        }

        return (double)sum/inputArray.length;
    }


}
