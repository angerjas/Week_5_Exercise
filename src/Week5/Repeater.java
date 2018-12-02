package Week5;


import java.util.Scanner;

public class Repeater {
    /**
     * Objective: We want to print numbers with the amount of its value.
     * Lets suppose we enter 5: we will print:
     * 55555
     * 5
     * 5
     * 5
     * 5
     * 5
     * Conditions:
     * We accept integer which is below 5
     * In case of 0 give information that we got nothing to print
     * In case of negative number or any data which is not integer: print error information .
     */
    public static void main(String[] args) {
        Repeater repeater = new Repeater();
        while (true) {
            System.out.println("Welcome please enter the number");
            Scanner scanner = new Scanner(System.in);
            String incomingString = scanner.nextLine();
            if(incomingString.equalsIgnoreCase("exit")){
                System.out.println("Shutting this shit down");
                return;
            }

            boolean isInteger = repeater.isInteger(incomingString);
            if (isInteger) {
                int data = Integer.parseInt(incomingString);
                boolean isValid = repeater.isValid(data);
                if (isValid) {
                    repeater.print(data);
                }
            } else {
                System.out.println("We only expect integer");
            }
        }
    }

    private void print(int incomingNumber) {
        String result = "";
        for (int counter = 0; counter < incomingNumber; counter++) {
            result = result + incomingNumber;
        }
        System.out.println(result);
        for (int counter = 0; counter < incomingNumber; counter++) {
            System.out.println(incomingNumber);
        }
    }

    public boolean isInteger(String incomingString) {
        try {
            Integer.parseInt(incomingString);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private boolean isValid(int number) {
        if (number > 5) {
            System.out.println("We only expect integer");
            return false;
        } else if (number == 0) {
            System.out.println("We got nothing to print");
            return false;
        } else if (number < 0) {
            System.out.println("We got negative number");
            return false;
        }
        return true;
    }
}