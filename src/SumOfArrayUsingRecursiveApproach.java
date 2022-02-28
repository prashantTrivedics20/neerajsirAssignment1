import java.util.Scanner;
//Q.Write a recursive method for computing the sum of all the elements of an array.
// Start with an algorithm in English, then translate this algorithm into code.
// Trace your method on the example of the following array with 3 elements: 2, 0, and 1.
public class SumOfArrayUsingRecursiveApproach {
    public static int sum(int arr[],int idx)
    {
        if(idx==arr.length)
        {
            int s;
            return s=0;
        }
        int res=sum(arr,idx+1);
        res=res+arr[idx];
        return res;
    }
}
class SumOfElements
{
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int array[]=new int[n];
        for (int i = 0; i <array.length; i++) {
            array[i]=readme.nextInt();
        }
        int sum=SumOfArrayUsingRecursiveApproach.sum(array,0);
        System.out.println(sum);

    }
}

