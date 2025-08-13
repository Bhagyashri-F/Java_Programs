import java.util.*;

class Program523
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");

        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        int iMax = 0, idx = 0;

        for(int i = 0; i < tokens.length; i++)
        {
            if(iMax <= tokens[i].length())
            {
                iMax = tokens[i].length();
                idx = i;
            }
        }

        System.out.println("Token with maximum length : " + tokens[idx] + " : " + tokens[idx].length());
   }
}