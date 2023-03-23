import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter First no::");
        // int a = scan.nextInt();

        // conditional if else

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number::");
        // int age = scan.nextInt();

        // if (age >= 18 && age < 60) {
        // System.out.println("you can drive");
        // }
        // else if (age >= 60) {
        // System.out.println("You are old in age");
        // }
        // else {
        // System.out.println("your age is less than 18 so you cannot drive");
        // }

        // nested if else

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age::");
        int age = scan.nextInt();
        if (age > 18 && age < 60) {
            if (age >= 20 && age < 30) {
                System.out.println("You are in your 20's");

            }
            else if (age >= 30 && age <60) {
                System.out.println("You are in your 30's");
                
            }

            else {
                System.out.println("You are a teen");

            }
        }
        else if (age >60) {
            System.out.println("You are 60 plus");
            
        }
        else {
            System.out.println("You are a kid");
        }

    }
}
