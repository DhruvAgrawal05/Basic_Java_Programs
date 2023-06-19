import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(char[] arr, char target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Return the index if target is found
            }
        }
        return -1;  // Return -1 if target is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        char[] arr = new char[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.next().charAt(0);
        }

        System.out.print("Enter the target value to search: ");
        char target = scanner.next().charAt(0);

        int result = linearSearch(arr, target);

        if (result == -1) {
            System.out.println("Target value not found in the array.");
        } else {
            System.out.println("Target value found at index " + result + ".");
        }
    }
}