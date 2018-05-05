# Running-TDD
테스트 주도 개발 튜토리얼 따라가기

## C9-우리가 사는 시간
### 통화를 도입할거야
통화 개념을 어떻게 테스트할까?<br>
통화를 표현하기 위한 복잡한 객체들을 원할 수도 있겠다. 그리고 그 객체들이 필요한 만큼만 만들어지도록 하기 위해 경량 팩토리(flyweight factories)를 사용할 수도 있겠지만, 당분간은 문자열을 쓰자.<br>

### 따라서
다른 부분들을 호출자(팩토리 메서드)로 옮김으로써 두 생성자를 일치시킴<br>
times()가 팩토리 메서드를 사용하도록 만들기 위해 리팩토링 잠시 중단<br>
비슷한 리팩토링(Franc에 했던 일을 Dollar에도 적용)을 한 번의 큰 단계로 처리<br>
동일한 생성자들을 상위 클래스로 올림<br>
<br>
결국 times() 통일은 못시켰다.

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
- ~~통화?~~
- testFrancMultiplication 제거
