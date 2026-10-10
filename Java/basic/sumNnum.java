import java.util.Scanner;
public class sumNnum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of N(First Numbe) :");
        int n1 = sc.nextInt();

        System.out.println("Enter the value of N(Scond number) :");
        int n2 = sc.nextInt();


        int sum = 0;

        for(int i=n1; i<=n2; i++){
            sum = i + sum;
        }
        System.out.println("Result = " +sum);
        sum = sc.nextInt();

        sc.close();
    }
}
