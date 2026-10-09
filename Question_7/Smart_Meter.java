package Question_7;
import java.util.*;

public class Smart_Meter 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int reading = sc.nextInt();

        reading = Math.abs(reading);

        int sum = 0; 

        while(reading > 0) 
        {
            sum =+ reading % 10;
            reading /= 10;
        }
        System.out.println("Sum of Digits: " + sum);

        sc.close();
    }
}