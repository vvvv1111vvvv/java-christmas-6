package christmas;

import christmas.Controller.Controller;

public class Application {
    public static void main(String[] args) {
        Controller control = new Controller();
        control.getDateandOrder();
        control.calculation();
        control.printResult();
    }
}
