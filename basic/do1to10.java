import java.util.Scanner;
public class do1to10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

        sc.close();
    }
}
