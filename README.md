# Running-TDD
테스트 주도 개발 튜토리얼 따라가기

## C13-진짜로 만들기
Money.plus는 사실 Money가 아니라 Expression의 일종인 Sum을 반환해야 함<br>

### 작업 내용
- 앞으로 필요할 것으로 예상되는 객체 Sum의 생성을 강요하기 위한 테스트 작성
- Bank.reduce에서 캐스팅을 이용해 구현했다가, 테스트가 돌아가자 리팩토링하면서 적당한 자리로 옮김
- 캐스팅을 없애기 위해 Expression에 reduce()라는 메소드를 추가. (다형성 사용)


### 작업 리스트
- $5 + 10CHF = $10(환율이 2:1일 경우)
- $5 + $5 = $10
- $5 + $5에서 Money 반환하기
- ~~Bank.reduce(Money)~~
- Money에 대한 통화 변환을 수행하는 Reduce
- Reduce(Bank, String)
