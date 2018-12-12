package SingletonPattern;

/**
 * 4. Double Checked Locking Singleton
 *
 * 최초 사용될 시 동기화하여 인스턴스를 생성하는 방식
 *
 * - Eager Initialization Singleton이 사용되지도 않는데 미리 생성되어 메모리공간을 차지하는 단점을 보완
 * - Lazy Initialization Singleton이 Multi-thread 환경에서 Thread-safe하지 않을 수 있다는 단점을 보완
 * - Thread Safe Lazy Initialization Singleton이 매 getInstance()마다 동기화되어 비효율적인 점을 보완
 *
 *
 * - 참고문헌 : http://limkydev.tistory.com/67
 */

public class D_DoubleCheckedLockingSingleton {
    private static D_DoubleCheckedLockingSingleton instance;

    private D_DoubleCheckedLockingSingleton() {
    }

    public static D_DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (D_DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new D_DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}