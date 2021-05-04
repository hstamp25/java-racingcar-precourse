package techcamp.racingcar;

import java.util.Scanner;

public class RacingGame {

    private static final String REGEXP = "^[1-9]+$";

    private RacingCars racingCars = new RacingCars();

    public void start() {
        Scanner scanner = new Scanner(System.in);
        inputCarName(scanner);
        inputCycle(scanner);
        finalResult();
    }

    private void finalResult() {
        racingCars.getFinalResult();
    }

    private void inputCarName(Scanner scanner) {
        String input;
        try{
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            input = scanner.nextLine();
            setRacingCarsName(input);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            this.inputCarName(scanner);
        }
    }

    private void setRacingCarsName(String inputValue) {
        RacingCar racingCar;
        String[] inputs = inputValue.split(",",-1);
        for (String input : inputs) {
            racingCar = new RacingCar(input.trim());
            racingCars.add(racingCar);
        }
    }

    public void inputCycle(Scanner scanner) {
        String input;
        try {
            System.out.println("시도할 회수는 몇회인가요?");
            input = scanner.nextLine();
            setRacingCarsCycle(input);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            this.inputCycle(scanner);
        }
    }

    private void setRacingCarsCycle(String input) {
        if (!input.matches(REGEXP)) {
            throw new IllegalArgumentException("숫자만 가능합니다.");
        }
        racingCars.moves(Integer.parseInt(input));
    }
}
