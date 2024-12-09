public class Qn2 {

    public double addition(double a, double b) {
        return a + b;
    }

    public String myMethod(String title) {
        return title;
    }

    public static void main(String[] args) {
        Qn2 q = new Qn2();
        System.out.println(q.myMethod("Adding two Integers:"));
        System.out.println(q.addition(34, 56));
    }
}
