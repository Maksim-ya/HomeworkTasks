package Task6.Task6_2;


import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = "Petia";
        Class<?> clazz = s.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + fieldType.getName());
        }
        Field field = s.getClass().getDeclaredField("value");
        field.setAccessible(true);
        field.set(s, new char[] {'N','e','w'});
        System.out.println(s);
    }
}
