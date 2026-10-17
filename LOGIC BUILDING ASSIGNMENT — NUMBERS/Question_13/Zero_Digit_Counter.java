import java.util.*;;

public class Zero_Digit_Counter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        num = Math.abs(num);
        int count = 0;

        if (num == 0) 
        {
            count = 1;
        }
        else 
        {
            while (num > 0) 
            {
                long digit = num % 10;

                if (digit == 0) 
                {
                    count++;
                }

                num = num / 10;
            }
        }
        System.out.println("Count of Zero Digits: " + count);
        sc.close();
    }
}
