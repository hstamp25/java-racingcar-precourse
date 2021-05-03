package techcamp.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarTest {

    private RacingCar racingCar;
    private RandomInput randomInput;

    @BeforeEach
    void setUp() {
        racingCar = new RacingCar();
    }

    @DisplayName("레이싱카_랜덤기능")
    @Test
    void racingCar_random_move() {
        randomInput = new RandomInput();
        racingCar.move(randomInput.getMoveStatus());

        assertTrue(racingCar.getTotalDistance() == 0 || racingCar.getTotalDistance() == 1);
    }

    @DisplayName("레이싱카_정지")
    @Test
    void racingCar_stop() {
        racingCar.move(MoveStatus.STOP);
        assertEquals(0, racingCar.getTotalDistance());

        racingCar.move(MoveStatus.STOP);
        assertEquals(0, racingCar.getTotalDistance());

        racingCar.move(MoveStatus.STOP);
        assertEquals(0, racingCar.getTotalDistance());
    }

    @DisplayName("레이싱카_전진")
    @Test
    void racingCar_move() {
        racingCar.move(MoveStatus.MOVE);
        assertEquals(1, racingCar.getTotalDistance());

        racingCar.move(MoveStatus.MOVE);
        assertEquals(2, racingCar.getTotalDistance());

        racingCar.move(MoveStatus.MOVE);
        assertEquals(3, racingCar.getTotalDistance());
    }
}