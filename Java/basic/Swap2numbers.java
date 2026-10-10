import java.util.Scanner;
public class Swap2numbers{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            System.out.println("enter the first number :");
            int a = sc.nextInt();

            System.out.println("enter the second number :");
            int b = sc.nextInt();

            System.out.println("befor swiping :");
            System.out.println("a :" +a);
            System.out.println("b :" +b);

            int temp = a;
             a = b;
             b = temp;

            System.out.println("after  swaping :");
            System.out.println("a :" +a);
            System.out.println("b :" +b);

            sc.close();
    }
}