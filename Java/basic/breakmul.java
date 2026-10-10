import java.util.Scanner;
public class breakmul {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=10; i++){
            if(i==7){
                break;
            }
            System.out.println(i);
        }
        sc.close();
    }
}
