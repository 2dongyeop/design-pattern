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

3장 : [데코레이터 패턴](https://leedongyeop.notion.site/Chapter-03-793001430c8e489794f0e58fe83a23c9)
- 데코레이터 패턴 : 객체에 추가 요소를 동적으로 더할 수 있다. 
    - 데코레이터를 사용시 서브클래스를 만들 때보다 훨씬 유연하게 기능을 확장할 수 있다.
- 새롭게 추가된 객체지향 원칙
    - OCP (Open-Closed Principle) :  클래스는 확장에는 열려 있어야 하지만, 변경에는 닫혀 있어야 한다.
- **핵심 정리**
    - 디자인의 유연성 면에서 보면 상속으로 확장하는 일은 별로 좋은 선택이 아니다.
    - 데코레이터 클래스의 형식은 그 클래스가 감싸는 클래스 형식을 반영한다.
    - 구성 요소의 클라이언트는 데코레이터의 존재를 알 수 없다.
    - 데코레이터 패턴을 사용하면 자잘한 객체가 매우 많이 추가될 수 있고, 데코레이터를 너무 많이 사용하면 코드가 필요 이상으로 복잡해진다.

4장 : [팩토리 패턴](https://leedongyeop.notion.site/Chapter-04-3cb41b14ba6d410b93498ae680d8f39d)
- 추상 팩토리 패턴 
    - 구상 클래스에 의존하지 않고도 서로 연관되거나 의존적인 객체로 이루어진 제품군을 생성하는 인터페이스를 제공한다. 
    - 구상 클래스는 서브 클래스에서 만든다.
- 팩토리 메소드 패턴
    - 객체를 생성할 때 필요한 인터페이스를 만든다.
    - 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정합니다.
    - 팩토리 메소드를 사용하면 인스턴스 만드는 일을 서브클래스에 맡길 수 있다.
- 새롭게 추가된 객체지향 원칙
    - 추상화된 것에 의존하게 만들고 구상 클래스에 의존하지 않게 만든다.
- 핵심 정리
    - 팩토리를 쓰면 객체 생성을 캡슐화할 수 있다.
    - 간단한 팩토리는 엄밀하게 말해 디자인 패턴은 아니지만, 클라이언트와 구상 클래스를 분리하는 간단한 기법이다.
    - 모든 팩토리 패턴은 애플리케이션의 구상 클래스 의존성을 줄여줌으로써 느슨한 결합을 도와준다.
    - 의존성 뒤집기 원칙을 따르면 구상 형식 의존을 피하고 추상화를 지향할 수 있다.