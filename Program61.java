import java.util.Scanner;

class Number
{
    public int SumFactors(int iNo)
    {
       int iCnt = 0, iSum = 0;
       System.out.println("Factors of : "+iNo);
       
       for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
       {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
       }
       return iSum;
    }
}

class Program61
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        int iRet = nobj.SumFactors(iValue);

        System.out.println("Sum of factors is : "+iRet);
    }
}