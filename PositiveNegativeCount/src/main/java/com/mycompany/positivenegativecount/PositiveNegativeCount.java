
package com.mycompany.positivenegativecount;
import java.util.Scanner;
public class PositiveNegativeCount {

    public static void main(String[] args) {
        int sum = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];


        for (int i = 0, j = 1; i < 6; i++) {
            System.out.print("Enter the " + (j) + " element: ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
            if (numbers[i] > 0)
                positiveCount++;
            else
                negativeCount++;

            j++;
        }

        System.out.printf("Positive Integer: %d\nNegative Integers: %d\nTotal Sum Elements: %d", positiveCount, negativeCount, sum);
    }
}
