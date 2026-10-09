import java.util.*;

public class Last_Digit_Parity_Checker 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();

        if (Num % 2 == 0) 
        {
            System.out.println("Last Digit Even");
        }
        else 
        {
            System.out.println("Last Digit Odd");
        }
        sc.close();
    }
}
