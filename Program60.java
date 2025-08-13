import java.util.Scanner;

class Number
{
    public void DisplayFators(int iNo)
    {
       int iCnt = 0;
       System.out.println("Factors of : "+iNo);
       
       for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
       {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
       }
    }
}

class Program60
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayFators(iValue);
    }
}