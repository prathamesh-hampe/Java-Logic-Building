import java.util.*;

public class Sum_of_Even_Digits
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int accountNumber = sc.nextInt();

        accountNumber = Math.abs(accountNumber);
        int sum = 0;

        while (accountNumber > 0) {
            int digit = accountNumber % 10;

            if (digit % 2 == 0) {
                sum = sum + digit;
            }
            accountNumber = accountNumber / 10;
        }
        System.out.println("Sum of Even Digits: " + sum);
        sc.close();
    }
}