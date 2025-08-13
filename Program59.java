import java.util.Scanner;

class Number
{
    public boolean CheckEven(int iNo)
    {
        if((iNo % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program59
{
    public static void main(String A[])
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckEven(iValue);
        
        if(bRet == true)
        {
            System.out.println(iValue + " is Even number");
        }
        else
        {
            System.out.println(iValue +" is odd number");
        }
    }
}