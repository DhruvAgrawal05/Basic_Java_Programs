import java.util.*;
public class SwitchStatementProgm {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        sc.close();

        switch(month){
            case 1:
                System.out.println("January");
                System.out.println("31 Days");
                break;
            case 2:
                System.out.println("February");
                break;
        }

    }
    
    
}
 