import java.util.Random;

public class Computer extends Player {

    public Computer(String name) {
        super("Computer");
    }

    private void computerMove(int pileSize) {
       
    
        System.out.println("Computer's move:");
        System.out.println(name+ "removed " + sticks + " sticks.");
    }

}
