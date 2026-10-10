import java.util.Scanner;
public class Checkwhetheranumberispositive {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number :");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("the number is positive :");
        }else if(num < 0){
            System.out.println("the number is negetive :");
        }else{
            System.out.println("number is neather :");
        }

        sc.close();
    }
    
}
