package JavaBasics.Questions.AccessPrivate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by jaydatta on 9/19/16.
 */
public class Accessor {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class baseInstance = JavaBasics.Questions.AccessPrivate.BaseClass.class;

        Object obj = baseInstance.newInstance();

        Method declaredMethod = baseInstance.getDeclaredMethod("cube",new Class[]{int.class});
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(obj,4);
    }
}
