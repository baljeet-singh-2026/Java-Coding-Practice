import java.util.Scanner;
public class add{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0;

        System.out.println("enter the value of array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        
        System.out.println("Sum = "+sum);
    }
}