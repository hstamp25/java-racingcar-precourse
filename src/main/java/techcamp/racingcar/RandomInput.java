package techcamp.racingcar;

import java.util.Random;

public class RandomInput {

    private static final int MOVE_REFERENCE = 4;
    private static final int MOVE_MAX = 9;
    private static final int MOVE_MIN = 0;

    private MoveStatus moveStatus;
    private int randomInt;

    Random random = new Random();

    public RandomInput() {
        randomInt = random.nextInt(MOVE_MAX) + MOVE_MIN;
        if (randomInt >= MOVE_REFERENCE) {
            moveStatus = MoveStatus.MOVE;
        }
        if (randomInt < MOVE_REFERENCE) {
            moveStatus = MoveStatus.STOP;
        }
    }

    public MoveStatus getMoveStatus() {
        return moveStatus;
    }
}
