public class logicaloperator {

    public static void main(String[] args) {
        // AND logical operator--> &&

        int a = 10;
        int b = 20;
        System.out.println("This is AND logical operator");
        System.out.println(a == b && a > b);

        // OR logical operator --> ||

        System.out.println("This is OR logical operator");
        System.out.println(a == b || a < b || a > b);

        //NOT logical operator --> !

        System.out.println("This is NOT operator");
        System.out.println(a!=b);
        System.out.println(!true);

    }

}
