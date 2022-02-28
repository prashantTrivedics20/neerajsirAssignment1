import java.util.ArrayList;
import java.util.Scanner;
//Q. Print an array that contains the exact same number as the given array,
// but rearrange so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order.
// You may modify and print the given array, or make a new array.
//Rearrange ([3,3,2]) -> [2,3,3]
//Rearrange(0,1,0,1,1,]) -> [0,0,1,1,1]
public class RearrangingTheArray {
    public static Integer[] rearrange(int arr[])
    {
        ArrayList<Integer>al=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0)
            {
                al.add(arr[i]);
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==1)
            {
                al.add(arr[i]);
            }
        }
        Integer array[]=new Integer[al.size()];
        al.toArray(array);
        return array;

    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        Integer sum[]=rearrange(arr);
        for (int i = 0; i <sum.length ; i++) {
            System.out.print(sum[i]+" ,");
        }



    }
}
