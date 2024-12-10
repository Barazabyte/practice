public class Qn8 {
     // n8 class instance Variables (UNIQUE TO EACH OBJECT OF A CLASS)
        private double mass;
        private double height;

     // Declaring class variable (SHARED ACROSS ALL INSTANCE OF A CLASS)
        static int iteration = 0;

     // Constructor for initializing instance Variables
        public Qn8(double mass, double height) {
            this.mass = mass;
            this.height = height;
            iteration++;
        }

      // Declaring instance Methods for getting the instance variables Value
        public double getMass() {
            return mass;
        }
        public double getHeight() {
            return height;
        }

      // Declaring class Method (DOES NOT REQUIRE OBJECT FOR IT TO BE CALLED IN THE main METHOD)
      // Also it manipulates it's fellow class variables.
        public static void display() {
          System.out.println(" Created Objects: " + iteration);
        }

      // Calling the main Method
        public static void main(String[] args) {
            Qn8 objOne = new Qn8(66.9, 1.78);
            Qn8 objTwo = new Qn8(72.9, 1.98);

            System.out.printf( "%s%.2f%s%.2f%n", " Mass: ",objOne.getMass(), " Height: ",objOne.getHeight());
            System.out.printf("%s%.2f%s%.2f\n", " Mass: ", objTwo.getMass(), " Height: ", objTwo.getHeight());
            display();                                      // Calling class Method, does not require object Name
        }

}
