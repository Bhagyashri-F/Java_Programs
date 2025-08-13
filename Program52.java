import java.util.Scanner;

class Program52
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sobj.nextLine();

        System.out.println("Enter your age : ");
        int age = sobj.nextInt();

        System.out.println("Enter your marks : ");
        float marks = sobj.nextFloat();

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Marks : "+marks);
    }
}