package objective;

public class Equal {

    public static void main(String[] args) {

        Square smallSquare = new Square("czerwony",10);
        Square bigSquare = new Square("czerwony",10);

        if(smallSquare.equals(bigSquare)){
            System.out.println("sa rowne");
        }else{
            System.out.println("nie sa rowne");
        }



    }

}
