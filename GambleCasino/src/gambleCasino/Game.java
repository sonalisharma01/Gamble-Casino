package gambleCasino;

import java.util.Random;
import java.util.Scanner;


public class Game {
	int playerGuess;
	int computerGuess;
	String playerName;;
	Random rand = new Random();  // random number generator

	public  String PlayGame(String playerName){
			
			playerGuess = playerGuess();	// player input 
			computerGuess = computerInput(playerGuess);  // computer value
			System.out.print("\nComputer number is  " + computerGuess);
			this.playerName= playerName;			// player name initialsied
			return determineWinner();   //  determines winner
			
	}
	
	private int playerGuess() {
		System.out.print("\nEnter Your Number ");
		Scanner inputScanner = new Scanner(System.in);
		int userInput;
			while (true) {	
				userInput = Integer.parseInt(inputScanner.nextLine());
			if(userInput>100 ||userInput<0 ) {
				System.out.print("Invalid entry");
			}
			
			else {
				break;
					}}
		System.out.print("Your guess is  "+ userInput);
		return userInput;
		
	}
			
	private String determineWinner() {
		if(Math.abs(playerGuess - computerGuess)<=10)
			return playerName;   // returns player name 		
		else return "Computer";      //returns computer
	}			
	private int computerInput(int playerInput) {
		int computerGuess;
		while (true) {	
			
			//Algorithm for 50% success 
			//Since number should be +-10 range, computer guess should be +-20 range to have 50% success
			if(playerInput>=20 && playerInput<=100) {
			computerGuess = rand.nextInt((playerInput+20)-(playerInput-20))+(playerInput-20);
			break;
			}
			
			else if(playerInput<20 && playerInput>0) {
			computerGuess = rand.nextInt((playerInput+20))+1;
			break;
						}}
		return computerGuess;
		}


	
}
