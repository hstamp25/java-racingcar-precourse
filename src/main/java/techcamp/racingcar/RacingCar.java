package techcamp.racingcar;

public class RacingCar {

    public static final int DISTANCE_PER_FREQUENCY = 1;
    private int distance = 0;

    public void move(MoveStatus moveStatus) {
        if(moveStatus.isMove()) {
            distance += DISTANCE_PER_FREQUENCY;
        }
    }

    public int getTotalDistance() {
        return distance;
    }
}
