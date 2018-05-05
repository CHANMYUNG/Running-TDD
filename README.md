# Running-TDD
테스트 주도 개발 튜토리얼 따라가기

## C7-사과와 오렌지
### "You can't compare apples and oranges."
서로 다른걸 비교할 수 없다.

### 하지만
현재는 testEquality 테스트에 5$ != 5CHF 예제를 추가하면 통과하지 못한다. 둘이 같다고 판정되기 때문

### 작업 내용
Money 클래스의 equals()에서 객체의 class를 비교하는 로직을 추가. (~~마음에 들진 않지만 아직은 통화(currency) 개념이 없으니..~~)<br>
작업 리스트에 `통화?` 추가

### 작업 리스트
- $5 + 10CHF = $10(환율이 2:1일 경우)
- ~~$5 X 2 = $10~~
- ~~amount를 private으로 만들기~~
- ~~Dollar 부작용?~~
- Money 반올림?
- ~~equals()~~
- hashCode()
- Equal null
- Equal object
- ~~5CHF X 2 = 10CHF~~
- Dollar/Franc 중복
- ~~공용 equals()~~
- 공용 times()
- ~~Franc과 Dollar 비교하기~~
- 통화?
