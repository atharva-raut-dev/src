package conditionals;
import java.util.Scanner;
public class SwitchCase
{
    public static void main(String[] args)
    {
        try(Scanner in = new Scanner(System.in);)
        {
                String fruit = in.next();

                switch (fruit) 
                {
                    case "Mango": {
                        System.out.println("King of all Fruits");
                        break;
                    }
                    case "banana": {
                        System.out.println("Rich in phosporous");
                        break;
                    }
                    case "apple": {
                        System.out.println("A RED Fruit");
                        break;
                    }
                    case "orange": {
                        System.out.println("A ball like Fruit");
                    }
                    default: {
                        System.out.println("Enter the correct Fruit");
                    }
                }           
        }
        
    }
}
