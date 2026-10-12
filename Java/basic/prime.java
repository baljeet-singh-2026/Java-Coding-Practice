import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the number :");
        int n = sc.nextInt();

        boolean prime = true;
        if(n>=1){
            prime=false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                prime = false;
            }
            break;
        }
        if(prime==true){
                System.out.println(n+" prime");
            }else{
                System.out.println(n+" not prime");
            }
        sc.close();
}
}