import java.util.Random;

public class StartGame {

    public static final int START_POSITION = 0;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;

    public static void main(String[] args) {

        int playerPosition = START_POSITION, dieRoll, options;
        Random random = new Random();
        dieRoll = random.nextInt(6) + 1;
        options = random.nextInt(3) + 1;

        if (options == LADDER) {

            playerPosition += dieRoll;
            System.out.println("Player landed on a ladder");

        } else if (options == SNAKE){

            playerPosition -= dieRoll;
            System.out.println("Player landed on a snake");

        }

    }

}
