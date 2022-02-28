// digit count recursively
import java.util.Scanner;
public class DigitCountRecursively {
    public static int  count(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int s=count(n/10);
        s=s+1;
        return s;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int c=count(n);
        System.out.println(c);
    }
}
