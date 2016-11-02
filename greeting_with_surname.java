
import java.util.Scanner;
public class greeting_with_surname
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name=("");
        String greeting=("");
        int space;
        int length;
        System.out.print ("Please enter your First Name and Surname ");
        name=sc.nextLine();
        space=((int)name.indexOf(' '));
        length=((int)name.length());
        greeting= ("Hello "+(name.substring(space,length)));
        System.out.println (greeting);
    }
}
