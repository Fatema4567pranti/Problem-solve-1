import java.util.Scanner;

public class SumOfSquares {

    public static void main(String[] args) {
        int n;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            sum += i * i;
        }

        System.out.println("Sum of Squares from 1 to " + n + " is " + sum);

    }
}