import java.util.Scanner;
public class brakenegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("would you like to enter the number :(Yes / No)");
            String choice = sc.next();

            if(choice.equalsIgnoreCase("No")){
            System.out.println("end program");
            break;
           }

            if(choice.equalsIgnoreCase("Yes")){
                System.out.println("enter the number:");
                int num = sc.nextInt();

                if(num<0){
                    System.out.println("Number is nagetive so stop the program:" +num);
                    break;
                }else{
                    System.out.println("your entered number is = " +num+ " This is positive :");
                }
        }
           
           
            
    }
    sc.close();
}
}
