public class Student {      // Question 6
    private String name;
    private String regNumber;
    private int yearOfStudy;
    private char gender;

    // Setter Method for name
        public void setName(String name) {
            this.name = name;
        }
    // Getter method for name
        public String getName() {
            return this.name;
        }

    // Setter Method for reg-Number
        public void setRegNumber(String regNumber) {
                this.regNumber = regNumber;
        }
    // Getter method for reg-number
        public String getRegNumber() {
            return this.regNumber;
        }

    // Setter Method for year-of-study
        public void setYearOfStudy(int yearOfStudy) {
            this.yearOfStudy = yearOfStudy;
        }
    // Getter method for Year-of-study
        public int getYearOfStudy() {
            return this.yearOfStudy;
        }

    // Setter Method for gender
        public void setGender(char gender) {
            this.gender = gender;
        }
    // Getter method for gender
        public char getGender() {
            return this.gender;
        }

        public static void main(String[] args) {
          // Declaring the Class Object
            Student student = new Student();
            student.setName("Baraza");
            student.setYearOfStudy(2);
            student.setGender('M');
            student.setRegNumber("T23-03-01214");

        }

}
