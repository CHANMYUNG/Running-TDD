# Running-TDD
테스트 주도 개발 튜토리얼 따라가기

## C3-모두를 위한 평등
### 삼각 측량 전략
방향이 다른 또 다른 테스트를 추가해보는것<br>
Dollar 클래스의 equals 메소드가 무조건 true만 반환하도록 구현한 후 테스트할 땐 $5 == $5임<br>
하지만 두 번째 테스트 $5 == $6를 통과하려면 equals를 일반화할 필요가 있음

### 작업 리스트
- $5 + 10CHF = $10(환율이 2:1일 경우)
- ~~$5 X 2 = $10~~
- amount를 private으로 만들기
- ~~Dollar 부작용?~~
- Money 반올림?
- ~~equals()~~
- hashCode()
- Equal null
- Equal object