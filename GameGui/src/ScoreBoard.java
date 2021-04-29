public class ScoreBoard extends GameGui {

	static int player = 0;
	static int dealer = 0;
	static int player1 = 0;
	static int computer = 0;
	static int score = 0;

	
	
	//------------------------BlackJack Scoreboard---------------------------------------
	
	// Constructor to store score of player and dealer
	public ScoreBoard(int playerScore, int dealerScore) {
		
	    if ((playerScore > 21 || playerScore < dealerScore) && (dealerScore < 22)) {
	            dealer++; 
	            } 
	    else if ((dealerScore > 21 || playerScore > dealerScore) && (playerScore < 22)) {
	            player++;
	            }    
	}
	
	// Displays the final score of the player and dealer
	public static void printBlackJackScore() {
		
		
		System.out.println("Player's score: " + player);
		System.out.println("Dealer's score: " + dealer);
		
	}
	
	//--------------------------------War Game Scoreboard----------------------------------
	
	// Constructor to store score of player and computer
	
	
	// Displays the final score of player and computer
	public static String printPlayerWarScore() {
		
		return ("Player's score: " + playerCardsWon);
		//System.out.println("Computer's score: " + computer);
		
	}
        public static String printComputerWarScore() {
		
		return ("Computer's score: " + computerCardsWon);
		//System.out.println("Computer's score: " + computer);
		
	}
}
	