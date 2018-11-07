public class liczOdcinek {
    public static void main(String[] args) {

        double coordinateX1 = 127.89;
        double coordinateY1 = 92.12;

        double coordinateX2 = 24.12;
        double coordinateY2 = 82.91;

        double sumX = coordinateX2-coordinateX1;
        double sumY = coordinateY2-coordinateY1;
        double powX = Math.pow(2,sumX);
        double powY = Math.pow(2,sumY);


        double sqrt = Math.sqrt(powX+powY);

        System.out.println(sqrt);
    }
}
