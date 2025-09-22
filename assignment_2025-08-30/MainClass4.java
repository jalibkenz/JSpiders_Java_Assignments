import java.util.Scanner;

public class MainClass4 {

    static void printSumOdd(int[] arr) {
        int sumOdd = 0;
        for (int i=0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sumOdd += arr[i];
                
            }
        }
        System.out.println("Sum of odd numbers: " + sumOdd);
       
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
        printSumOdd(numbers);
        scanner.close();

    }
}
