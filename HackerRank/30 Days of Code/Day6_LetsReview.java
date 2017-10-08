import java.util.Scanner;

public class Day6_LetsReview {
    
    /**
     * Output the even-indexed and odd-indexed characters, from the input, separated by a space.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numLines = scan.nextInt();
        
        
        for (int i = 0; i < numLines; i++) {
            String even = "";
            String odd= "";
            String curr = scan.next();
            
            for (int j = 0; j < curr.length(); j++) {
                
                if (j % 2 == 0) {
                    even += curr.charAt(j);
                }
                else {
                    odd += curr.charAt(j);
                }
            }
            
            System.out.println(even + " " + odd);
        }
        
    }

}
