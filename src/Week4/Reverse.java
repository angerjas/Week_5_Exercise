package Week4;

public class Reverse {


    public String getReverseByExternalLibrary(String input) {
        StringBuilder sb = new StringBuilder(input); // create StringBuilder with input
        return sb.reverse().toString(); // reverse input by using StringBuilder library reverse method
    }

    public String getReverseNormally(String input) {
        char[] inputarray = input.toCharArray(); // convert string to char array
        String result = "";
        for (int i = inputarray.length - 1; i >= 0; i--) { // start from length of array until 0
            result += inputarray[i]; // concat char array to string
        }

        return result;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        String result1 = reverse.getReverseByExternalLibrary("Gokhan Polat");
        System.out.println(result1);

        String result2 = reverse.getReverseNormally("Gokhan Polat");
        System.out.println(result2);
    }
}
