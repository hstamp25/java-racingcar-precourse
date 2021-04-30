package techcamp.racingcar;

public enum MoveStatus {
    STOP, MOVE;

    public boolean isMove() {
        return this == MOVE;
    }
}
