import java.util.Scanner;
public class Qn4 {

    public double addition(double a, double b) {
        return a + b;
    }

    public void display() {
        Scanner cin = new Scanner(System.in);
        System.out.print(" First Number: ");
        double a = cin.nextDouble();
        System.out.print(" Second Number: ");
        double b = cin.nextDouble();
        System.out.println(" Sum = " + this.addition(a, b));
    }

    public static void main(String[] args) {
        Qn4 q = new Qn4();
        q.display();
    }
}
