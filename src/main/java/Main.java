public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator(10, 2);

        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getSubstractionResult());
        System.out.println(calculator.getMultiplicationResult());
        System.out.println(calculator.getDivisionResult());
    }
}
