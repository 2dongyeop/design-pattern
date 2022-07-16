# design-pattern
디자인 패턴 세미나를 진행하며 공부한 내용들을 기록합니다.

----

### 챕터별 내용 정리
1장 : [디자인 패턴 소개와 전략 패턴](https://leedongyeop.notion.site/Chapter-01-fa26caeaa0614910a3dacf1e02c75aec)
- **전략 패턴이란?** 
    - **알고리즘군을 정의하고 캡슐화함으로써 각각의 알고리즘군을 수정해서 사용하도록 한다.**
- 객체지향의 기초 지식을 필요로 합니다.
    - `추상화`, `상속`, `다형성`, `캡슐화`
- 객체지향의 원칙에 대해 설명합니다.
    - 바뀌는 부분은 캡슐화한다.
    - 상속보다는 구성을 활용한다.
    - 구현보다는 인터페이스에 맞춰서 프로그래밍한다.
- 핵심 정리
    - 패턴은 코드를 바로 제공하는 것이 아니라, **디자인 문제의 보편적인 해법을 제공**한다.
    - 대부분의 패턴은 시스템의 일부분을 나머지 부분과 무관하게 변경하는 방법을 제공한다.
    - 패턴은 다른 개발자와의 의사소통을 극대화하는 전문 용어 역할을 한다.

2장 : [옵저버 패턴](https://leedongyeop.notion.site/Chapter-02-3d99b96d8d034fbcaf892915b162d01e)
    
- **옵저버 패턴이란?**
    - **한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고, 자동으로 내용이 갱신되는 방식으로 `일대다` 의존성을 정의한다.**
- 느슨할 결합(Loose Coupling)이란?
    - 객체들이 상호작용을 하지만, 서로에 대해 잘 모르는 관계이다.
    - `유연성`을 높이는 장점이 있다.
- 새롭게 추가된 객체지향의 원칙
    - 상호작용하는 객체 사이에서는 가능하면 느슨한 결합을 사용한다.
- 핵심 정리
    - 옵저버 패턴을 사용하면 주제가 데이터를 보내거나(`Push` 방식), 옵저버가 데이터를 가져올(`Pull` 방식) 수 있다. 일반적으로 풀 방식이 더 ‘옳은' 방식이라고 간주한다.
    - 옵저버 패턴은 여러 개의 주제와 메시지 유형이 있는 복잡한 상황에서 사용하는 출판-구독 패턴과 친척이다.