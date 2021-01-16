import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Project : item56
 * Create by IntelliJ IDEA
 * User: otrodevym
 * Date: 2021/1/17/0017
 * Time: 오전 3:40:39
 */
public class Item55 {
    /**
     * 이 메서드는 테스트 메서드이다.
     * @param 
     */
    /**
    * @auther : hwesd
    * @since : 2021/1/17/0017 오전 3:41:33
    * @methodName :
    * @param : 
    * @return : 
    * @description : 
    **/
    void test() {
        
    }

    /**
     * @implSpec This is implements returns {@code this.size(0 == 0}.
     * @return true if this collection is empty
     */

    void test2() {

    }

    /**
     * 테스트 {@literal 일거라고.} 그렇다.
     */
    void test3() {

    }

    /**
     * {@summary 요약 설명을 만듬}
     */


    /**
     * 키 하나가 가리킬 수 있는 값은 최대 1개이다.
     *
     * @param <K> 이 맵이 관리하는 키의 타입
     * @param <V> 맵핑된 값의 타입
     */
    interface Map<K, V> {

    }

    /**
     * Station info
     */
    enum Station {
        /** subway station */
        subway
    }

    /**
     * 테스트하기 위한 애너테이션으로 테스트를 위해 존재한다.
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Test {
        /**
         * 테스트 하기 위한 함수로 테스트한다.
         */
        void test();

    }
}
