import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserMainCode {
    public int count(int n)
    {
        ArrayList<Integer>al=new ArrayList<>();
        while(n>0)
        {
            al.add(n%10);
            n=n/10;
        }
        Set<Integer> s=new HashSet<>();
        for(Integer i1:al)
        {
            s.add(i1);
        }
        return s.size();
    }

    public static void main(String[] args) {
        UserMainCode obj=new UserMainCode();
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int d=obj.count(n);
        System.out.println(d);
    }
}
