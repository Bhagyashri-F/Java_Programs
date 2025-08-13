import java.util.*;

class StringX
{
    public static String Trim(String str)
    {
        int i = 0, iStart = 0, iEnd = 0;

        char Arr[] = str.toCharArray();     //_ _ _ JAY_ _ GANNNESH_ _ 

        if(Arr[0] == ' ')
        {
            while((Arr[i] == ' ') && (i < Arr.length))
            {
                i++;
            }
        }

        iStart = i;

        i = 0;

        i = Arr.length - 1;

        if(Arr[Arr.length - 1] == ' ')
        {
            while(Arr[i] == ' ')
            {
                i--;
            }
        }

        iEnd = i;

        //String(Array_name, Starting_index, count)
        return new String(Arr, iStart, iEnd - iStart + 1);
    }
}

class Program489
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        String sRet = StringX.Trim(str);

        System.out.println("Updated string is  : "+ sRet);
        System.out.println("Length of Updated string is  : "+ sRet.length());
    }
}