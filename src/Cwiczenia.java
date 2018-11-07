public class Cwiczenia {








    public static void main(String[] args) {

        double myPoint = 98.123;
        double destPoint = 123.123;
        double myTimeHour = 10;
        double myTimeMinutes = 25;
        Hemisphere myHemisphere = Hemisphere.EAST;
        Hemisphere destHemisphere = Hemisphere.WEST;

        final int minutesPerDeg = 4;

        double minuteDiff = 0.0;

        if(myHemisphere != destHemisphere){
            destPoint *= -1;
        }
        System.out.println(destPoint);

        if(myPoint > destPoint){
            minuteDiff = (myPoint - destPoint) * 4;
        }else{
            minuteDiff = (destPoint - myPoint) * 4;
        }

        System.out.println(minuteDiff);

        double myMinutes = myTimeHour * 60 + myTimeMinutes;

        System.out.println(myMinutes);
        double destMinutes = myMinutes + minuteDiff;
        System.out.println(destMinutes);

        int destTimeHour = (int)destMinutes/60;
        int destTimeMinutes = (int)destMinutes%60;

        System.out.println(destTimeHour+":"+destTimeMinutes);


        //Dest point: 15:40
    }

    enum Hemisphere{
        WEST, EAST
    }









}
