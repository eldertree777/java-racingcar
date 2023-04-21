package study.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.racingcar.domain.Car;
import study.racingcar.domain.GameWinner;
import study.racingcar.dto.CarDto;
import study.racingcar.strategy.CarMoveStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class GameWinnerTest {

    private CarMoveStrategy carMoveStrategy;

    @BeforeEach
    void setUp() {
        carMoveStrategy = new CarMoveStrategy(new Random());
    }

    @DisplayName("자동차 경주 중 최고 거리의 위치를 반환한다.")
    @Test
    public void gameWinner_getMaxPosition() {

        List<CarDto> carList = new ArrayList<>();

        Car car1 = new Car(3, "pobbi", carMoveStrategy);
        Car car2 = new Car(5, "crong", carMoveStrategy);
        Car car3 = new Car(4, "honux", carMoveStrategy);

        carList.add(car1.getCarDto());
        carList.add(car2.getCarDto());
        carList.add(car3.getCarDto());

        GameWinner gameWinner = new GameWinner(carList);

        assertThat(gameWinner.getMaxPosition(carList)).isEqualTo(5);

    }

    @DisplayName("동일한 최고 거리가 1명이면 우승자는 1명이다.")
    @Test
    public void gameWinner_findGameWinner_우승자1명() {

        List<CarDto> carList = new ArrayList<>();

        Car car1 = new Car(3, "pobbi", carMoveStrategy);
        Car car2 = new Car(5, "crong", carMoveStrategy);
        Car car3 = new Car(8, "honux", carMoveStrategy);

        carList.add(car1.getCarDto());
        carList.add(car2.getCarDto());
        carList.add(car3.getCarDto());

        GameWinner gameWinner = new GameWinner(carList);

        assertThat(gameWinner.findGameWinner()).hasSize(1);

    }

    @DisplayName("동일한 최고 거리가 2명이면 우승자는 2명이다.")
    @Test
    public void gameWinner_findGameWinner_우승자2명() {

        List<CarDto> carList = new ArrayList<>();

        Car car1 = new Car(3, "pobbi", carMoveStrategy);
        Car car2 = new Car(5, "crong", carMoveStrategy);
        Car car3 = new Car(5, "honux", carMoveStrategy);

        carList.add(car1.getCarDto());
        carList.add(car2.getCarDto());
        carList.add(car3.getCarDto());

        GameWinner gameWinner = new GameWinner(carList);

        assertThat(gameWinner.findGameWinner()).hasSize(2);

    }
}