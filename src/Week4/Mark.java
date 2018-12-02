package examples.talin.Exercises.Week4;

import java.util.Scanner;

public class Mark {

    public char getLetterMark(double numberMark) {
        if (numberMark >= 0 && numberMark <= 20) {
            return 'F';
        } else if (numberMark > 20 && numberMark <= 40) {
            return 'D';
        } else if (numberMark > 40 && numberMark <= 60) {
            return 'C';
        } else if (numberMark > 60 && numberMark <= 80) {
            return 'D';
        } else {
            return 'A';
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mark mark = new Mark();

        System.out.print("Please enter student's mark as number: ");
        double studentMark;
        while (true) {
            boolean isDouble = scanner.hasNextDouble();
            if(!isDouble){
                System.out.print("Please enter a number: ");
                continue;
            }
            studentMark = scanner.nextDouble();

            break;

        }

        char result = mark.getLetterMark(studentMark);
        System.out.println(result);
    }
}
