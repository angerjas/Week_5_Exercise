package examples.talin.Exercises.Week4;

public class Dice {

    public int throwDice() {
        return (int) (1 + Math.random() * 6); // create random number between 1-6
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        int firstDice = dice.throwDice();
        int secondDice = dice.throwDice();

        System.out.println(firstDice + " , " + secondDice);
    }
}