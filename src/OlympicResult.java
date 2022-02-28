import java.util.ArrayList;
import java.util.Scanner;

/*The Olympic results are given in a table,
where each row represents a country, and columns represent gold, silver, and bronze medals.
 For example, the element r[0][0] is the number of gold medals earned by the 0-th country.
 Write a method that takes the table as an input,
 and returns a new array which lists the total number of medals for each country. For example, if we start with the table
        2   0   1
        3   2   0
        0   0   2
        in which the 0-th country earned 2 + 0 + 1 = 3 medals, the 1-st country earned 3 + 2 + 0 = 5 medals, and the 2nd country earned 0 + 0 + 2 = 2 medals, your method should return an array with values
        3
        5
        2

 */
public class OlympicResult {
    public static Integer[] medals(int arr[][])
    {
        ArrayList<Integer>al=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            int s=0;
            for (int j = 0; j < arr[i].length; j++) {
               s=s+arr[i][j];
            }
            al.add(s);
        }
        Integer array[]=new Integer[al.size()];
        al.toArray(array);
        return array;
    }
}
class OlympicTest
{
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=readme.nextInt();
            }
        }
        Integer medals[]=OlympicResult.medals(arr);
        for (int i = 0; i <medals.length ; i++) {
            System.out.println(medals[i]);
        }
    }
}
