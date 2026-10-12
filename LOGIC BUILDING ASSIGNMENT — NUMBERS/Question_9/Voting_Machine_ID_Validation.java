import java.util.*;

public class Voting_Machine_ID_Validation 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();

        if (ID > 99999) 
        {
            System.out.println("Accepted");
        }
        else 
        {
            System.out.println("Rejected");
        }
        sc.close();
    }
}
