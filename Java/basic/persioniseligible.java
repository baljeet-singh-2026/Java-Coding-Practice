import java.util.Scanner;
public class persioniseligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number :");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("the person is eligible :");
        }else{
            System.out.println("the person is not eligible :");
        }
        sc.close();
    }
    
}
