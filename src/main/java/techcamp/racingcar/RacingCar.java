package techcamp.racingcar;

public class RacingCar {

    private int distance = 0;

    public int getDistance() {
        return distance;
    }

    public void move(MoveStatus moveStatus) {
        if(moveStatus == MoveStatus.MOVE) {
            distance += 1;
        }
    }
}
