public class Game {

    int a, b, c;

    public Game(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void checkJackpot() {
        if (a == b && b == c) {
            System.out.println("Jackpot!");
        } else {
            System.out.println("No Jackpot. Try again!");
        }
    }
}
