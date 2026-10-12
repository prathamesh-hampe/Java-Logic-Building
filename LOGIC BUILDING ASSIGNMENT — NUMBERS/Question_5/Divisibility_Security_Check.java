import java.util.*;

public class Divisibility_Security_Check 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) 
        {
            System.out.println("Valid Number");
        } 
        else 
        {
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}
