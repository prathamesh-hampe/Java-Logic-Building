import java.util.*;

public class Warehouse_Batch_Priority_Assignment 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int batchNum = sc.nextInt();

        if (batchNum % 10 == 0) 
        {
            System.out.println("Priority Batch");
        }
        else 
        {
            System.out.println("Normal Batch");
        }
        sc.close();
    }
}
