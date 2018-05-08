package Task6.Task6_3;


import Task6.Task6_3.controller.OperationReflection;

public class Main {
    public static void main(String[] args) {
        OperationReflection operationReflection =new OperationReflection();
        operationReflection.seeConstructors();
        operationReflection.createInstance();
        operationReflection.getFields();
        operationReflection.changeObject();
    }
}
