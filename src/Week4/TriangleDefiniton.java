package examples.talin.Exercises.Week4;

/*
TASK1 :
User will enter 3 double and you will check and print out whether these 3 number can be triangle.
Note: Let's assume a triangle edges are s1,s2,s3   Rule s1-s2 <= s3 <= s1+s2
 */

public class TriangleDefiniton {

    public boolean isTriangle(double s1, double s2, double s3) { // create a method which has 3 parameters
        // s1-s2 <= s3 <= s1+s2
        // s1-s3 <= s2 <= s1+s3
        // s2-s3 <= s1 <= s2+s3

        if ((Math.abs(s1 - s2) < s3 && s3 < (s1 + s2)) &&
                (Math.abs(s1 - s3) < s2 && s1 < (s1 + s3)) &&
                (Math.abs(s2 - s3) < s1 && s2 < (s2 + s3))) {
            return true;

        }

        return false;
    }

    public static void main(String[] args) {
        TriangleDefiniton triangleDefiniton = new TriangleDefiniton();
        boolean result = triangleDefiniton.isTriangle(2,7,9);
        System.out.println(result);

        boolean result2 = triangleDefiniton.isTriangle(3, 4, 5);
        System.out.println(result2);
    }

}