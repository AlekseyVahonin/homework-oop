package homework07;

import homework07.controller.CalculatorController;
import homework07.model.ComplexNumber;
import homework07.model.factory.CalculatorFactory;
import homework07.view.CalculatorView;


public class Main {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(view, CalculatorFactory.createCalculator());

        ComplexNumber num1 = new ComplexNumber(5, 10);
        ComplexNumber num2 = new ComplexNumber(11, 7);

        controller.calculate("+", num1, num2);
        controller.calculate("*", num1, num2);
        controller.calculate("/", num1, num2);
        controller.calculate("ррр", num1, num2);
        controller.calculate(null, num1, num2);
    }
}
