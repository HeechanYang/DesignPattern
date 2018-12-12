package SingletonPattern;

/**
 * 2. Lazy Initialization Singleton (게으른 초기화 싱글턴)
 *
 * 최초 사용될 시 인스턴스를 생성하는 방식
 *
 * - Eager Initialization Singleton이 사용되지도 않는데 미리 생성되어 메모리공간을 차지하는 단점을 보완
 *
 * - Multi-Thread환경에서 Thread-safe하지 않을 수 있음
 *
 * - 참고문헌 : http://limkydev.tistory.com/67
 */

public class B_LazyInitializationSingleton {
    private static B_LazyInitializationSingleton instance;

    private B_LazyInitializationSingleton() {
    }

    public static B_LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new B_LazyInitializationSingleton();
        }
        return instance;
    }
}