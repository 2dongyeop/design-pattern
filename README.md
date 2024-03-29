# design-pattern
디자인 패턴 세미나를 진행하며 공부한 내용들을 기록합니다.

----

> 디자인 패턴을 적용해 콘솔을 통해 입출력을 하는 [간단한 프로젝트](https://github.com/2dongyeop/cafe-ordering-system)입니다.

<br/>

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

<br/>

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

<br/>

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

<br/>

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

<br/>

5장 : [싱글턴 패턴](https://leedongyeop.notion.site/Chapter-05-0dd468e4ed2f4011836fe29ccb7b184a)
- 싱글턴 패턴
    - 클래스 인스턴스를 하나만 만들고, 그 인스턴스로의 전역 접근을 제공합니다.
- 핵심 정리
    - 자바에서 싱글턴 패턴을 구현할 때는 private 생성자와 정적 메소드, 정적 변수를 사용한다.
    - 멀티 스레드를 사용하는 애플리케이션에서는 속도와 자원 문제를 파악해 보고 적절한 구현법을 사용한다.
    - DCL을 써서 구현하면 자바 5 이전에 나온 버전에서는 스레드 관련 문제가 생길 수 있다.
    - 자바의 enum을 사용하면 간단하게 싱글턴을 구현할 수 있다.

<br/>

6장 : [커맨드 패턴](https://leedongyeop.notion.site/Chapter-06-e6f5fd86f6054f689a13ddb55d0ce522)
- 커맨드 패턴
    - 커맨드 패턴 : 요청 내역을 객체로 캡슐화해서 객체를 서로 다른 요청 내역에 따라 매개변수화한다.
    - 이러면 요청을 큐에 저장하거나 로그로 기록하거나 작업 취소 기능을 사용할 수 있다.
- 핵심 정리
    - 커맨드 패턴을 사용해 분리하는 과정의 중심에는 커맨드 객체가 있고, 이 객체가 행동이 들어있는 리시버를 캡슐화한다.
    - 인보커는 무언가 요청할 때 커맨드 객체의 execute() 메소드를 호출하고, 이 메소드는 리시버에 있는 행동을 호출한다.
    - 매크로 커맨드는 커맨드를 확장해 여러 개의 커맨드를 한 번에 호출할 수 있는 간편한 방법이다.
    - 커맨드 패턴을 활용해 로그 및 트랜잭션 시스템을 구현할 수 있다.

<br/>

7장 : [어댑터 패턴과 퍼사드 패턴](https://leedongyeop.notion.site/Chapter-07-835332b470df49158223c87980f90081)
- 새롭게 추가된 객체지향 원칙
    - 진짜 절친에게만 이야기 한다.
- 어댑터 패턴
    - 특정 클래스 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 변환한다.
- 퍼사드 패턴
    - 서브시스템에 있는 일련의 인터페이스를 통합 인터페이스로 묶어 준다.
- 핵심 정리
    - 퍼사드 패턴에서는 서브시스템으로 퍼사드를 만들고 진짜 작업은 서브클래스에 맡긴다.
    - 어댑터 패턴에는 객체 어댑터 패턴과 클래스 어댑터 패턴이 있다.
    - 어댑터는 객체를 감싸서 인터페이스를 바꾸는 용도로,
    데코레이터는 객체를 감싸서 새로운 행동을 추가하는 용도로,
    퍼사드는 일련의 객체를 감싸서 단순하게 만드는 용도로 쓰인다.

<br/>

8장 : [템플릿 메소드 패턴](https://leedongyeop.notion.site/Chapter-08-0a618a30e6024115bbecfda069c82ab6)
- 객체지향 원칙
    - 먼저 연락하지 마세요. 저희가 연락 드리겠습니다.
- 객체지향 패턴
    - 템플릿 메소드 패턴 : 알고리즘의 골격을 정의한다.
        - 템플릿 메소드를 사용해 알고리즘의 일부 단계를 서브클래스에서 구현하도록 한다.
- 핵심 정리
    - 후크는 추상 클래스에 들어있는 메소드로 아무 일도 하지 않거나 기본 행동만을 정의한다.
    - 할리우드 원칙에 의하면, 저수준 모듈을 언제 어떻게 호출할지는 고수준 모듈에서 결정하는 것이 좋다.
    - 전략 패턴과 템플릿 메소드 패턴은 모두 알고리즘을 캡슐화하는 패턴이지만 
    전략 패턴은 상속을, 템플릿 메소드 패턴은 구성을 사용합니다.
    - 팩토리 메소드 패턴은 특화된 템 플릿 메소드 패턴입니다.


<br/>

9장 : [반복자 패턴과 컴포지트 패턴](https://leedongyeop.notion.site/Chapter-09-ae22a5227b0d4e0e8ac944566b090846)
- 객체지향 원칙
    - 어떤 클래스가 바뀌는 이유는 하나뿐이어야만 한다.
- 객체지향 패턴
    - 반복자 패턴
        - 컬렉션의 구현 방법을 노출하지 않으면서 집합체 내의 모든 항목에 접근하는 방법을 제공
    - 컴포지트 패턴
        - 객체를 트리 구조로 구성해서 부분-전체 계층구조로 구현한다.
        - 이를 사용하 개별 객체와 복합 객체를 똑같은 방법으로 다룰 수 있다.
- 핵심 정리
    - 컴포지트 패턴을 적용할 때는 여러 장단점을 고려해야 한다.
    - 상황에 따라 투명성과 안정성 사이에서 적절한 균형을 찾아보자.


<br/>

10장 : [상태 패턴](https://leedongyeop.notion.site/Chapter-10-ae93f9f67af741aeb278b16826d64c69)
- 객체지향 패턴
    - 상태 패턴
        - 내부 상태가 바뀜에 따라 객체의 행동이 바뀔 수 있도록 해준다.
- 핵심 정리
    - 각 상태를 클래스 캡슐화해서 나중에 변경해야 하는 내용을 국지화할 수 있다.
    - 상태 패턴과 전략 패턴의 클래스 다이어그램은 똑같지만 용도는 다르다.

<br/>

11장 : [프록시 패턴](https://leedongyeop.notion.site/Chapter-11-c96d4c6b8899402e8f3346f46abc44a4)
- 객체지향 패턴
    - 프록시 패턴
        - 특정 객체로의 접근을 제어하는 대리인을 제공한다.
- 핵심 정리
    - 원격 프록시는 클라이언트와 원격 객체 사이의 데이터 전달을 관리한다.
    - 가상 프록시는 인스턴스를 만드는 데 많은 비용이 드는 객체로의 접근을 제어한다.
    - 보호 프록시는 호출하는 쪽의 권한에 따라 객체에 있는 메소드로의 접근을 제어한다.
    - 이외에도 캐싱 프록시, 동기화 프록시, 방화벽 프록시, 자연 복사 프록시 등 다양한 변형이 있다.

<br/>

12징 : [컴파운드 패턴](https://leedongyeop.notion.site/Chapter12-2a89fbd05e4e45c2899f84e3a9948f97)
- 객체지향 패턴
    - 복합 패턴
        - 2개 이상의 패턴을 결합해서 일반적으로 자주 등장하는 문제들의 해법을 제공한다.
- 핵심 정리
    - 모델-뷰-컨트롤러(MVC)는 옵저버, 전략, 컴포지트 패턴으로 이루어진 복합 패턴이다.
    - 모델은 옵저버 패턴을 사용해 의존성을 없애고, 상태 변경을 알린다.
    - 컨트롤러는 뷰의 전략 객체로, 뷰는 컨트롤러를 바꿔 다른 행동을 할 수 있다.
    - 뷰는 컴포지트 패턴을 사용해 사용자 인터페이스를 구현한다.