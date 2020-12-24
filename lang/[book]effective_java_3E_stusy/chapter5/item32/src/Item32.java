import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.List;

public class Item32 {
//    @SafeVarargs
//    static <T> List<T> flatten(List<? extends T>... lists) {
    static <T> List<T> flatten(List<List<? extends T>>lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists)
            result.addAll(list);
        return result;
    }

    static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
        Class<?> annotationType = null;
        try {
            annotationType = Class.forName(annotationTypeName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return element.getAnnotation(annotationType.asSubclass(Annotation.class));

    }
}
