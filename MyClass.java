import java.util.Scanner;

public class MyClass {   // Question7
    public static void main(String[] args) {
      // Declaring the Class Objects
        Student student = new Student();
        Scanner cin = new Scanner(System.in);

      // Declaring some of useful Variables
        String name, regNo;
        int yearOfStudy;
        char gender;

      // Prompting user to feed Data
        System.out.print("Name: ");
        name = cin.nextLine();
        cin.nextLine();
        student.setName(name);

        System.out.print("RegNo: ");
        regNo = cin.nextLine();
        cin.nextLine();
        student.setRegNumber(regNo);

        System.out.print("Year of study: ");
        yearOfStudy = cin.nextInt();
        student.setYearOfStudy(yearOfStudy);
        System.out.println("Gender: ");
        gender = cin.next().charAt(0);
        student.setGender(gender);

      // Printing input Data to a console
        System.out.println(" Name: " + student.getName());
        System.out.println(" RegNo: " + student.getRegNumber());
        System.out.println(" Year of study: " + student.getYearOfStudy());
        System.out.println(" Gender: " + student.getGender());
    }
}
