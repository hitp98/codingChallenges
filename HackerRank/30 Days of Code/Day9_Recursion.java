import java.util.Scanner;

public class Day9_Recursion {
    /**
     * Recursive function to calculate a factorial of a number.
     */
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int result = factorial(n);
        System.out.println(result);
    }

}
