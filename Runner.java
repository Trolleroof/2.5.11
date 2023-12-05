import java.util.Scanner;
public class Runner {   
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        System.out.println("Enter Player 1 Name: ");
        player1.setName(input.nextLine());
        System.out.println("Enter Player 2 Name: ");
        player2.setName(input.nextLine());

        Game nim  = new Game(player1, player2);
        nim.setMaxPile();
        System.out.println("Welcome to the game!");
        System.out.println("Current pieces left: " + nim.getPiecesLeft());

        while (nim.getGameStatus() == false) {
            nim.removePieces();
        }

        System.out.println("The winner is: " + nim.getWinner());
    }

}