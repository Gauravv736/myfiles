import java.util.*;

public class complexPattern3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value :: ");
        int n = scan.nextInt();
        System.out.println("THE STAR PRINT IS :: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < (n - 1) / 2) || (j == 0 && i > 0) || (i == (n - 1) / 2 && j <= (n - 1) / 2)
                        || (j == (n - 1) / 2 && i > 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        System.out.println("TO PRINT THE STAR PRINT OF D");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n-1)/2 || j == 0 || i == n-1 && j < (n-1)/2 || j == (n-1)/2 && i > 0  && i < n-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n-1)/2 || j == 0 || i == n-1 && j < (n-1)/2 || j == (n-1)/2 && i > 0  && i < n-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}