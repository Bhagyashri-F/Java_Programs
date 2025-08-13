//abc def ghi
//cba fed ihg

import java.util.*;

class Program532
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");

        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        StringBuilder sb = null;

        StringBuilder newStr = new StringBuilder();

        for(String s : tokens)
        {
            sb = new StringBuilder(s);
            (newStr.append(sb.reverse())).append(" ");            // newStr = newStr + sb.reverse();
            // newStr.append(" ");                     // newStr = newStr + " ";
        }

        String finalstr = new String(newStr);

        System.out.println(finalstr.trim());
   }
}