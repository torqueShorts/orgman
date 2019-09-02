package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);
        String name = "";

        for(int i = 0; i < className.length();i++)
        {
            if(Character.isUpperCase(className.charAt(i)))
            {
                String value = String.valueOf(className.charAt(i));
                name += value;
            }
        }

        return name;

    }
}

/**
 * Your implementation goes here
 *
 * INSTRUCTION
 * 1. Remove line 17 [throw new UnsupportedOperationException("Not yet supported!");]
 * 2. Get the capitalized letter(s) from the className and return it.
 */