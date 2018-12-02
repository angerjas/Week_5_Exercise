package Week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Comparison {


    public double getMin(List<Double> numbers) {
        double min = numbers.get(0);

        for (Double number : numbers) { // foreach loop. this loop is used for list and it iterates all elements of list from 1st to last
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    public double getMax(List<Double> numbers) {
        double max = numbers.get(0);

        for (Double number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public double getAvg(List<Double> numbers) {
        double sum = 0;

        for (Double number : numbers) {
            sum += number; // sum numbers with each other
        }

        double avg = sum / numbers.size(); // calculate average value

        return avg;
    }

    public static void main(String[] args) {
        Comparison comparison = new Comparison();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter? : ");
        int count = scanner.nextInt();

        List<Double> numberList = new ArrayList<>();
        for (int i = 1; i <= count; i++) { // get input from user count times
            System.out.print(i + ". number? : ");
            double n = scanner.nextDouble();
            numberList.add(n); // add user input to numberList
        }

        double min = comparison.getMin(numberList);
        double max = comparison.getMax(numberList);
        double avg = comparison.getAvg(numberList);

        System.out.println("Minimum number is : " + min);
        System.out.println("Maximum number is : " + max);
        System.out.println("Average number is : " + avg);
    }


}
