package internship;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
    	 Scanner scan = new Scanner(System.in);
         Random random = new Random();

         int lowerBound = 1;
         int upperBound = 100;
         int numberOfAttempts = 10;  
         int rounds = 0;
         int totalAttempts = 0;

         System.out.println("Welcome to the Guessing Game!");
         System.out.println("Guess the number between " + lowerBound + " and " + upperBound);

         boolean playAgain = true;
         
         while (playAgain) 
         {
             int randomNumber = random.nextInt(100)+1;
             System.err.println("Guessing number "+randomNumber);
             int userGuess;
             int attempts = 0;

             do {
                 System.out.print("Enter your guess: ");
                 userGuess = scan.nextInt();
                 attempts++;

                 if (userGuess < randomNumber) 
                 {
                     System.out.println("Too low! Try again.");
                 } 
                 else if (userGuess > randomNumber) 
                 {
                     System.out.println("Too high! Try again.");
                 } 
                 else 
                 {
                     System.out.println("Congratulations! You guessed the "+randomNumber+ " in " + attempts + " attempts.");
                 }

             } 
             while (userGuess != randomNumber && attempts < numberOfAttempts);
             {
	             totalAttempts += attempts;
	             rounds++;
	             System.out.print("Do you want to play again? (yes/no): ");
	             String playAgainResponse = scan.next().toLowerCase();
	             playAgain = playAgainResponse.equals("yes");
             }
         }
         System.out.println("Game Over! You played " + rounds + " rounds.");
         System.out.println("Your average number of attempts: " + (double) totalAttempts / rounds);
     }
 
       
}
