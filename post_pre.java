public class post_pre {
    public static void main(String[] args) {
        // post increment
        // int a =10;
        // int b = a++;
        // System.out.println(a);
        // System.out.println(b);

        // pre increment
        // int a =10;
        // int b =++a;
        // System.out.println(a);
        // System.out.println(b);

        // post decrement
        // int a =10;
        // int b =a--;
        // System.out.println(a);
        // System.out.println(b);

        // pre decrement
        // int a =10;
        // int b =--a;
        // System.out.println(a);
        // System.out.println(b);

        // question
        // int a =10;
        // int b = a++ + ++a + a++;
        // System.out.println(a);
        // System.out.println(b);

        // another
        // int a =10;
        // int b = a++ + ++a + a++ + --a + a-- + ++a;
        // System.out.println(a);
        // System.out.println(b);

        // int a, b, c, d;
        // a = b = c = d = 10;
        // a=10;
        // a+=10;
        // // a =10+a;
        // System.out.println(a + " "+ b + " "+ c + " "+ d + " ");

        int a = 10;
        a += 10;// compound assignment operator
        // a =10+a;
        a *= 10; // compound assignment operator
        a /= 10;
        System.out.println(a);

    }

}
