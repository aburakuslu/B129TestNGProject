package techproed.utilities;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ListenersRetryAnalyzer implements IAnnotationTransformer {
    //Bu class ListenersRetry class'ı XML dosyasıyla test sınıfları ilişkilendirilemediği için oluşturuldu.
    //Bu class ile ListenersRetry class'ını XML dosyası ile ilişkilendirebileceğiz.
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(ListenersRetry.class);
    }
}