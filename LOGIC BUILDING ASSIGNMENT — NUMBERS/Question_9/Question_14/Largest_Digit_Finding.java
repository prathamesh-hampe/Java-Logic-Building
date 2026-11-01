import java.util.*;

public class Largest_Digit_Finding
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int max = 0;

        while (num > 0) 
        {
            int digit = num % 10;
            if (digit > max)
            {
                max = digit;
            }
            num = num / 10;
        }
        System.out.println("Largest Digit: " + max);
        sc.close();
    }
}