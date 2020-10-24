import java.util.Random;

public class StartGame {

    public static final int START_POSITION = 0;

    public static void main(String[] args) {

        int playerPosition = START_POSITION;
        Random random = new Random();
        int dieRoll = random.nextInt(6) + 1;

    }

}
