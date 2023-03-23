public class complexPattern2 {
    public static void main(String[] args) {
        int n = 11;
        //FOR PRINT STAR PATTERN FOR A 
        System.out.println("TO PRINT THE STAR PATTERN OF A");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        //FOR PRINTING STAR PATTERN OF T
        System.out.println("TO PRINT THE STAR PATTERN OF T");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n -1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        System.out.println("TO PRINT THE STAR PATTERN");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0||j==0||i==n-1||j==n-1) {
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();
        }
        //FOR PRINTING STAR PATTERN OF H
        System.out.println("TO PRINT THE STAR PATTERN OF H");

       for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j ==0 || j == n-1 || i ==(n-1)/2) {
                System.out.print("*");
                
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

        
       }
    }

}
