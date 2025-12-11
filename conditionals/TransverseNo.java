public class TransverseNo
{
    public static void main(String[] args)
    {
     int n = 125545;
     int count = 0;

     while(n > 0)
     {
         int rem = n % 10;
         if(rem == 5)
         {
            count ++;
         }
         n = n / 10;
     }
        System.out.println("No of 5s are :"+ count);
    }
}
