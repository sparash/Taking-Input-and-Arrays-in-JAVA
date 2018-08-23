import java.util.Scanner;
class pattern
{
    public static void main(String[] args)
    {

        System.out.print("Enter number = ");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int i,j;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}