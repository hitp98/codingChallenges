import java.util.Scanner;

public class Day1_DataTypes {
    
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int number;
        double decimal;
        String input;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        number = Integer.parseInt(scan.nextLine());
        decimal = Double.parseDouble(scan.nextLine());
        input = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + number);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + decimal);
        /* Concatenate and print the String variables on a new line; 
            the 's' variable above should be printed first. */
        StringBuilder output = new StringBuilder();
        output.append(s);
        output.append(input);
        System.out.println(output);
        
    }

}
