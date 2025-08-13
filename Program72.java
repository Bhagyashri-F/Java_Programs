import java.util.Scanner;

class Digits
{
    public int CountEven(int iNo)
    {
        int iDigit = 0, iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;

            if((iDigit % 2) == 0)
            {
                iCnt++;
            }
            
            iNo = iNo / 10;
        }
        return iCnt;
    }
}

class Program72
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.CountEven(iValue);

        System.out.println("No of even digits are : "+iRet);
    }
}