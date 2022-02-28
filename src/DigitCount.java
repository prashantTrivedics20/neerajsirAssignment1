import java.util.ArrayList;
import java.util.Scanner;
public class DigitCount {
    public void count(int n)
    {
        int c=0;
        int temp=n;
        while(temp>0)
        {
            int r=temp%10;
            c++;
            temp=temp/10;
        }
        int []arr=new int[c];
        System.out.println(arr.length);
        int i=0;
        while(n>0) {
            int r = n % 10;
            arr[i] = r;
            n = n / 10;
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        DigitCount obj=new DigitCount();
        int n=readme.nextInt();
        obj.count(n);

    }
}
