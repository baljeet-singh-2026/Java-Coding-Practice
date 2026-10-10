import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number :");
        int num1 = sc.nextInt();

        System.out.println("enter the operator (+,-,*,/)");
        char op = sc.next().charAt(0);
        
        System.out.println("enter the second number :");
        int num2 = sc.nextInt();

        switch(op){
            case '+':
                System.out.println("result = " +(num1 + num2));
                break;

            case '-':
                System.out.println("result = " +(num1 - num2));
                break;

            case '*':
                System.out.println("result = " +(num1 * num2));
                break;

            case '/':
                if(num2 != 0){
                    System.out.println("result = " +(num1 / num2));
                }else{
                    System.out.println("wrong Statement !");
                }

            default:
                System.out.println("this is perform operation on only +,-,*,/");
        }
        sc.close();
    }
}
