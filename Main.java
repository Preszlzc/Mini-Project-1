import java.util.Random;
import java.util.Scanner;

class Main {
  static void playGame(int random, int userInput) {
    System.out.println("Please guess a number between 0 and " + userInput);
    Scanner s = new Scanner(System.in);
    int userGuess = s.nextInt();
    int numTries = 1;
    while (random != userGuess) {
      if(userGuess>random) {
        numTries++;
        System.out.println("Guess lower!");
        System.out.println("Enter a new guess:");
        int userGuess2 = s.nextInt();
        userGuess = userGuess2;
      }
      else if (userGuess<random) {
        numTries++;
        System.out.println("Guess higher!");
        System.out.println("Enter a new guess:");
        int userGuess2 = s.nextInt();
        userGuess = userGuess2;
      }
    }
    System.out.println("Great, you win! It took you " + numTries +" tries");
  }
  public static void main(String[] args) {
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any postive whole number:");
    int userNum = s.nextInt();
    int randomNum = r.nextInt(userNum);
    playGame(randomNum, userNum);
  }
}