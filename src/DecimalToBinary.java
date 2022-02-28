import java.util.Scanner;
// Write a recursive function to convert a decimal no into a binary no, print the binary number.
public class DecimalToBinary {
    public static void DecimalToBinary(int n)
    {
        if(n==0)
        {
            return;
        }
        DecimalToBinary(n/2);
        System.out.print(n%2);
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        DecimalToBinary(n);

    }
}
