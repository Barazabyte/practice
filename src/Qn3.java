import java.util.Scanner;
public class Qn3 {

    public static void main(String[] args) {
      // Initializing the Class Objects
        Scanner cin = new Scanner(System.in);
        Qn2 qn3 = new Qn2();

      // Declaring some of useful Variables
        double a, b;
        String title;

        System.out.print(" First Number: ");
        a = cin.nextDouble();
        System.out.print(" Second Number: ");
        b = cin.nextDouble();
        System.out.print(" Title: ");
        title = cin.next();

        System.out.println(qn3.myMethod(title));
        System.out.println(" Sum = " + qn3.addition(a, b));

    }
}
