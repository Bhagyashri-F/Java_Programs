import java.util.*;

class Program498
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        int i = 0;
        int iCount[] = new int[26];

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iCount[Arr[i] - 'a']++;
            }
        }

        for(i = 0; i < 26; i++)
        {
            if(iCount[i] != 0)
            {
                System.out.println("Frequency of "+(char)(i + 'a') + " : " +iCount[i]);
            }
        }
    }
}