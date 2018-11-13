package objective;

public class Oop {

    public static void main(String[] args) {
//
//        Diamond[] diamonds = new Diamond[10];
//
//        for (int i = 0; i < 10; i++){
//            diamonds[i] = new Diamond(i,i);
//        }

        Square myRect = new Square("red",10);
        Rectangle mySquare = new Rectangle("black",10,20);
        Triangle myTriangle = new Triangle("yellow",10,30);

        Figure[] figures = new Figure[3];
        figures[0] = myRect;
        figures[1] = mySquare;
        figures[2] = myTriangle;

        double area = 0.0;
        for(Figure figure: figures){
            area += figure.countArea();
        }

        System.out.println("area of all fields: " + area);



//        Square smallRec = new Square("blue",3.0);
//
//        System.out.println(smallRec.countArea(smallRec.getA()));


//        Diamond smallDiamond = new Diamond(10.0,15.0, 5.0);
//        Diamond bigDiamond = new Diamond(20.0);
//        Rectangle smallRectangle = new Rectangle(3.0,4.0);
//        Rectangle bigRectangle = new Rectangle(2.0);
//
//
//        System.out.println("Pole malego rombu: " + smallDiamond.countArea());
//        System.out.println("Pole duzego rombu: " + bigDiamond.countArea());
//
//        System.out.println("pole malego prostokata: " + smallRectangle.countArea());
//        System.out.println("obwod duzego prostokata: " + bigRectangle.countPerimeter());

//        Diamond newDiamond = new Diamond(10.0, 20.0);
//        System.out.println("Pole: " + newDiamond.countArea());

    }

}
