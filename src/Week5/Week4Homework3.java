package Week5;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Week4Homework3 {
    public static void main(String[] args) {
        Week4Homework3 week4Homework3 = new Week4Homework3();
        week4Homework3.takeTextAndFindRepeatedWords();
    }

    public void takeTextAndFindRepeatedWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = scanner.nextLine();
        String[] wordArray = input.toLowerCase().split("(\\.|!|\\?|\"|'s|\\s)+");
        Set<String> repeatedWords = new LinkedHashSet<>();
        for (int i = 0; i < wordArray.length; i++) {
            for (int j = i + 1; j < wordArray.length; j++) {
                if (wordArray[i].equals(wordArray[j])) {
                    repeatedWords.add(wordArray[i]);
                }
            }
        }
        System.out.print("Repeated words: ");
        Object[] repeatedWordsArray = repeatedWords.toArray();
        for (int i = 0; i < repeatedWordsArray.length; i++) {
            if (i == 0) {
                System.out.print(repeatedWordsArray[i]);
            } else {
                System.out.print(", " + repeatedWordsArray[i]);
            }
        }
    }
}