//abcdefg hijk
//kjih gfedcbc

import java.util.*;

class Program529
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");

        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        StringBuilder sb = new StringBuilder(str);
        // StringBuffer sb = new StringBuffer(str);

        sb.reverse();

        System.out.println(sb);
   }
}