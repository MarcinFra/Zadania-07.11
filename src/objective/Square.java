package objective;

public class Square extends Rectangle {

    public Square(String color, double a){
        super(color,a);
    }

    @Override
    public void setA(double a){

        this.a = a;
        this.b = b;
    }

    @Override
    public void setB(double b){
        this.a = b;
        this.b = b;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj instanceof Square){
            Square squareToCompare = (Square)obj;
            return (this.a == squareToCompare.a &&
                    this.b == squareToCompare.b);
        }else{
            return false;
        }
    }
}
