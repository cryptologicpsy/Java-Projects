import java.util.Scanner;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        char input;

        int a, b, c;
        Game game;
        int coins = 100;
        do {
            System.out.print("Πατήστε 'k' για να ελέγξετε το Jackpot: ");
            try {
                input = scanner.next().charAt(0);
            } catch (Exception e) {
                System.out.println("Λάθος είσοδος. Παρακαλώ πληκτρολογήστε ξανά.");
                scanner.next(); // Διαβάζει και απορρίπτει την μη έγκυρη είσοδο για να μην προκαλέσει ατέρμονα βρόχο
                continue;
            }

            if (input == 'k' && coins>0) {
                a = r.nextInt(3);
                b = r.nextInt(3);
                c = r.nextInt(3);


                game = new Game(a, b, c);
                System.out.println("coins: " + coins);
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                System.out.println("c: " + c);
                game.checkJackpot();
                if(a==b && b==c){
                    coins = coins+5;
                }
                else{
                coins--;}

            } else {
                System.out.println("Λάθος είσοδος. Παρακαλώ πληκτρολογήστε ξανά.");
            }

        } while (true);

        // Δεν χρειάζεται να κλείσετε το scanner σε αυτήν την περίπτωση
    }
}
