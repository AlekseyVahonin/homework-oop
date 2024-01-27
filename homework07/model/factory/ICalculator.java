package homework07.model.factory;

import homework07.model.ComplexNumber;

//Интерфейс калькуляторов
public interface ICalculator {
    ComplexNumber add(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2);
}
