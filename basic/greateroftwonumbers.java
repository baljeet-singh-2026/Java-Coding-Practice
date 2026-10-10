import java.util.Scanner;
public class greateroftwonumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number :");
        int num1 = sc.nextInt();

        System.out.println("enter the second number :");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.print("This number is greater : " +num1);
        }else if(num1 < num2){
            System.out.print("This number is greater : " +num2);
        }else{
            System.out.print("both number is equal : 11");
        }

        sc.close();

    }
}
