import java.util.Scanner;

public class MainClass1 {

    static void printreverseArray(int[] arr) {
        for( int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");     
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total count of numbers you need to enter into array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The numbers in the array are:");
        printreverseArray(numbers);
        scanner.close();

    }
}
