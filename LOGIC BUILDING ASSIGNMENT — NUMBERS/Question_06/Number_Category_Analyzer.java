import java.util.*;

public class Number_Category_Analyzer 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) 
        {
            System.out.println("zero");
        }
        if (num > 0)
        {
            System.out.println("Positive Number");
        }
        else 
        {
            System.out.println("Negative Number");
        }
        sc.close();
    }
}