import java.util.*;
public class twoDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][3];

        for(int i = 0 ; i<3;i++){
            for(int j=0; j<3;j++){
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.println(arr[0][0]);

        
    }
    
}
