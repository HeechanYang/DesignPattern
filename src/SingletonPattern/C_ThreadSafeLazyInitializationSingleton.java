package SingletonPattern;

/**
 * 3. Thread Safe Lazy Initialization Singleton (Thread-safe한 게으른 초기화 싱글턴)
 *
 * 최초 사용될 시 동기화하여 인스턴스를 생성하는 방식
 *
 * - Eager Initialization Singleton이 사용되지도 않는데 미리 생성되어 메모리공간을 차지하는 단점을 보완
 * - Lazy Initialization Singleton이 Multi-thread 환경에서 Thread-safe하지 않을 수 있다는 단점을 보완
 *
 * - 매번 getInstance()할 때마다 동기화되기 때문에 오버헤드가 큼
 *
 * - 참고문헌 : http://limkydev.tistory.com/67
 */

public class C_ThreadSafeLazyInitializationSingleton {
    private static C_ThreadSafeLazyInitializationSingleton instance;

    private C_ThreadSafeLazyInitializationSingleton() {
    }

    public static synchronized C_ThreadSafeLazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new C_ThreadSafeLazyInitializationSingleton();
        }
        return instance;
    }
}