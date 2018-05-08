package Task8.Task8_5;


import Task8.Task8_5.controller.Controller;
import Task8.Task8_5.model.Model;
import Task8.Task8_5.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View(), new Model());
        controller.doWork();
    }
}
