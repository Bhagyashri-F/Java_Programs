import java.util.*;

class Program491
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        String sRet = str.replaceAll(" ","");

        System.out.println("Updated string is  : "+ sRet);
        System.out.println("Length of Updated string is  : "+ sRet.length());
    }
}