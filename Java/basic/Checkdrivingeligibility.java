import java.util.Scanner;
public class Checkdrivingeligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = sc.nextInt();

    System.out.print("do you have a driving licence ?(True/False): ");
    boolean haslicence = sc.nextBoolean();

    if(age >= 18){
        if(haslicence){
            System.out.println("the Persion is eligible for driving :");
        }else{
            System.out.println("your age is note eligivle for driving the car :");
        }
    }
    
        else{
            System.out.println("persion do not have licence :");
        }
        
        
        sc.close();
    }
    
}

