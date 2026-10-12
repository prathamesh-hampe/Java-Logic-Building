import java.util.*;
public class Transaction_ID_Digital_Counter 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int transaction_ID = sc.nextInt();

        if (transaction_ID < 0) 
        {
            System.out.println("Invalid Transaction ID");
        }
        else 
        {
            int count = 0;
            int num = transaction_ID;

            if (num == 0) 
            {
                count = 1;
            }
            else 
            {
                while (num > 0) 
                {
                    count++;
                    num = num / 10;
                }
            }
            System.out.println("Total Digites: " + count);
        }
        sc.close();
    }
}
