import java.util.*;

class Program496
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        int i = 0;
        int iCount[] = new int[26];

        char Arr[] = str.toCharArray();
        char ch = 'a';

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iCount[Arr[i] - 'a']++;
            }
        }

        for(i = 0; i < 26; i++)
        {
            System.out.println("Frequency of "+Arr[i] + " : " +iCount[i]);
        }
    }
}