import java.util.*;

public class Identical_Digit_Validator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 0) 
        {
            System.out.println("Not Valid");
        } 
        else 
        {
            int lastDigit = num % 10;
            boolean valid = true;

            while (num > 0) 
            {
                int digit = num % 10;

                if (digit != lastDigit) 
                {
                    valid = false;
                    break;
                }
                num = num / 10;
            }

            if (valid) 
            {
                System.out.println("Valid");
            } 
            else 
            {
                System.out.println("Not Valid");
            }
        }
        sc.close();
    }
}