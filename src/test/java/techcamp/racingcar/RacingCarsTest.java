package techcamp.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarsTest {

    @DisplayName("레이싱카들_게임시작")
    @Test
    void name() {
        RacingCars racingCars = new RacingCars();

        RacingCar racingCar_1 = new RacingCar("레이싱카1");
        racingCars.add(racingCar_1);
        RacingCar racingCar_2 = new RacingCar("레이싱카2");
        racingCars.add(racingCar_2);
        RacingCar racingCar_3 = new RacingCar("레이싱카3");
        racingCars.add(racingCar_3);

        racingCars.moves(2);
    }
}
