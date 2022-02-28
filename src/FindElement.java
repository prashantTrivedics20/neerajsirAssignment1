import java.util.Scanner;
//Design a method that returns true if element n is a member of given array  and false if not  by using the recursion
public class FindElement {
    public static boolean find(int arr[],int ele,int idx)
    {
        if(idx==arr.length)
        {
            return false;
        }
        if(arr[idx]==ele)
        {
            return true;
        }
        boolean b=find(arr,ele,idx+1);
        if(b==true)
        {
            return true;

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        System.out.println("Enter the element that you want to find");
        int ele=readme.nextInt();
        boolean b=find(arr,ele,0);
        System.out.println(b);

    }
}
