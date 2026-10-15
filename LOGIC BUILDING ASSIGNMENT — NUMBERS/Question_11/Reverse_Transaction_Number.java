
import java.util.*;

public class Reverse_Transaction_Number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        long rev = 0;

        while (num > 0) 
        {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println(rev * sign);
        
        sc.close();
    }
}
