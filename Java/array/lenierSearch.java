import java.util.Scanner;
public class lenierSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("enter the value of array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the search number :");
        int search = sc.nextInt();
               
        for(int i=0; i<arr.length; i++){
            if(search == arr[i]){
                System.out.println("found index at "+i);  
                return; 
            } 
        }System.out.println("not found :");

        
    } 
}
