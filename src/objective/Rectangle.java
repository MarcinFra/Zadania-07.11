package objective;

public class Rectangle extends Figure{

    protected double a;
    protected double b;


    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public Rectangle(String color, double a){
        this(color, a, a);
    }

    public double getA() { return a; }

    public double getB() { return b; }

    public void setA(double a) { this.a = a; }

    public void setB(double b) { this.b = b; }


    public double countArea(){
        return a*b;
    }

    public double countPerimeter(){
        return 2*a + 2*b;
    }


}
