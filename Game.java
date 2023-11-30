import java.util.Scanner;

class Game{
    Player currentPlayer;
    int piecesLeft;
  
    Game(Player p){
      currentPlayer = p;
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
  }