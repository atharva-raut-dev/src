package conditionals;
import java.util.Scanner;

public class ReverseNo
{
    public static void main(String[] args) 
    {
        try(Scanner input = new Scanner(System.in);)
        {
            int n = input.nextInt();
            int ans = 0 ;
            while (n > 0)
            {
                int rem = n % 10;
                n = n / 10;
                ans = ans * 10 + rem;
            }
            System.out.println("The Reverse No is: " + ans);
        }
    }


}
