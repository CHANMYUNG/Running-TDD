# Running-TDD
테스트 주도 개발 튜토리얼 따라가기

## C10-흥미로운 시간
Dollar와 Franc의 times를 통일 시킬 방법이 없다. 서로 각각 times() 내부에서 `Money.dollar()`와 `Money.franc()`를 호출하기 때문에 명백하게 통일시킬 방법은 떠오르지 않는다.<br>
**때로는 전진하기 위해 후진할 때가 필요한 법, 팩토리 메서드를 인라인시키자. 아쉬워도 어쩔 수 없다.**<br>

### 작업 내용
toString()을 override해도 둘의 Money 클래스의 equals() 메서드 내에서 클래스를 비교하는 로직 때문에 Franc 10CHF와 Money 10CHF가 다르다고 판단된다.<br> 
-> 따라서 class 대신 currency를 비교하도록 한다. (실제로 중요한 것은 같은 클래스인지가 아니라 통화 단위가 같은가 이기 때문)<br>
Dollar와 Franc의 times()에서 Money 객체를 만들어 반환하도록 하니 코드가 공통된다. 따라서 상위 클래스 Money의 times()로 빼낸다.<br>

### 결국
전진을 위해 후진했다. Money 클래스를 다시 콘크리트 클래스로 바꾸고, 하위 클래스의 공통된 times() 구현을 상위 클래스인 Money로 올렸다.<br>

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
- ~~공용 times()~~
- ~~Franc과 Dollar 비교하기~~
- ~~통화?~~
- testFrancMultiplication 제거
