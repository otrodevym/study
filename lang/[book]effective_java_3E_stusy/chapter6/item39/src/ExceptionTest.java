import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ExceptionTestContainer.class)
public @interface ExceptionTest {
    Class<? extends Throwable>[] value();// Throwable을 확장한 클래스의 Class 객체라는 의미로 모든 예외 타입을 다 수용한다.
}
