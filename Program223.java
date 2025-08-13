import java.util.Scanner;

class NNumberX
{
    private int Arr[];      //Arr is private

    public NNumberX(int iSize)
    {
        System.out.println("Allocating the resources");
        Arr = new int[iSize];       //resource allocation
    }
    
    protected void finalize()
    {
        System.out.println("Deallocating the resources...");
        Arr = null;
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;

        System.out.println("Enter elemnts : ");
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            this.Arr[iCnt] = sobj.nextInt();
        }

        sobj = null;
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elememts of array are : ");
        
        for(iCnt = 0; iCnt < this.Arr.length; iCnt++)
        {
            System.out.println(this.Arr[iCnt]);
        }
    }

    public int CountEven()
    {
        int iCount = 0, iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 2) == 0)
            {
                iCount++;
            }
        } 

        return iCount;
    }

}

class Program223
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();

        NNumberX nobj = new NNumberX(iSize);

        nobj.Accept();

        nobj.Display();
 

        int iRet = 0;

        iRet = nobj.CountEven();

        System.out.println("Number of even numbers : "+iRet);      

        sobj = null;
        nobj = null;

        System.gc();
    }
}