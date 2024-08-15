import java.util.*;

class Example {
    public static void main(String[] args) {
        System.out.println("Enter values");

        // Correct the Scanner instantiation
        Scanner sc = new Scanner(System.in);

       
        int a = sc.nextInt();
        int b = sc.nextInt();

      
        int c = a + b;

      
        System.out.println("sum = " + c);

    }
}
