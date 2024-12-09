import java.util.Scanner;
public class Qn5 {

    public void addition(int a, int b) {
        System.out.println(" Sum = " + (a + b));
    }

    public void addition(int a, int b, int c) {
        System.out.println(" Sum = " + (a + b + c));
    }

    public void addition(double a, double b) {
        System.out.println(" Sum = " + (a + b));
    }

    public void addition(String a, String b) {
        System.out.println(" String : " + (a + b));
    }

    public static void main(String[] args) {
      // Declaration of Objects
        Qn5 q = new Qn5();
        Scanner sc = new Scanner(System.in);

      // Declaration of Variables
        int a, b, c;
        double no1, no2;
        String s1, s2;

        System.out.println("1. Number addition");
        System.out.println("2. String concatenation");
        System.out.print("choice: ");
        int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("1. Integers ");
                System.out.println("2. Doubles ");
                System.out.print("Choice: ");
                choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("1. Two Integers ");
                    System.out.println("2. Three Integers ");
                    System.out.print("Choice: ");
                    choice = sc.nextInt();
                        if (choice == 1) {
                            System.out.print(" First Number: ");
                            a = sc.nextInt();
                            System.out.print(" Second Number: ");
                            b = sc.nextInt();
                            q.addition(a, b);
                        } else if (choice == 2) {
                            System.out.print(" First Number: ");
                            a = sc.nextInt();
                            System.out.print(" Second Number: ");
                            b = sc.nextInt();
                            System.out.print(" Third Number: ");
                            c = sc.nextInt();
                            q.addition(a, b, c);
                        }
                } else if (choice == 2) {
                    System.out.print("First Double: ");
                    no1 = sc.nextDouble();
                    System.out.print("Second Double: ");
                    no2 = sc.nextDouble();
                    q.addition(no1, no2);
                }
            } else if (choice == 2) {
                System.out.print(" String One: ");
                s1 = sc.next();
                System.out.print(" String Two: ");
                s2 = sc.next();
                q.addition(s1, s2);
            }

    }
}
