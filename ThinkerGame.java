import java.util.*;

class Gusser
{
	int guessNum;
	int guessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Gusser kindly guess the number and keep it secret, don't tell anyone :- ");
		guessNum = scan.nextInt();
		return guessNum;
	}
	
}
class Player
{
	int guessNum;
	int guessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey Player! Enter your guess. Thank You!");
		guessNum = scan.nextInt();
		return guessNum;
		
	}
}

class Umpire
{
	int numFromGusser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGusser()
	{
		Gusser g = new Gusser();
		numFromGusser = g.guessNum();
	}
	void collectNumFromPlayers()
	{
	    Player player1 = new Player();
	    numFromPlayer1 = player1.guessNum();
	    Player player2 = new Player();
	    numFromPlayer2 = player2.guessNum();
	    Player player3 = new Player();
	    numFromPlayer3 = player3.guessNum();
	}
	
	void compare()
	{
		if(numFromGusser == numFromPlayer1)
		{
			if(numFromGusser == numFromPlayer2 && numFromGusser == numFromPlayer3)
			{
				System.out.println("All players won the Game. Congratulations to all!");
			} 
			else if(numFromGusser == numFromPlayer2)
			{
				System.out.println("Player1 & Player2 has won the Game. Congratulation!");
			} 
			else if(numFromGusser == numFromPlayer3)
			{
				System.out.println("Player1 & Player3 has won the Game. Congratulations!");
			}
			else
			{
				System.out.println("Player1 has won the Game. Congratulations!");
			}
		}
		else if(numFromGusser == numFromPlayer2)
		{
			if(numFromGusser == numFromPlayer3)
			{
				System.out.println("Player2 & Player3 has won the Game. Congratulations!");
			}
			else
			{
				System.out.println("Player3 has won the Game. Congratulations!");
			}
		} 
		else if(numFromGusser == numFromPlayer3)
		{
			System.out.println("Player3 has won the Game.Congratulations! Thank You for Participating.");
		}
		else
		{
			System.out.println("Game Lost! Play Again.");
		}
	}
	
}
public class ThinkerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u = new Umpire();
		u.collectNumFromGusser();
		u.collectNumFromPlayers();
		u.compare();

		
	}

}
