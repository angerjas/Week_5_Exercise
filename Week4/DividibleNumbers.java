package examples.talin.Exercises.Week4;

public class DividibleNumbers {

    public static void main(String[] args) {
        for (int i = 0; 1 <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i + ", ");
            }
        }
    }
}
