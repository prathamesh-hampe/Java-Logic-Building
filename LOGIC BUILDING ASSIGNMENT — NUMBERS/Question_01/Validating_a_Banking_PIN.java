import java.util.*;

public class Validating_a_Banking_PIN
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int PIN = sc.nextInt();

        if (PIN >= 1000 && PIN <= 9999)
        {
            System.out.println("Valid PIN");
        }
        else 
        {
            System.out.println("Invalid PIN");
        }
        sc.close();
    }
}