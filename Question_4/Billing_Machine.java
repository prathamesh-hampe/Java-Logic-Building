import java.util.*;

public class Billing_Machine 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int InvoiceNum = sc.nextInt();

        if (InvoiceNum % 10 == 5 || InvoiceNum % 10 == -5) 
        {
            System.out.println("Ends With 5");
        }
        else
        {
            System.out.println("Does Not End With 5");
        }
        sc.close();
    }
}
