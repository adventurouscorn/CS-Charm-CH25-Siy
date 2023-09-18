import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);

		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);

		Move[] set = {rock, paper, scissors};
		
		int roundsToWin=1;
		String choice;

		System.out.println("Welcome to Rock Paper Scissors. :DDD");

		do{
			System.out.printf("\n Starting Choices: \n1. Start Game \n2. Choose Number of Round(s) to win (current: %d). \n3. Exit Application. \n", roundsToWin);
			choice = inp.nextLine();
			if (choice.equals("2")){
				System.out.println("\nHow Many Rounds should you need to win?");
				roundsToWin = Integer.parseInt(inp.nextLine());

				System.out.printf("\nThis is noted, the new rounds needed to win is now %d.\n", roundsToWin);
			}	
		} while (choice.equals("2"));

		while (choice.equals("1")){
			int playerWins=0;
			int botWins=0;
			Move botChoice;
			Move playerChoice;
			while (playerWins < roundsToWin && botWins < roundsToWin){
				botChoice = set[(int) Math.floor(Math.random()*3)];
				System.out.println("\n The Computer has made its move. Select your move: \n1. Rock \n2. Paper \n3. Scissors");
				playerChoice = set[Integer.parseInt(inp.nextLine())-1];

				System.out.printf("Bot: %s, You: %s. ", botChoice.getName(), playerChoice.getName());
				switch (Move.compareMoves(playerChoice, botChoice)){
					case(0):
						System.out.println("You WIN!!");
						playerWins+=1;
						break;
					case(1):
						System.out.println("Bot WINS!!");
						botWins+=1;
						break;
					default:
						System.out.println("It's a tie... Nobody Won");
				}
				System.out.printf("-------------Tally-------------- \nBot: %d  You: %d \n\n", botWins, playerWins);
			}
			if (playerWins>botWins){
				System.out.println("PLAYER WINS!!!\n");
			}
			else{
				System.out.println("BOT WINS!!!\n");
			}
			System.out.println("Should we play again? 1 if yes.");
			choice = inp.nextLine();
		}		
		System.out.println("Thank you so much for playing my game! Come again soon... or not. Maybe you're just grading my code");
	}
}