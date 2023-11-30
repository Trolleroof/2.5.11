import java.util.Scanner;

class Game{
    private Player currentPlayer;
    private Player player1;
    private Player player2;
    private int piecesLeft;
    private Boolean gameOver = false;
    private Player winner;
  
    public Game(Player p1, Player p2){
      player1 = p1;
      player2 = p2;
      currentPlayer = p1;
    }

    public void setMaxPile(){
      piecesLeft = (int) (Math.random() * 41 + 10);
    }
    public void removePieces(){
      Scanner input = new Scanner(System.in);
      System.out.println("Current Player: " + currentPlayer.getName());
      System.out.println("How many pieces do you want to take out?");
      int piecesRemove = input.nextInt();
      while ((piecesRemove > piecesLeft / 2 && piecesLeft > 1) || piecesRemove < 1){
        if (piecesRemove > piecesLeft /2) {
          System.out.println("You picked too many pieces! How many pieces do you want to remove?");
          piecesRemove = input.nextInt();
        } else if (piecesRemove < 1) {
          System.out.println("You must pick 1 or more pieces.  How many pieces do you want to remove?");
          piecesRemove = input.nextInt();
        }
        
      }
      piecesLeft -= piecesRemove;
      System.out.println("There are " + piecesLeft + " pieces left.");

      
      if (currentPlayer == player1) {
        currentPlayer = player2;
      } else {
        currentPlayer = player1;
      }

      if (piecesLeft == 0) {
        setWinner(currentPlayer);
        return;
      }
    }

    public int getPiecesLeft() {
      return piecesLeft;
    }

    public Boolean getGameStatus() {
      return gameOver;
    }

    private void setWinner(Player playa) {
      winner = playa;
      gameOver = true;
    }

    public String getWinner() {
      return winner.getName();
    }


  }