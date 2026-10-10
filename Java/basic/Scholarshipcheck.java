import java.util.Scanner;
public class Scholarshipcheck {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 10th marks (Without percentage%) :");
        double marks10th = sc.nextDouble();

        if(marks10th >= 60){
            System.out.println("enter the 12th marks (Without percentage%) :");
            double marks12th = sc.nextDouble();

            if(marks12th >= 60){
                System.out.println("Enter the BCA cgpa :");
                double bca = sc.nextDouble();

                if(bca >= 7){
                    System.out.println("Enter the MCA cgpa :");
                    double mca = sc.nextDouble();

                    if(mca >= 8){
                        System.out.println("You are Eligible for Scholership :");
                    }else{
                        System.out.println("You are not eligible for Scholership");
                    }
                }else{
                    System.out.println("You are not eligible for Scholership :");
                }
            }else{

                System.out.println("you are not eligible for Scholershil :");
            }
        }else{
            System.out.println("you are not eligible for Scholershil :");
        }
    }
}
