import java.util.Scanner;
public class maximam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("enter the value of array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(max > arr[i]){
                max = arr[i];
            }
        }

         int max2 = arr[0];

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]&& max2 > arr[i]){
                max2 = arr[i];
            }
        }

        System.out.println("Mximam is :"+max2);
    }
}
