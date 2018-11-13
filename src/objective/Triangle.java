package objective;

public class Triangle extends Figure{
    protected double a;
    protected double h;

    public Triangle(String color, double a, double h){
        super(color);
        this.a = a;
        this.h = h;
    }


    public double getA() { return a; }

    public double getH() { return h; }

    public void setA(double a) { this.a = a; }

    public void setH(double h) { this.h = h; }


    public double countArea(){
        return a*h/2;
    }

}
