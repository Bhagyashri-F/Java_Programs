import java.util.Scanner;

class Digits
{
    public int CountDigits(int iNo)
    {
        int iCnt = 0;

        while(iNo > 0)
        {
            iNo = iNo / 10;
            iCnt++;
        }
        return iCnt;
    }
}

class Program67
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();
        int iRet = dobj.CountDigits(iValue);

        System.out.println("No of digits is : "+iRet);
    }
}