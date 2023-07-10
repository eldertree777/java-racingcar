package racing.view;

import org.junit.jupiter.api.Test;
import racing.model.CarVO;
import racing.model.SimulationResultDto;
import racing.model.RoundResultDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class RacingViewTest {
    @Test
    void getAskingCarNameViewTest() {
        //given
        RacingView racingView = RacingView.getInstance();
        String text = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";

        //when,then
        assertThat(racingView.getAskingCarNameView()).isEqualTo(text);
    }

    @Test
    void getAskingCountViewTest() {
        RacingView racingView = RacingView.getInstance();
        String text = "시도할 회수는 몇회인가요?";

        assertThat(racingView.getAskingCountView()).isEqualTo(text);
    }

    @Test
    void getCarStatusViewTest() {
        //given
        RacingView racingView = RacingView.getInstance();

        List<CarVO> cars = new ArrayList<>();
        cars.add(new CarVO("pobi", 1));
        cars.add(new CarVO("crong", 1));
        cars.add(new CarVO("honux", 1));


        //when, then
        assertThat(racingView.getCarStatusView(new RoundResultDto(cars))).isEqualTo("pobi : -\n" +
                "crong : -\n" +
                "honux : -");
    }

    @Test
    void getResultViewTest() {
        //given
        RacingView racingView = RacingView.getInstance();
        SimulationResultDto simulationResultDto = new SimulationResultDto(
                Arrays.asList(
                        Arrays.asList(new CarVO("test1", 1), new CarVO("test2", 1)),
                        Arrays.asList(new CarVO("test1", 2), new CarVO("test2", 2))
                ),
                Arrays.asList(new CarVO("test1", 2), new CarVO("test2", 2)));

        //when, then
        assertThat(racingView.getResultView(simulationResultDto)).isEqualTo("실행 결과\n" +
                "test1 : -\n" +
                "test2 : -\n" +
                "\n" +
                "test1 : --\n" +
                "test2 : --\n" +
                "\n" +
                "test1, test2가 최종 우승했습니다.");
    }
}