import java.util.Scanner;
import java.util.Scanner;
public class while_loop {
    
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What sentence you want to print::");
        String name = scan.nextLine();
        System.out.println("How many times you want to print it::");
        int a =scan.nextInt();
        int i =0;
        
        
        //WHILE LOOP
        while (i<a) {
            System.out.println(name);
            i++;
            
        }

    
        // // DO WHILE LOOP

        do {
            System.out.println("hello, The sentence is " +name);
            i++;
            
        }while ( i<a);

      
        


    }
}
