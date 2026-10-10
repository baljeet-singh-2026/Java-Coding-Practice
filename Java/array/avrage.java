import java.util.Scanner;
public class avrage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of array :");
        int n = sc.nextInt();

        int sum = 0;

        int[] arr = new int[n];

        System.out.println("enter the value of array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        double avg = sum/arr.length;
        
        System.out.println("Average is = "+avg);
    }
}
