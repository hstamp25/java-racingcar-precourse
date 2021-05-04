package techcamp.racingcar;

public class RacingCar {

    public static final int DISTANCE_PER_FREQUENCY = 1;
    public static final String DISTANCE_TEXT = "-";
    private int distance = 0;
    private String name;

    public RacingCar(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(MoveStatus moveStatus) {
        if (moveStatus.isMove()) {
            distance += DISTANCE_PER_FREQUENCY;
        }
        printResult();
    }

    private void printResult() {
        System.out.print(name + ": ");
        for (int i = 0; i < distance; i++) {
            System.out.print(DISTANCE_TEXT);
        }
        System.out.println(" ");
    }

    public int getTotalDistance() {
        return distance;
    }
}
