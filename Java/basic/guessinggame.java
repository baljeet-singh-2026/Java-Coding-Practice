import java.util.Scanner;
public class guessinggame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 7;

        while(true){
            
        System.out.println("enter the secrete No. = ");
            int sec = sc.nextShort();
            
            if(a==sec){
                System.out.println("currect guese " +a+ " this is correct number:");
                    break;
            }else if(a<sec){
                System.out.println("Too low (try again)");
                
            }else{
                System.out.println("Too High(try again)");
                
            }
            }
            sc.close();
        }
    }

