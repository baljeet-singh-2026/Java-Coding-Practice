import java.util.Scanner;
public class positiveornagitive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number :");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("the number is positive :");
        }

        sc.close();
    }
}