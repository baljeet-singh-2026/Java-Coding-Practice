public class continuealphabet {
    public static void main(String[] args) {

         int count = 0;
        for(char ch='a'; ch<='z'; ch++){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                continue;
            }
            System.out.println(ch);
            count++;
        }
        System.out.println("total constant = "+count);

    }
}