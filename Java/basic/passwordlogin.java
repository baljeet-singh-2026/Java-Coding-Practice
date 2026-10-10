import java.util.Scanner;
public class passwordlogin {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        String Email = "baljeet@123";
        String password = "1234";
        
        System.out.println("Enter the Email :");
        String inputEmail = sc.nextLine();

        if(Email.equals(inputEmail)){
            System.out.println("Enter your Password :");
        String inputPassword = sc.nextLine();

            if(password.equals(inputPassword)){
                System.out.println("Login Successfully .");
            }else{
                System.out.println("Password is incorrect .");
            }
        }else{
            System.out.println("This Email is incorrect :");
        }

    }
}
