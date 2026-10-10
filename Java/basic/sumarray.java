import java.util.Scanner;
public class sumarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size :");
        int n = sc.nextInt();

        int[] arr = new int[n];  //program bilkul sahi hai bs VS Code pr run nhi ho rha 
        int sum = 0;

        for(int i=0; i<arr.length; i++){
        System.out.println("enter elements :");
        
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }
        System.out.println("sum of arrays is = "+sum);
        sc.close();
    }
}