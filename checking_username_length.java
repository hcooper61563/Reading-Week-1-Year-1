import java.util.Scanner;

public class checking_username_length
{
    public static void main(String args[])
    {
        String username=("");
        int userlong=0;
        Scanner sc = new Scanner(System.in);
        System.out.print ("Please enter your name ");
        username=sc.nextLine();
        userlong=username.length();
        System.out.println(userlong);
        

        
        
        
    }

}

