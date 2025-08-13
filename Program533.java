//paliandrome

import java.util.*;

class Program533
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter word : ");

        String str = sobj.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.reverseAll();

        if(str.equals(new String(sb)))
        {
            System.out.println("String is paliandrome");
        }
        else
        {
            System.out.println("String is not a paliandrome");
        }
   }
}