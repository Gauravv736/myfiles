import java.util.Scanner;

import java.util.Scanner;
public class loops {
    public static void main(String[]args)
    {


        Scanner scan =new Scanner(System.in);
        System.out.println("What is your name? ");
        String name =scan.nextLine();
        System.out.println("how many to you want to print your name::");
        int a =scan.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("hello my name is::" + name);
            
        }

    }

    
}
