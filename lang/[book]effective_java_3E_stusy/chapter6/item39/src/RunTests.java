import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;

        Class<?> testClass = Class.forName("Sample2");
        for (Method m : testClass.getDeclaredMethods()) {
//            if (m.isAnnotationPresent(Item39.class)) {
//            if (m.isAnnotationPresent(ExceptionTest.class)) {
            if (m.isAnnotationPresent(ExceptionTest.class) || m.isAnnotationPresent(ExceptionTestContainer.class)) {
                tests++;
                try {
                    m.invoke(null);
//                    passed++;
                } catch (InvocationTargetException e) {
                    Throwable exc = e.getCause();
//                    System.out.println(m + " 실패 : " + exc);

//                    Class<? extends Throwable> excType = m.getAnnotation(ExceptionTest.class).value();
//                    if(excType.isInstance(exc)){
//                        passed++;
//                    }else {
//                        System.out.printf("테스트 %s 실패: 기대한 예외 %s, 발생한 예외 %s%n", m, excType.getName(), exc);
//                    }


                    int oldPassed = passed;
//                    Class<? extends Throwable>[] excTypes = m.getAnnotation(ExceptionTest.class).value();
//                    for (Class<? extends Throwable> excType : excTypes) {
//                        if (excType.isInstance(exc)) {
//                            passed++;
//                            break;
//                        }
//                    }
                    ExceptionTest[] excTests = m.getAnnotationsByType(ExceptionTest.class);
                    for (ExceptionTest excTest : excTests) {
//                        if (excTest.value().isInstance(exc)) {
//                            passed++;
//                            break;
//                        }
                    }
                    if (passed == oldPassed) {
                        System.out.printf("테스트 %s 실패: %s %n", m, exc);
                    }

                } catch (Exception e ){
                    System.out.println("잘못 사용한 @Item39: " + m);
                }
            }
        }
        System.out.printf("성공 : %d, 실패 : %d%n", passed, tests - passed);
    }
}
