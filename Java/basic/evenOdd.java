import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number :");
        int num = sc.nextInt();

        while(true){
            if(num % 2 == 0 ){
            System.out.println("the number is Even :");
        }else{
            System.out.println("the number is Odd :");
            
        }

        }
        sc.close();

    }
}
