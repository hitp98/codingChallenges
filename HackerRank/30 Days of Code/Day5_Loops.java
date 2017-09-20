import java.util.Scanner;

public class Day5_Loops {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String output = n + " x ";
        
        if (n >= 2 && n <= 20) {
            for (int i = 1; i < 11; i++) {
                System.out.println(output + i + " = " + n * i);
            }
        }
    }

}
