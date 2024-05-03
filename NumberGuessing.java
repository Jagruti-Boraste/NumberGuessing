package number_game;
import java.util.*;

public class NumberGuessing 
{
  static int score=0;
  static int attempt;
	
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("---------------------------------");
    System.out.println("Welcome To Number Guessing Game!");
    System.out.println("---------------------------------");
    int choice;
    do
    {
     System.out.println("---------------------------------");
     System.out.println("1: Play the Game!");
     System.out.println("2: Know the Scorecard");
     System.out.println("3: End Game!");
     System.out.println("---------------------------------");

     System.out.println("What you want to go for?");
     choice=sc.nextInt();
     try
     {
	  switch(choice)
	  {
	    case 1:

	     System.out.println("You have 5 attempts to guess the number!");
	    	
		 int number=Random();
		 NumberGuessing.Guessing(number);
	     break;
	      
	   case 2:
		 System.out.println("The Score is: "+score);
		 break;
		 
	   case 3:
		 System.out.println("Game Over3!");
		 break;
	  }
	 
     } 
     catch(InputMismatchException e)
     {
	  System.out.println("Wrong Input!"+e); 
     }
    }
    while(choice!=3);
  }

  static int Random()
  {
   int number;
   return number=(int)(100*Math.random());
  }
  
  static void Guessing(int number)
  {
	int guess=0;
	int i;
	//int attempt;
	Scanner sc= new Scanner(System.in);
	for(attempt=1; attempt<=5; attempt++)
	{
	 System.out.println("Enter the Number in between range of 1 to 100 to guess: ");
	 guess=sc.nextInt();
	 if(guess==number)
	 {
	  System.out.println("Congratulations...You guessed it right!");
	  score++;
	   break;
	 }
	 else if(guess>number)
	 {
	  System.out.println("The number is smaller than "+guess);
	 }
	 else
	 {
	  System.out.println("The number is greater than "+guess);
	 }
	}
	if(attempt==6)
	{
	System.out.println("Sorry you ran out of attempts!");
	System.out.println("The Correct answer is: "+number);
	System.out.println();
	}
   }
}
