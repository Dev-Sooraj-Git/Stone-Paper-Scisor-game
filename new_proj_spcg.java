import java.util.Scanner;

public class new_proj_spcg {
    public static void main(String[] args) {
//build a stone paper scissors game
        int i = 1;
        while (i <= 5) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            switch (n) {
                case 0:
                    System.out.println("rock");
                    break;
                case 1:
                    System.out.println("paper");
                    break;
                case 2:
                    System.out.println("scissor");
                    break;
                default:
                    System.out.println("yoy have entered wrong option");
                    break;
            }

            int random = (int) (Math.random() * 100);
            System.out.println(random);

            if (random <= 33) {
                System.out.println("rock");
            } else if (random >= 34 && random <= 67) {
                System.out.println("paper");
            } else if (random > 67)
                System.out.println("scissor");
            i++;

                /* results match tie condition */

                /*
                       r -> Rock
                       p -> Paper
                       s -> Scissor
                 */

            if ((random <= 33 && n == 0) || ((random >= 34 && random <= 67) && n == 1) || (random >= 68 && n == 2)) {
                System.out.println("_____________MATCH TIE___________");
                System.out.println();
                System.out.println("------------------------------------X------------------------------");
                System.out.println();

                /* Who will win the match conditions */
                                // s r
            } else if (n == 2 && random <= 33) {
                System.out.println(" CONGRATULATIONS _____________ROCK WON THE MATCH_____________");
                System.out.println("-------COMPUTER WON THE MATCH------- ");
                System.out.println();
                System.out.println("------------------------------------X------------------------------");
                System.out.println();

                                // r p

            } else if (n == 0 && (random >= 34 && random <= 67)) {
                System.out.println(" CONGRATULATIONS _____________PAPER WON THE MATCH_____________");
                System.out.println("-------COMPUTER WON THE MATCH-------");
                System.out.println();
                System.out.println("------------------------------------X------------------------------");
                System.out.println();

                                // p s

            } else if (n == 1 && random >= 68) {
                System.out.println(" CONGRATULATIONS _____________SCISSOR WON THE MATCH__________");
                System.out.println("-------COMPUTER WON THE MATCH-------");
                System.out.println();
                System.out.println("------------------------------------X------------------------------");
                System.out.println();

                                 // s p

            } else if (n == 2 && (random >= 34 && random <= 67)) {
                System.out.println(" CONGRATULATIONS _____________SCISSORS WON THE MATCH_____________");
                System.out.println("----------USER WON THE MATCH----------");
                System.out.println();
                System.out.println("------------------------------------X------------------------------");
                System.out.println();

                                 // r s

            } else if (n == 0 && random >= 68) {
                System.out.println(" CONGRATULATIONS _____________ROCK WON THE MATCH_____________");
                System.out.println("----------USER WON THE MATCH----------");
                System.out.println();
                System.out.println("------------------------------------X------------------------------");
                System.out.println();

                                  // p r

            } else if (n == 1 && random <= 33) {
                System.out.println(" CONGRATULATIONS _____________PAPER WON THE MATCH__________");
                System.out.println("----------USER WON THE MATCH----------");
                System.out.println();
                System.out.println("------------------------------------X------------------------------");
                System.out.println();
            }
        }
    }
}