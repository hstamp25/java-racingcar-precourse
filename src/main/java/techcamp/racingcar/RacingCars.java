package techcamp.racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

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

    public void getFinalResult() {
        List<RacingCar> racingCarList = racingCars
                .stream()
                .collect(Collectors.groupingBy(RacingCar::getTotalDistance, TreeMap::new, Collectors.toList()))
                .lastEntry()
                .getValue();

        String result = racingCarList.stream().map(RacingCar::getName).collect(Collectors.joining(", "))
                + "가 최종 우승했습니다.";
        System.out.println(result);
    }
}
