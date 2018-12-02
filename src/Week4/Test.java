package Week4;



    import java.util.Scanner;

    public class Test {

        public char getLetterMark(double numberMark) {
            if (numberMark >= 0 && numberMark <= 20) {
                return 'F';
            } else if (numberMark > 20 && numberMark <= 40) {
                return 'D';
            } else if (numberMark > 40 && numberMark <= 60) {
                return 'C';
            } else if (numberMark > 60 && numberMark <= 80) {
                return 'B';
            } else {
                return 'A';
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Test test = new Test();

            System.out.println("Please enter student's mark as number");

            while (!scanner.hasNextDouble()) { // while loop will work until user enter a double input
                System.out.println("Enter a number");
                scanner.next(); // stop until user enter something
            }

            double studentMark = scanner.nextDouble(); // take double number and assign it to studentMark variable

            char result = test.getLetterMark(studentMark); // call getLetterMark method and assign method result to result variable
            System.out.println(result);
        }
    }


