import java.util.Scanner;
public class bill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        while(true){
            
             System.out.println("enter unit:");
            int unit = sc.nextInt();

            if(unit<=100){
            int bill = unit*5;
            System.out.println("bill = " +bill);
        }else if(unit<=200){
            int bill = unit*7;
            System.out.println("bill = "+bill);
        }else if(unit>=300){
            int bill = unit*12;
            System.out.println("bill = "+bill);
        }else{
            System.out.println("plz enter the valid information Try again:");
            
        }break;
        }   
        sc.close();
    }
}
