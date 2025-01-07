package week03_hw;

public class Calculator {
    private AbstractOperation operation;

    public Calculator(AbstractOperation operation){
        this.operation=operation;
    }

    public void setOperation(AbstractOperation operation){
        this.operation=operation;
    }

    public double calculate(int firstNum, int secondNum){
        double answer =0;
        answer= operation.operate(firstNum, secondNum);
        return answer;
    }
}
