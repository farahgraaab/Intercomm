package com.graaab.intercomm.helper;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by USER-28 on 16/3/2018.
 */

public class ObjectHelper {

    /**
     * Tag for use logging debug output to LogCat
     */
    private static final String TAG = ObjectHelper.class.getSimpleName();


    /**
     * Method that convert object to map.
     *
     * @param T The object to convert
     * @return map
     */
    public static Map<String, Object> objectToMap(Object T) {
        Map<String, Object> map = new HashMap<>();

        Class aClass = T.getClass();
        Field[] fields = aClass.getDeclaredFields();

        try {
            for (Field field : fields) {
                Method fieldGetter = T.getClass().getMethod("get" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1));

                if (fieldGetter.invoke(T) != null) {
                    map.put(field.getName(), fieldGetter.invoke(T).toString());
                }
            }

        } catch (NoSuchMethodException e) {

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        }

        return map;
    }
}
