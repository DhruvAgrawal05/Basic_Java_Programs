import java.util.*;
public class CountDigitsProgm {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i = 0;

        while(n>0){
            n=n/10;
            i=i+1;
            
        }
        System.out.println(i);

    }
    
}
