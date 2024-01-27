package homework07.view;

import homework07.model.ComplexNumber;

//Вывод результата
public class CalculatorView {
    public void printResult(String operation, ComplexNumber result) {
        String message = operation + " равно: " + result.getReal() + " + " + result.getImaginary() + "i";
        System.out.println(message);
    }
}
