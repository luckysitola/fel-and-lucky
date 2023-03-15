import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[15]; // create an array of size 15
       
        // read input values from user and store them in the array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 15 integers:");
        for (int y = 0; y < 15;y++) {
            arr[y] = input.nextInt();
        }
       
        // print the elements of the array on the screen
        System.out.println("Elements of the array:");
        for (int y = 0; y < 15; y++) {
            System.out.print(arr[y] + " ");
        }
        System.out.println(); // move to next line
       
        // ask user to enter a number and check if it's present in the array
        System.out.print("Enter a number to search in the array: ");
        int num = input.nextInt();
        boolean found = false;
        int index = -1;
        for (int y = 0; y < 15; y++) {
            if (arr[y] == num) {
                found = true;
                index = y;
                break;
            }
        }
        if (found) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }
       
        // create another array with reverse order of elements
        int[] reverseArr = new int[15];
        for (int y = 0; y < 15; y++) {
            reverseArr[y] = arr[14 - y];
        }
       
        // print the elements of the reversed array on the screen
        System.out.println("Elements of the reversed array:");
        for (int y = 0; y < 15; y++) {
            System.out.print(reverseArr[y] + " ");
        }
        System.out.println(); // move to next line
       
        // calculate the sum and product of the elements in the array
        int sum = 0;
        int product = 1;
        for (int y = 0; y < 15; y++) {
            sum += arr[y];
            product *= arr[y];
        }
       
        // print the sum and product on the screen
        System.out.println("Sum of the elements in the array: " + sum);
        System.out.println("Product of the elements in the array: " + product);
    }
}