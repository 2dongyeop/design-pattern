package Chapter5.classicSingleton;

public class Singleton {
    //하나뿐인 인스턴스를 저장하는 정적 변수
    private static Singleton uniqueInstance;

    // 기타 인스턴스 변수

    //생산자를 private로 선언하므로 Singleton에서만 클래스의 인스턴스를 만들 수 있음
    private Singleton() {}

    //클래스의 인스턴스를 만들어서 리턴
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance; }

    public String getDescription() {
        return "I'm a classic Singleton!";
    }

    // 기타 메소드
}
