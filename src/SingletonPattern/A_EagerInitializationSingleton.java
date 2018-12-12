package SingletonPattern;

/**
 * 1. Eager Initialization Singleton (이른 초기화 싱글턴)
 * 항상 싱글톤 객체가 필요하거나 객체 생성비용이 크게 들어가지 않는 경우에 사용
 *
 * - ClassLoader에 의해 Class가 로딩될 시 바로 인스턴스를 생성하기 때문에
 *      - 최초 getInstance시부터 빠르게 불러올 수 있고
 *      - Thread-safe함
 *
 * - 하지만, 인스턴스 사용유무와 상관없이 인스턴스가 생성되어 메모리에 상주하므로 비효율적일 수 있음
 *
 * - 참고문헌 : http://limkydev.tistory.com/67
 */

public class A_EagerInitializationSingleton {
    private static A_EagerInitializationSingleton instance = new A_EagerInitializationSingleton();

    private A_EagerInitializationSingleton() {
    }

    public static A_EagerInitializationSingleton getInstance(){
        return instance;
    }
}