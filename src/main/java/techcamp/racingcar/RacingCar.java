package techcamp.racingcar;

public class RacingCar {

    public static final int DISTANCE_PER_FREQUENCY = 1;
    private int distance = 0;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }
        this.name = name;
    }

    public void move(MoveStatus moveStatus) {
        if(moveStatus.isMove()) {
            distance += DISTANCE_PER_FREQUENCY;
        }
    }

    public int getTotalDistance() {
        return distance;
    }
}
