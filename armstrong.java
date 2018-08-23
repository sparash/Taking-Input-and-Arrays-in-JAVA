import java.util.Scanner;
class armstrong
{

    public static void main(String[] args)
    {

        int num, number, temp, total=0;
        System.out.print("Enter the three digit number: ");
        Scanner s=new Scanner(System.in);
        num = s.nextInt();

        number=num;

        for( ;number!=0;number /= 10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}