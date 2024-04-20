public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    // Constructor.
    public SimpleCalculator (double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    // Getters & Setters.
    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setFirstNumber() {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber() {
        this.secondNumber = secondNumber;
    }
    // Funciones matemáticas.
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }
    public double getSubstractionResult() {
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
    public double getDivisionResult() {
        if(secondNumber == 0.0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }
}
