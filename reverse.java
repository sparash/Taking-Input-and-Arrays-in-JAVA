import java.util.Scanner;
public class reverse
{
    public static void main(String[] args)
    {
        int num, rem, rev=0;
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the number to be reversed: ");
        num=s.nextInt();

        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        System.out.println("Number to be reversed will be:"+rev);
    }
}