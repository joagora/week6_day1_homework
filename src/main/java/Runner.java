public class Runner {
    public static void main(String[] args){
        Calculator newCalculator = new Calculator();
        System.out.println(newCalculator.addValues(1, 2));
        System.out.println(newCalculator.subtractValues(1, 2));
        System.out.println(newCalculator.multiplyValues(1, 2));
        System.out.println(newCalculator.divideValues(5, 2));
    }
}
