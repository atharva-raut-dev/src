package conditionals;
import java.util.Scanner;

public class LargestMathMax
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //int max = 0;
        /*We can use if else to find largest number.
        if(a > b)
        {
            max = a;
        }
        if(b > c)
        {
            max = b;
        }
        if (c > a)
        {
            max = c;
        }
         */
        // To directly compare the numbers we use Math.max function
        int max = Math.max(c, Math.max(a,b));
        System.out.println("The largest number is: "+ max);
        in.close();
    }
}
