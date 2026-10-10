import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "baljeet";
        String pass = "baljeet@123";

        System.out.println("Enter the Email :");
        String email = sc.nextLine();

        System.out.println("Enter the password :");
        String pass1 = sc.nextLine();

        if(username.equals(email) && pass.equals(pass1)){
            System.out.println("Successfully Login...");
        }else{
            System.out.println("invalid information:");
        }
        sc.close();
    }
}
