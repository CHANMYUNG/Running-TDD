# Running-TDD
테스트 주도 개발 튜토리얼 따라가기

## C14-바꾸기
2프랑을 달러로 바꾸고 싶음.

### 작업 내용
- Expression.reduce()에 Bank 인자를 추가함
- Bank에서 환율 (rates)를 관리하도록 함 (물론 설정도)
- Pair을 만들어야 할지 알아보기 위해 testArrayEquals를 작성해 보았다.

### 작업 리스트
- $5 + 10CHF = $10(환율이 2:1일 경우)
- ~~$5 + $5 = $10~~
- $5 + $5에서 Money 반환하기
- ~~Bank.reduce(Money)~~
- ~~Money에 대한 통화 변환을 수행하는 Reduce~~
- ~~Reduce(Bank, String)~~
