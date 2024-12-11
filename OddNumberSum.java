import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        int n;
        int oddSum = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] numbers = new int[n];


        for (int i = 0, j = 1; i < n; i++) {
            System.out.print("Enter the numbers: ");
            numbers[i] = sc.nextInt();

            if (numbers[i] % 2 != 0)
                oddSum += numbers[i];
        }


            System.out.print("Sum of Odd numbers:  " + oddSum);


    }

}