package techcamp.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarTest {

    private RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar();
    }

    @Test
    void 전진조건_중지() {
        racingCar.move(MoveStatus.STOP);
        assertEquals(0, racingCar.getDistance());
    }

    @Test
    void 전진조건_전진() {
        racingCar.move(MoveStatus.MOVE);
        assertEquals(1, racingCar.getDistance());
    }
}