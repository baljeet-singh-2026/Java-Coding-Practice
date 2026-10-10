import java.util.Scanner;
public class secondSmallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the value of array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sml = arr[0];
        for(int i=0; i<arr.length; i++){
            if(sml > arr[i]){
                sml = arr[i];
            }
        }
        int sml2 = arr[0];
        for(int i=0; i<arr.length; i++){
            if(sml < arr[i] && sml2 > arr[i]){
                sml2 = arr[i];
            }
        }
        System.out.println("Second Smallest is :"+sml2);
    }
}
