import java.util.Scanner;
public class evencount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the value of array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        for(int i=0; i<arr.length; i++)
            if(arr[i]%2!=0)
              count++;
       System.out.println(count);
    }
}