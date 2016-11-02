
import java.util.Scanner;
public class consonants_and_vowels
{
    public static void main (String args[])
    {
       String word=("");
       Scanner sc=new Scanner (System.in);
       int vowels=0;
       int consonant=0;
       String y=("");
       System.out.print ("Please enter a word ");
       word=sc.nextLine ();
       for (int i = 0; i < word.length(); i++) {
           y=word.substring(i,i+1);
           {
                if (y.equalsIgnoreCase("a") == true)
                    vowels++;
                else if (y.equalsIgnoreCase("e") == true)
                    vowels++;
                else if (y.equalsIgnoreCase("i") == true)
                    vowels++;
                else if (y.equalsIgnoreCase("o") == true)
                     vowels++;
                else if (y.equalsIgnoreCase("u") == true)
                     vowels++;
                else 
                    consonant++;
                }
            }
       System.out.println ("There are " + vowels + " vowels in this word");
       System.out.println ("There are " + consonant + " consonants in this word");
        }

    }

