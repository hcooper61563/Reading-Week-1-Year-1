import java.util.Scanner; 
public class checking_that_passwords_match
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        String Password=("t");
        String VeriPassword=("s");
        while (!Password.equals(VeriPassword)){ 
            System.out.print ("Please create a password ");
            Password=sc.nextLine();
            System.out.print ("Please re-enter your password ");
            VeriPassword=sc.nextLine();
        }
        System.out.print ("Passwords match");
    }
}
