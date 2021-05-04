package techcamp.racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    List<RacingCar> racingCars = new ArrayList<>();

    public void add(RacingCar car) {
        racingCars.add(car);
    }

    public void moves(int times) {
        for (int i = 0; i < times; i++) {
            move();
            System.out.println(" ");
        }
    }

    private void move() {
        RandomInput randomInput = new RandomInput();
        racingCars.forEach(car -> car.move(randomInput.getMoveStatus()));
    }
}
