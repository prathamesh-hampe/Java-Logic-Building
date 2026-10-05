import java.util.*;

public class Digital_Lock 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) 
        {
            System.out.println("Access Granted");
        }
        else 
        {
            System.out.println("Access Denied");
        }
        sc.close();
    }
}