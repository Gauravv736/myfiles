import java.util.*;

public class moreOnPattern01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the times to print * ");
        int a = scan.nextInt();
        // for (int i = 0; i < a; i++) {
        //     System.out.print("*");


        // }
        // NOW PRINT STAR IN 5 ROWS AND 5 COLUMNS
        for (int i = 0; i < a; i++) 
        {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }

    }
}
