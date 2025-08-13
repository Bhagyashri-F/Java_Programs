import java.util.Scanner;

class Number
{
    public void Sum(int iNo)
    {
       int iCnt = 0, iSum1 = 0 , iSum2 = 0;

       for(iCnt = 1; iCnt <= iNo; iCnt++)
       {
            if((iNo % iCnt) == 0)
            {
                iSum1 = iSum1 + iCnt;
            }
            else
            {
                iSum2 = iSum2 + iCnt;
            }    
       }
       System.out.println("Sum of factors is : "+iSum1);
       System.out.println("Sum of non factors is : "+iSum2);
    }
}

class Program64
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.Sum(iValue);
    }
}