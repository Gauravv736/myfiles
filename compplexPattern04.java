import java.util.*;

public class compplexPattern04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:: ");
        int n = scan.nextInt();
        
        System.out.println();
        // int n = 11;
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 ||
                i==0 && j>=(n-1)/2 || j==n-1 && i<=(n-1)/2 || j-i>=(n-1)/2 ||
                j==0 && i>(n-1)/2 || i==n-1 && j<=(n-1)/2 || i-j>=(n-1)/2 ||
                i>=(n-1)/2 && j==n-1 || i==n-1 && j>=n/2 || i+j>=n-1+(n-1)/2
                )
                {
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }

               
            } 
            System.out.print("    ");
            for(int j=0; j<n; j++)
        {
            if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || i+j==n-1 + (n-1)/2  || i==0 || j==0 || i==n-1|| j==n-1)
            {
             System.out.print("*");
            }
            else 
            {
                System.out.print(" ");
            }
        }
        System.out.print("   ");
        for (int j = 0; j < n; j++) {
            if (i + j == (n - 1) / 2 || i - j == (n - 1) / 2 || j - i == (n - 1) / 2
                    || i + j == ((n - 1) / 2) + n) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

        }
            
            
            
        }
    }
    // if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 || i+j<=(n-1)/2 ||
    // i==0 && j>=(n-1)/2 || j==n-1 && i<=(n-1)/2 || j-i>=(n-1)/2 || 
    // j==0 && i>=(n-1)/2 || i==n-1 && j<=(n-1)/2 || i-j>=(n-1)/2 ||
    // j==n-1 && i>=(n-1)/2 || i==n-1 && j>=(n-1)/2 || i+j>=n-1 +(n-1)/2
    // )

}
