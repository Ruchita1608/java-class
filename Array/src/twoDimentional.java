import java.util.Scanner;

public class twoDimentional {

    public static void main(String args[])
    {
        int row, col;

        System.out.println("Enter Number of rows");
        Scanner sc= new Scanner(System.in);
        row=sc.nextInt();

        System.out.println("Enter number of columns");
        col=sc.nextInt();

        int arr[][]=new int [row][col];

        System.out.println("Enter your 2-Dim array");
        for(int i=0; i<row; i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Your array values are:");

        for(int i=0;i<row; i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
