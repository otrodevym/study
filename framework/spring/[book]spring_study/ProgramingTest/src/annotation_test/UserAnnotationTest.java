package annotation_test;

import java.lang.reflect.Method;

@AnnotationTest(num=0)
public class UserAnnotationTest {
	@AnnotationTest(num=1)
	public static void main(String args[]) {
		UserAnnotationTest ano = new UserAnnotationTest();
		ano.checkAnnotation(UserAnnotationTest.class);
	}
	
	@AnnotationTest(num=2)
	public void annotationSample1() {
		
	}
	
	@AnnotationTest(num=3, text="second")
	public void annotationSample2() {
		
	}
	
	public void checkAnnotation(Class userAnno) {
		Method[] methods = userAnno.getDeclaredMethods();
		for(Method tempMethod : methods) {
			AnnotationTest annotation = tempMethod.getAnnotation(AnnotationTest.class);
			if(annotation != null) {
				int num = annotation.num();
				String text = annotation.text();
				System.out.println(tempMethod.getName() + "() : number = " + num + " text = " + text);
			}else {
				System.out.println(tempMethod.getName() + "() : annotation is null");
			}
		}
	}
}
