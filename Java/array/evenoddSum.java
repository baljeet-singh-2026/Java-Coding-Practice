public class evenoddSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        
        int sum = 0,sum1=0,sum2=0;

        for(int i=0; i<arr.length; i++){
                sum = sum + arr[i];
                
            if(arr[i] % 2 != 0){
                sum1 = sum1 + arr[i]; 
        }
        if(arr[i] % 2 == 0){
            sum2 = sum2 + arr[i];
        }
    }
        System.out.println("total sum is :"+sum);
        System.out.println("Sum of even no. :"+sum1);
        System.out.println("Sum of odd no. :"+sum2);
    }
}
