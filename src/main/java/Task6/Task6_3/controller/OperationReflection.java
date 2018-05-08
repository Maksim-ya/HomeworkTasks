package Task6.Task6_3.controller;


import Task6.Task6_3.model.Operation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OperationReflection {
    Class<?> clazz = Operation.class;

    public void seeConstructors() {

        Constructor<?>[] constrs = clazz.getConstructors();
        int i = 0;
        for (Constructor<?> constructor : constrs) {
            System.out.print("Constructor " + (++i) + " : ");
            Class<?>[] paramTypes = constructor.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
    }

    public Object createInstance() {
        Object obj=null;
        try {
            Class<?>[] paramsType =
                    new Class<?>[]{double.class};
            Constructor<?> constr = clazz.getConstructor(paramsType);
             obj =(Operation) constr.newInstance(300.0);
            System.out.println(obj);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return obj;
    }

    public void getFields() {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Name: " + method.getName());
            System.out.println("\tReturn type: "

                    + method.getReturnType().getName());

            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print("\tParam types:");
            for (Class<?> paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
    }

    public void changeObject() {
         Operation obj = new Operation();
        try {
            Class<?>[] paramsType = new Class<?>[]{double.class};
            Method method = clazz.getMethod("changeSign");
            method.invoke(obj);
            System.out.println(obj);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
