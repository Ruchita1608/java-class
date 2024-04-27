import java.util.Scanner;

public class sortArray {

    public static void main(String args[])
    {
        int size;

        System.out.println("enter the size of the array");
        Scanner sc= new Scanner(System.in);
        size= sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the array numbers");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int largeNum=0;
        for(int i=1; i<size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if(arr[j]> arr[j+1])
                {
                    largeNum=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=largeNum;
                }
            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
