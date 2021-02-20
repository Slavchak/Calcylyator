package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScanData {
    int num1;
    int num2;
    char operation;
    boolean isRoman;
    static  TransformNumber transformNumber = new TransformNumber();

    public void scanNumber () throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] data = reader.readLine().replaceAll("\\s+", " ").split(" ");
            operation = data[1].charAt(0);
            if ((data[0].matches("[1-9]|10")) && (data[2].matches("[1-9]|10"))) {
                num1 = Integer.parseInt(data[0]);
                num2 = Integer.parseInt(data[2]);
            } else if ((data[0].matches("I|II|III|IV|V|VI|VII|VIII|IX|X")) && (data[2].matches("I|II|III|IV|V|VI|VII|VIII|IX|X"))) {
                num1 = transformNumber.romanToNumber(data[0]);
                num2 = transformNumber.romanToNumber(data[2]);
                isRoman = true;
            }else throw new IOException("Вы ввели неверные данные");
        }
    public int getNum1(){
            return num1;
        }
    public int getNum2(){
        return num2;
    }
    public char getOperation(){
            return operation;
    }
    public boolean getIsRoman() {
            return isRoman;
    }

}

