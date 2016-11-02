import java.util.*;

public class Random
{
   public static void main (String[]args)
   {
       Scanner input = new Scanner(System.in);
       Random rand = new Random();
       int Correct = 0;
       
       
       int Num_1 = (int)(Math.random() * 49 + 1);
       int Num_2 = (int)(Math.random() * 49 + 1);
       int Num_3 = (int)(Math.random() * 49 + 1);
       int Num_4 = (int)(Math.random() * 49 + 1);
       int Num_5 = (int)(Math.random() * 49 + 1);
       int Num_6 = (int)(Math.random() * 49 + 1);
       System.out.println("Please enter your numbers between 1 and 49 individually");
       for (int RandNum = 0; RandNum < 6; RandNum++){
           int Guess = input.nextInt();
           if (Guess == Num_1 || Guess == Num_2 || Guess == Num_3 || Guess == Num_4 || Guess == Num_5 || Guess == Num_6){
               Correct++;
           }
           
       }
       
       System.out.println(Num_1 +" "+ Num_2 + " " + Num_3 +" "+ Num_4 + " " + Num_5 +" "+ Num_6);
       System.out.println(Correct);
       if (Correct <=2){
           System.out.println("You win nothing");
       }
       else if (Correct == 3){
           System.out.println("You win £10");
       }
       else if (Correct == 4){
           System.out.println("You win £100");
       }
       else if (Correct == 5){
           System.out.println("You win £10,000");
       }
       else if (Correct == 6){
           System.out.println("You win £100,000");
       }
   }
}