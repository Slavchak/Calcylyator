package calc;

import calc.TransformNumber;

import java.io.IOException;

public class Operation {
    TransformNumber transformNumber = new TransformNumber();
    String result;
    int result1;

    public String calculator(int num1, int num2, char operation, boolean isRome) {
        switch (operation) {
            case '+':
                result1 = num1 + num2;
                break;
            case '-':
                result1 = num1 - num2;
                break;
            case '*':
                result1 = num1 * num2;
                break;
            case '/':
                result1 = num1 / num2;
                break;
            default:
                throw new ArithmeticException ("Операция не распознана: " + "'" + operation + "'");
        }
        if (isRome){
            result = transformNumber.intToRoman(result1);
            return result;
        } else {
            result = Integer.toString(result1);
            return result;
        }

    }

}
