import java.util.*;

class Program494
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        int i = 0;
        int iCount[] = {0, 0, 0};

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'a')
            {
                iCount[Arr[i] - 'a']++;
            }
            else if(Arr[i] == 'b')
            {
                iCount[Arr[i] - 'a']++;
            }
            else if(Arr[i] == 'c')
            {
                iCount[Arr[i] - 'a']++;
            }
        }

        System.out.println("Frequency of a : "+iCount[0]);
        System.out.println("Frequency of b : "+iCount[1]);
        System.out.println("Frequency of c : "+iCount[2]);
    }
}