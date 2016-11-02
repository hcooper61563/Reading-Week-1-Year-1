import java.util.Scanner;
public class reverse_a_string_with_empty_cheker_not_working
{
    public static void main (String args[])
    {
       String word=("");
       Scanner sc=new Scanner (System.in);
       boolean empty=true;
       System.out.print ("Please enter a word ");
       word=sc.nextLine ();
       do {
           System.out.print ("Please enter a word ");
           word=sc.nextLine ();
           if (!word.equals("")) 
               empty=false;
           else 
               empty=true;
       }while (empty=true);
    
            
       for (int i=word.length () -1; i >= 0; i--)
       {
           System.out.print (word.charAt(i)); 
       
       }
    }
}
