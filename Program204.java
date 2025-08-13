import java.util.Scanner;

class Program204
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter oyur name : ");
        String name = sobj.nextLine();

        System.out.println("Your name is : "+name);

        System.out.println("String length : "+name.length());
    }
}