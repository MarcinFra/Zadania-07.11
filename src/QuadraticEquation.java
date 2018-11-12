import java.util.Scanner;

public class QuadraticEquation {


    public static void main(String[] args) {

        double a = setNumber('a');
        double b = setNumber('b');
        double c = setNumber('c');
        double delta = countDelta(a, b, c);
        double [] answer = createRootArray(delta, a, b);
        output(answer);

    }

    static double setNumber(char number){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number "+ number +": ");
        return scanner.nextDouble();
    }

    static double countDelta(double a, double b, double c){

        double delta = (b*b)-(4*a*c);
        return delta;
    }

    static double[] createRootArray(double delta, double a, double b){

        double[] answer;

        if(delta==0){
            answer = new double[1];
            answer[0] = countDoubleRoot(a, b);

        }
        else{
            answer = new double[2];

            answer[0] = countRoot1(a,b,delta);
            answer[1] = countRoot2(a,b,delta);

        }
        return answer;
    }

    static double countDoubleRoot(double a, double b){

        return (-b)/2*a;

    }

    static double countRoot1(double a, double b, double delta){

        return -b - Math.sqrt(delta) / 2*a;

    }

    static double countRoot2(double a, double b, double delta){

        return -b + Math.sqrt(delta) / 2*a;

    }

    static void output(double [] answer){

        if(answer.length == 1){
            System.out.println("root is equal: "+answer[0]);
        }else if(answer.length == 2){
            System.out.println("first root is equal: "+answer[0]+"and second is equal: "+answer[1]);
        }else{
            System.out.println("there are no roots");
        }
    }

}
