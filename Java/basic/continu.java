import java.util.Scanner;
public class continu {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

      int i=340;
        for(i=0; i<10; i++){
            if(i==5||i==7||i==9||i==10){
                
                continue;
            }
            
        }

       
        
        System.out.println(i);
        sc.close();
    }
}
