import java.util.Scanner;
public class Runner {   
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Player 1 Name: ");
        Player player1 = new Player(input.nextLine());
        System.out.println("Enter Player 2 Name: ");
        Player player2 = new Player(input.nextLine());

        Game nim  = new Game(player1, player2);
        nim.setMaxPile();
        System.out.println("Welcome to the game!");
        System.out.println("Current pieces left: " + nim.getPiecesLeft());
    }

}
