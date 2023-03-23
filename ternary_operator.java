import java.util.Scanner;

public class ternary_operator {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value for a::");
        int a = scan.nextInt();
        System.out.println("Enter the value for b");
        int b = scan.nextInt();
        System.out.println("Enter the value of c::");
        int c = scan.nextInt();

        // for a value
        // int result = (a>b)? a: b;
        // System.out.println(result);
        //
        // for printing a statement
        // String res = (a > b)? "a is greater than b": "a is smaller than b";
        // System.out.println(res);

        // for nested ternary
        int numres = (a < b) ? ((a < c) ? a : c) : (b < c) ? b : c;
        System.out.println(numres);
        // explanation of this nested ternary operator
        if (a < b) {
            if (a < c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b < c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }

    }

}
