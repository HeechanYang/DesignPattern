package SingletonPattern;

/**
 * 5. Initialization On Demand Holder Idiom (Holder에 의한 초기화)
 *
 * 클래스안에 클래스(Holder)를 두어 JVM의 Class Loader 매커니즘과 Class가 로드되는 시점을 이용한 방법
 * 중첩클래스 Holder는 getInstance가 호출되기 전에는 참조되지 않으며,
 * 최초로 getInstance()메서드가 호출될 때 클래스 로더에 의해 싱글톤 객체를 생성하여 리턴.
 *
 * - 앞의 Singleton방식들의 장점을 모두 가져올 수 있음
 *
 * - 현재까지 가장 많이 사용되는 Singleton방식
 *
 * - 참고문헌 : http://limkydev.tistory.com/67
 */

public class InitializationOnDemandHolderIdiom {
    private InitializationOnDemandHolderIdiom(){}

    private static class SingleTonHolder{
        private static final InitializationOnDemandHolderIdiom instance = new InitializationOnDemandHolderIdiom();
    }

    public static InitializationOnDemandHolderIdiom getInstance(){
        return SingleTonHolder.instance;
    }
}