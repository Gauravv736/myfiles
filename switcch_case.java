import java.util.Scanner;
public class switcch_case {
    public static void main(String []args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number that are 100 200 300::");
        int num = scan.nextInt();
        switch (num) {
            case 100: System.out.println("case 1");
            break;

            case (200): System.out.println("case 2");
            break;

            case (300): System.out.println("case 3");
            break;
            default : System.out.println("no case found");
        }

    }
    
}
