# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

# STEP 2
# TODO : 문자열 덧셈 계산기 기능 목록
---
# DONE : 문자열 덧셈 계산기 완료된 기능 목록
* [X] 빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다.(예 : “” => 0, null => 0)
* [X] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.(예 : “1”)
* [X] 숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.(예 : “1,2”)
* [X] 구분자를 컴마(,) 이외에 콜론(:)을 사용할 수 있다. (예 : “1,2:3” => 6)
* [X] “//”와 “\n” 문자 사이에 커스텀 구분자를 지정할 수 있다. (예 : “//;\n1;2;3” => 6)
* [X] 음수를 전달할 경우 RuntimeException 예외가 발생해야 한다. (예 : “-1,2,3”)

# STEP 3
## TODO : 자동차 경주 기능 목록
---
## DONE : 완료된 기능 목록
* [X] 자동차 목록에 사용자가 입력한 숫자만큼 자동차를 생성한다.
* [X] random 값이 4 이상인 자동차만 전진한다.
* [X] 사용자가 입력한 시도 횟수 만큼 자동차의 전진을 결정한다.
  * [X] 매 시도마다, 실행 결과를 출력해야한다.

# STEP 4
## TODO : 자동차 경주 (우승자) 
STEP3의 연장선이기에 새롭게 추가하여 테스트 할 기능들만 기재했습니다.
---
## DONE : 완료된 기능 목록
* [X] 자동차 이름 부여하기
  * [X] TEST - 콤마를 기준으로 잘 Split하여 자동차 주인의 이름을 잘 저장하고 있는가?
  * [X] 자동차 이름 5글자 초과 방지
* [X] 실행 결과에 자동차 이름도 같이 출력하기
* [X] 최종 우승자 출력하기
  * [X] TEST1 - 최종 우승자가 1명인 경우
  * [X] TEST2 - 최종 우승자가 여러 명인 경우