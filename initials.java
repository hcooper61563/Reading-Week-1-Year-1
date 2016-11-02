import java.util.Scanner;
public class initials
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name=("");
        String greeting=("");
        
        String first;
        String second;
        String third;
        int space;
        int last;
        
        System.out.print ("Please enter your First Name, Middle Name and Surname ");
        name=sc.nextLine();
        
        first=(name.substring(0,1));
        space=(name.indexOf(" "));
        second=(name.substring(space,space+1));
        last=(name.lastIndexOf(" "));
        third=(name.substring(last,last+1));
        
        greeting= ("Hello "+(first + second + third));
        System.out.println (greeting);
        
        
    }
}
