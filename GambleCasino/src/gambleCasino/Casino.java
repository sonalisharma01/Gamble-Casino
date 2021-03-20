package gambleCasino;

import java.util.Scanner;
public class Casino {

	String playerName;
	int playerAge;
	String userInput;
	Scanner sc = new Scanner(System.in);
	Player player = new Player(); //player object 
	public void OrganizeNewGame() {
		
		
		System.out.print("Do you want to play the game (yes or no) ");
		userInput = sc.nextLine();
		
		 if(userInput.equals("yes")) {
			 
			System.out.print("lets Play the Game");
			Casino casino = new Casino();   // casino object 
			Game game = new Game();   //game object 
			String playerName = playerInfo();	
			
			for(int x= 1; x<=5; x++) {				
			System.out.print("\n"+ "Round: " + x);
			String result = game.PlayGame(playerName);	//player details passed to PlayGame()
			System.out.print("\n"+ result +" wins ");	}
				}
		else
		{
			System.out.print("Good Bye");	
		}
	}
		public String playerInfo() {
		
		boolean isValid = false;
		System.out.print("\nPlease enter Player Name  ");
		userInput = sc.nextLine();  // scanner scans the input value
		player.setName(userInput);  // player object sets player name using setName function

		System.out.print("Player name is : " + userInput);
		
		while (true) {
			if(isValid) break;    // condition to break loop 
			
			System.out.print("\nPlease enter Player age ");
			userInput = sc.nextLine();
			
			try {
				player.setAge(Integer.parseInt(userInput));  // player object sets Age using setPlayerAge()
				System.out.print("Entered age is : " + userInput);
				isValid = true;
				System.out.print("\nAll set now please guess the number between 1 and 100");
				System.out.print("\nAnd I will Guess a game");
				System.out.print("\nIf you guess in 10 of my guess: then you will win else I win!");	
				}
			
			catch(Exception e){
				
				System.out.print("Wrong Entry");
			}
						
		}
		
		
		return player.getName(); //return player object
		
	}
	
}
