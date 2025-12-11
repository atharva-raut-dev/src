package conditionals;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
      try(Scanner in = new Scanner(System.in);)
       {
            int ans = 0;
            while(true)
            {
                System.out.println("Enter the operation you want to perform :-");
                char op = in.next().trim().charAt(0);

                if (op == '+' || op == '-' || op == '*' || op == '/')
                {
                    System.out.print("Enter your numbers:- ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();

                    if (op == '+') {
                        ans = num1 + num2;
                    }
                    if (op == '-') {
                        ans = num1 - num2;
                    }
                    if (op == '*') {
                        ans = num1 * num2;
                    }
                    if (op == '/') {
                        ans = num1 / num2;
                    }
                }
                else if(op == 'x' || op == 'X'){
                    System.out.println("The program ended");
                    break;
                }
                else{
                    System.out.println("Enter the corretor operator");
                }
                System.out.println("The answer of your selected operation is:- "+ans);
            }
        }    
    }
}
