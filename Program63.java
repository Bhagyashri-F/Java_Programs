import java.util.Scanner;

class Number
{
    public int SumNonFators(int iNo)
    {
       int iCnt = 0, iSum = 0;
       
       for(iCnt = 1; iCnt <= iNo; iCnt++)
       {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum + iCnt;
            }
       }
       return iSum;
    }
}

class Program63
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        int iRet = nobj.SumNonFators(iValue);
        System.out.println("Sum of Non Factors is : "+iRet);
    }
}