import java.util.Scanner;

public class MainClass3 {

    static void printSumEven(int[] arr) {
        int sum = 0;
        for( int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];     
            }
        }
        System.out.println("The sum of the even array elements is: " + sum);
       
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
        printSumEven(numbers);
        scanner.close();

    }
}
