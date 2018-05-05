# Running-TDD
테스트 주도 개발 튜토리얼 따라가기

## C4-프라이버시
### 지금까지 배운것
- 오직 테스트를 향상시키기 위해서만 개발된 기능을 사용
- 두 테스트가 동시에 실패하면 망한다는 점을 인식
- 위험 요소가 있음에도 계속 진행
- 테스트와 코드 사이의 결합도를 낮추기 위해, 테스트하는 객체의 새기능 사용

결론: 테스트하는 객체의 변경점을 테스트에 반영하라.<br>
> Dollar 객체의 amount를 사용하는 곳은 Dollar 클래스의 내부 뿐이므로 amount를 private으로 바꿀 수 있다.<br>
> 따라서 이전에 만들어 놓은 testMultiplication 테스트 또한 변화된 내용에 대응해 amount 필드로 직접 비교하는 대신 override한 equals()를 이용

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