import java.util.*;

/*
convert str1 to char array as Arr
convert str2 to char array as Brr

create array count1 of size 26 for Arr
create array count2 of size 26 for Brr

travel Arr and maintain the frequency in count1
travel Brr and maintain the frequency in count2

compare count1 and count2
if they are equal return true
otherwise return false
 */

class Marvellous
{
    public static boolean CheckAnagram(String str1, String str2)
    {
        boolean bFlag = true;
        int i = 0;

        if(str1.length() != str2.length())
        {
            return false;
        }

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        int Count1[] = new int[26];
        int Count2[] = new int[26];

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                Count1[Arr[i] - 'a']++;
            }
        }

        for(i = 0; i < Brr.length; i++)
        {
            if((Brr[i] >= 'a') && (Brr[i] <= 'z'))
            {
                Count2[Brr[i] - 'a']++;
            }
        }

        for(i = 0; i < 26; i++)
        {
            if(Count1[i] != Count2[i])
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }
}

class Program500
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter the second string : ");
        String str2 = sobj.nextLine();

        boolean bRet = false;

        bRet = Marvellous.CheckAnagram(str1, str2);

        if(bRet == true)
        {
            System.out.println("String is anagram");
        }
        else
        {
            System.out.println("String is not a anagram");
        }
    }
}