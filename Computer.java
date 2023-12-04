import java.util.Scanner;

public class Computer {
    public int getComputerMove(int left) {
        if (left == 2){
            return 1;
        }
        else if (left % 3 == 0) {
            return (int) (Math.random() * 2) + 1;
        } else {
            return left % 3;
        }
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sticks to start.");
        int left = sc.nextInt();

        while (left > 0) {
            int computerMove = getComputerMove(left);
            System.out.println("Computer takes " + computerMove);
            left -= computerMove;
            System.out.println("Now there are " + left + " sticks left.");

            if (left <= 0) {
                System.out.println("You win!");
                return;
            }

            System.out.println("What's your move? (1 or 2)");
            int person = sc.nextInt();

            while (person != 1 && person != 2) {
                System.out.println(person + " not allowed, choose 1 or 2.");
                person = sc.nextInt();
            }

            left -= person;
            System.out.println("Now there are " + left + " sticks left.");

            if (left <= 0) {
                System.out.println("Computer wins!");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Computer nimGame = new Computer();
        nimGame.play();
    }
}
