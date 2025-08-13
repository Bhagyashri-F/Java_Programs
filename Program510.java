//_ _ _India_ _ _ _is_ _my_country _ _ _ _
//After trim()
//India_ _ _ _is_ _my_Country

import java.util.*;

class Program510
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");

        String str = sobj.nextLine();

        str = str.trim();

        char Arr[] = str.toCharArray();
        char Brr[] = new char[Arr.length];

        int iCount = 0, i = 0, j = 0;
        boolean bFlag = false;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] != ' ')
            {
                Brr[j] = Arr[i];
                j++;
                bFlag = false;
            }
            else if(Arr[i] == ' ')
            {
                if(bFlag == false)
                {
                    Brr[j] = ' ';
                    j++;

                    bFlag = true;
                }   
            }

        }

        String output = new String(Brr);

        output = output.trim();

        System.out.println("Updated string is : " + output);
        System.out.println("Length of Updated string is : " + output.length());
    }
}