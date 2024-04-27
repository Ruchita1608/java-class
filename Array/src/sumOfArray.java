import java.sql.SQLOutput;
import java.util.Scanner;

public class sumOfArray {

    public static void main(String args[])
    {

        int size;

        Scanner sc= new Scanner(System.in);

        System.out.println("enter the size of the array");
        size= sc.nextInt();
        int a[]= new int [size];
        System.out.println("Enter Numbers:");
        for (int i=0;i<size; i++)
        {
            a[i]=sc.nextInt();
            System.out.println();
        }

        int sum=0;
        for(int i=0; i<size; i++)
        {
            sum +=a[i];
        }

        System.out.println("Total of the array's numbers are :"+ sum);
    }
}
