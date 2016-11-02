
import java.util.Scanner;
public class how_many_words_in_a_saying
{
    public static int countWords(String saying)
 {

     int wordCount = 0;

     boolean word = false;
     int endOfLine = saying.length() - 1;

     for (int i = 0; i < saying.length(); i++) {
        
          if (Character.isLetter(saying.charAt(i)) && i != endOfLine) {
              word = true;
           
          } else if (!Character.isLetter(saying.charAt(i)) && word) {
              wordCount++;
              word = false;
      
          } else if (Character.isLetter(saying.charAt(i)) && i == endOfLine) {
              wordCount++;
          }
      }
     System.out.println ("There are " + wordCount + " words in this statement");
     return wordCount;
  }
  public static void main (String args[])
  {
  Scanner sc = new Scanner(System.in);
        String saying=("");
        System.out.print ("Please enter a saying ");
        saying=sc.nextLine();
  countWords (saying);
  
 }
}
