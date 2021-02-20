package calc;


public class TransformNumber {
    int number;
    int romanToNumber(String data) {
        switch (data) {
            case "I": number = 1; break;
            case "II": number = 2; break;
            case "III": number = 3; break;
            case "IV": number = 4; break;
            case "V": number = 5; break;
            case "VI": number = 6; break;
            case "VII": number = 7; break;
            case "VIII": number = 8; break;
            case "IX": number = 9; break;
            case "X": number = 10; break;
            default:
                throw new IllegalStateException("error");
        }
        return number;
    }
    static String intToRoman (int result1) {
        String romeNumber;
        if (result1<10) {
            romeNumber = unitsInRoman(result1);
        }else romeNumber = tensInRoman(result1).concat(unitsInRoman(result1));
        return romeNumber;
    }
    static String unitsInRoman (int result1){
        result1 = result1 % 10;
        String units = "";
        switch (result1) {
            case 1: units = "I"; break;
            case 2: units = "II"; break;
            case 3: units = "III"; break;
            case 4: units = "IV"; break;
            case 5: units = "V"; break;
            case 6: units = "VI"; break;
            case 7: units = "VII"; break;
            case 8: units = "VIII"; break;
            case 9: units = "XI"; break;
        }
        return units;
    }
    static String tensInRoman (int result1) {
        result1 = result1 / 10;
        String tens = "";
        switch (result1) {
            case 1: tens = "X"; break;
            case 2: tens = "XX"; break;
            case 3: tens = "XXX"; break;
            case 4: tens = "XL"; break;
            case 5: tens = "L"; break;
            case 6: tens = "LX"; break;
            case 7: tens = "LXX"; break;
            case 8: tens = "LXXX"; break;
            case 9: tens = "XC"; break;
            case 10: tens = "C"; break;
        }
        return tens;
    }
}
