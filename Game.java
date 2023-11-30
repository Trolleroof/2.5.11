import java.util.Scanner;

class Game{
    private Player currentPlayer;
    private Player player1;
    private Player player2;
    private int piecesLeft;
  
    public Game(Player p1, Player p2){
      player1 = p1;
      player2 = p2;
    }

    public void setMaxPile(){
      piecesLeft = (int) (Math.random() * 41 + 10);
    }
    public void removePieces(){
      Scanner input = new Scanner(System.in);
      System.out.println("How many pieces do you want to take out?");
      int piecesRemove = input.nextInt();
      while(piecesRemove > piecesLeft / 2){
        System.out.println("You picked too many pieces! How many pieces you want to remove?");
        piecesRemove = input.nextInt();
      }
      piecesLeft -= piecesRemove;
    }

    public int getPiecesLeft() {
      return piecesLeft;
    }

  }