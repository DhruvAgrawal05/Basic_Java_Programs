import java.util.*;
public class array2progm {
    public static String linearSearch(String numbers[], String key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i].equals(key)){
                return numbers[i];
            }
            
           
        }
        return null;
        
    }
    public static void main(String[] args) {
        String numbers[] = {"Dhruv","Agrawal","Indore"};

        String key = "Dhruv";
        String index = linearSearch(numbers,key);

        if (index == null){
            System.out.println("Not Found");
        }
        else{
            System.out.println(index);
        }
    }
}
