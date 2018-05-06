# Running-TDD
테스트 주도 개발 튜토리얼 따라가기

## C11-모든 악의 근원
드디어 Dollar와 Franc를 삭제할 때가 왔다.<br>
Money의 dollar()와 franc()에서 Money 객체를 반환하도록 수정하면 Dollar와 Franc 클래스를 사용하는 곳은 테스트 뿐이다.<br>
testDifferentClassEquality에서 하는 동치성 검사는 testEquality가 대신할 수 있다. 필요없는 assertion을 줄이며, Dollar와 Franc을 Money로 통합시킬 것이므로 곱하기에 대한 테스트도 Dollar(Dollar 클래스가 아닌 currency가 "USD"인 Money 객체)에 대해서만 수행하면 된다. 따라서 testFrancMultiplication을 삭제해도 된다.<br>
그럼 진짜로 **Dollar와 Franc은 필요가 없어진다.**<br>
**지우자**<br>


### 작업 내용
하위 클래스의 속을 들어내는 걸 완료하고, 하위 클래스를 삭제했다.<br>
기존의 소스 구조에서는 필요했지만 새로운 구조에서는 필요 없게 된 테스트를 제거했다.<br>

### 결국
Dollar와 Franc을 삭제하고 Money가 이 둘을 대체하도록 하는데 성공했다.

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
- ~~Dollar/Franc 중복~~
- ~~공용 equals()~~
- ~~공용 times()~~
- ~~Franc과 Dollar 비교하기~~
- ~~통화?~~
- testFrancMultiplication 제거
