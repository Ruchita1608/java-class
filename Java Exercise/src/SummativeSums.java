import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SummativeSums {
    public static int sumArray(int arr[])
    {

        int sum=0;

        for(int i:arr)
        {
            sum +=i;
        }

        return sum;
    }

    public static void main(String args[]){

        int result;
        int arr1[]={ 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int arr2[]={999, -60, -77, 14, 160, 301};
        int arr3[]={10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("Sum of array1 is "+ sumArray(arr1));

    }
}
