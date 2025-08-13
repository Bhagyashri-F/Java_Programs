//demo hello pune demo code hello india pune ppa lb hello
/*
    ------------
        Hashmap
    ------------
    key   value
    ------------
    demo    2
    hello   3
    pune    2
    code    1
    ppa     1
    lb      1
    ------------

    Accept string
    Remove extra whitespaces using trim
    Remove in between white space using replaceAll
    Tokenize the string using split
    Create hashmap with string as key and int as value
    Tracel tokens array and update hashmap
    Travel hashmap and display result
 */

import java.util.*;

class Program524
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");

        String str = sobj.nextLine();

        str = str.trim();
        
        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        HashMap <String, Integer> hobj = new HashMap<String, Integer>();

        for(String s : tokens)
        {
            if(hobj.containsKey(s))
            {
                hobj.put(s, hobj.get(s) + 1);
            }
            else
            {
                hobj.put(s,1);
            }
        }

        for(String s : hobj.keySet())
        {
            System.out.println(s + " : " + hobj.get(s));
        }
   }
}