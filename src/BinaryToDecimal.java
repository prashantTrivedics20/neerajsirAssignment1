// write a program to print the binary to decimal recursively....
import java.util.Scanner;
import java.lang.Math;
public class BinaryToDecimal {
    public static int BinaryToDecimal(int b,int c)
    {
        if(b==0)
        {
            int s;
            return s=0;
        }
        int D=b%10;
       int res= BinaryToDecimal(b/10,c+1);
       int result=res+D*(int)Math.pow(2,c);
       return result;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int b=readme.nextInt();
       int res= BinaryToDecimal(b,0);
        System.out.println(res);

    }
}
