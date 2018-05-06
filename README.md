# Running-TDD
테스트 주도 개발 튜토리얼 따라가기

## C15-서로 다른 통화 더하기
이제 $5 + 10CHF를 해보자.<br>


### 작업 내용
- 좀 더 추상적인 선언을 통해 가지에서 뿌리 (Money -> Expression)로 일반화했다.
- 변경 후(Expression fiveBucks), 그 영향을 받은 다른 부분들을 변경하기 위해 컴파일러의 지시를 따랐다. (Expression에 plus()를 추가하기 등등) 

### 작업 리스트
- $5 + 10CHF = $10(환율이 2:1일 경우)
- ~~$5 + $5 = $10~~
- $5 + $5에서 Money 반환하기
- ~~Bank.reduce(Money)~~
- ~~Money에 대한 통화 변환을 수행하는 Reduce~~
- ~~Reduce(Bank, String)~~
