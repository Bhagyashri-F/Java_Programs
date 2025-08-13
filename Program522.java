import java.util.*;

class Program522
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");

        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        int iMax = 0;
        String maxStr = null;

        for(int i = 0; i < tokens.length; i++)
        {
            if(iMax <= tokens[i].length())
            {
                iMax = tokens[i].length();
                maxStr = tokens[i];
            }
        }

        System.out.println("Token with maximum length : " + maxStr + " : " + maxStr.length());
   }
}