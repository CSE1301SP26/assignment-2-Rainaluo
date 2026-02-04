import java.util.Scanner;

public class Nim {
public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial number of sticks: ");
        int sticks = scanner.nextInt();

        int round = 0;
        boolean humanTurn = true;

        while (sticks > 0) {

            System.out.print("Round " + round + ": " + sticks + " at start ");

            if (humanTurn) {
                System.out.print("human takes ");
                int take = scanner.nextInt();

                while (take < 1 || take > 2 || take > sticks) {
                    System.out.print("Take only 1 or 2 sticks ");
                    take = scanner.nextInt();
                }

                sticks = sticks-take;
                System.out.println(", so " + sticks + " remain");

                if (sticks == 0) {
                    System.out.println("You win!");
                    
                }

            } else {
                int take;
                if (sticks == 1) {
                    take = 1;
                } else {
                    take = (int)(Math.random() * 2) + 1;
                }

                System.out.print("computer takes " + take);
                sticks =sticks- take;
                System.out.println(", so " + sticks + " remain");

                if (sticks == 0) {
                    System.out.println("The computer wins / you lose!");
                    
                }
            }

            humanTurn = !humanTurn;
            round++;
        }
    }
}