
import java.util.Scanner;
public class reverse_a_string 
{
    public static void main (String args[])
    {
       String word=("");
       Scanner sc=new Scanner (System.in);
       boolean empty=true;
       System.out.print ("Please enter a word ");
       word=sc.nextLine ();
       
       System.out.print ("Please enter a word ");
       word=sc.nextLine ();
          
    
            
       for (int i=word.length () -1; i >= 0; i--)
       {
           System.out.print (word.charAt(i)); 
       
       }
    }
}
