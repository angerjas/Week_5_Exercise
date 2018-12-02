package examples.talin.Exercises.Week4;

public class AbsoluteDefiniton {

    private int getAbsolut1(int n1, int n2){
        if(n1 < n2){
            return n2 - n1;
        }else {
            return n1 - n2;
        }
    }

    private int getAbsolut2(int n1, int n2){
        int result = n1 - n2;
        String correctResult = "" + result;
        correctResult = correctResult.replace("-", "");
        return Integer.parseInt(correctResult);
    }

    public static void main(String[] args) {
        AbsoluteDefiniton absoluteDefiniton = new AbsoluteDefiniton();
        int result = absoluteDefiniton.getAbsolut1(2,3);
        System.out.println(result);

        int result2 = absoluteDefiniton.getAbsolut2(0,3);
        System.out.println(result2);
    }
}
