package homework07.controller;


import homework07.model.ComplexNumber;
import homework07.model.FileLogger;
import homework07.model.factory.ICalculator;
import homework07.view.CalculatorView;

import java.util.logging.Level;

//Класс контроллер связывает представление и логику работы калькулятора
public class CalculatorController {
    private CalculatorView view;
    private ICalculator model;

    public CalculatorController(CalculatorView view, ICalculator model) {
        this.view = view;
        this.model = model;
    }

    public void calculate(String operation, ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = null;

        try {
            switch (operation) {
                case "+":
                    result = model.add(num1, num2);
                    break;
                case "*":
                    result = model.multiply(num1, num2);
                    break;
                case "/":
                    result = model.divide(num1, num2);
                    break;
                default:
                    FileLogger.log(Level.WARNING, "Нет такой операции");
            }

            if (result != null) {
                view.printResult(operation, result);
            }
        } catch (Exception e) {
            FileLogger.log(Level.SEVERE, "Ошибка вычисления: " + e.getMessage());
        }
    }
}
