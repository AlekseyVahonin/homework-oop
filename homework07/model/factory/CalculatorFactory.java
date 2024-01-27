package homework07.model.factory;

//Фабрика для создания калькуляторов через интерфейс калькуляторов
public class CalculatorFactory {
    public static ICalculator createCalculator() {
        return new ComplexCalculator();
    }
}
