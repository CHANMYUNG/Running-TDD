# Running-TDD
테스트 주도 개발 튜토리얼 따라가기

## C6-돌아온 '모두를 위한 평등'
저질러둔 죄악 '복붙'을 청소할 차례<br>
방법은 두 가지<br>
1. 한 화폐가 다른 화폐를 상속받도록 함 (`Franc -> Dollar` or `Dollar -> Franc`)
2. 두 클래스의 공통된 상위 클래스를 작성해 상송 (`Dollar -> Money` and `Franc -> Money`)

### 작업 내용
2번 방법을 선택하고, Money 클래스를 만들어 공통된 필드 멤버인 amount를 상위 클래스 Money로 뺌<br>
Money 클래스에서 equals()를 override하고, Dollar와 Franc 클래스에서 equals()를 삭제<br>
testEquality 테스트에 Franc끼리 비교하는 에제 추가

### 헉, 근데 Franc과 Dollar를 비교하면?... 7장에서 계속...

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
- Franc과 Dollar 비교하기
