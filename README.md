# Running-TDD
테스트 주도 개발 튜토리얼 따라가기

## C8-객체 만들기
두 times() 구현 코드가 거의 똑같음.<br>
<br>
Dollar와 Franc의 두 times()가 Money를 반환하게 만들면 더 비슷해짐!!<br>
근데 그러고 나니 Dollar와 Franc가 하는게 없어.. 지워버리고 싶어. 그래도 차근차근 하자 ^~^;;<br>
그러니까 **두 하위클래스에 대한 직접적인 참조를 줄여나가서 지울 명분을 만들자**

### 따라서
Money에 Dollar와 Franc 각각을 반환하는 팩토리 메서드(Factory Method)를 도입하자.<br>
-> 이제 그 어느곳에서도 하위 클래스인 Dollar와 Franc의 존재를 알지 못함. 하위 클래스의 존재를 테스트에서 분리(decoupling)함으로써 어떤 모델 코드에도 영향을 주지 않고 상속 구조를 마음대로 변경할 수 있게 됨<br>
<br>
**자, 이제 testFrancMultiplication을 지워야할까?**

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
- testFrancMultiplication을 지워야 할까?
