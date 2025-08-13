import java.util.*;

class Program503
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        str = str.replace(" ","");

        System.out.println(str);
    }
}