import java.util.Scanner;
public class breaksearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10,30,40,50,77,448};
    
        System.out.println("enter the element Index = " );
        int search = sc.nextInt();

        for(int i=1; i<arr.length; i++){
            if(arr[i] == search){
                System.out.println("this element is found at index " +i);
                break;
            }
        }
    }
}
