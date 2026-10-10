import java.util.Scanner;
public class positiveCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array :");
        int r = sc.nextInt();
        int[] arr = new int[r];

        int neg = 0;

        System.out.println("enter the value of array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                neg ++;
            }
        }
        System.out.println("Negative no. :"+neg);
    }
}
