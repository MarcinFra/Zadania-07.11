package objective;

public class rectangle extends Figure{

    protected double a;
    protected double b;


    public rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    public rectangle(String color, double a){
        this(color, a, a);
    }

    public double getA() { return a; }

    public double getB() { return b; }

    public void setA(double a) { this.a = a; }

    public void setB(double b) { this.b = b; }


    public double countArea(double a, double b){
        return a*b;
    }

    public double countArea(double a){
        return a*a;
    }

    public double countPerimeter(double a, double b){
        return 2*a + 2*b;
    }

    public double countPerimeter(double a){
        return 4*a;
    }

}
