package calc;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final ScanData scanData = new ScanData();
        final Operation operation = new Operation();
        scanData.scanNumber();
        System.out.println(operation.calculator(scanData.getNum1(), scanData.getNum2(), scanData.getOperation(), scanData.getIsRoman()));
    }
}
