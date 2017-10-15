import java.util.Scanner;

public class Day10_BinaryNumbers {
    
    /**
     * Output the max number of consecutive 1's in the converted
     * binary number.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        String binary = Integer.toBinaryString(n);
        int count = 0;
        int max = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
                max = Math.max(count, max);
            }
            else {
                count = 0;
            }
        }
        System.out.println(max);
    }

}
