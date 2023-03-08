package Calculate;

import java.io.IOException;
import static java.lang.Integer.*;

public class InputException extends IOException {
    public static void excep() {
        try {
            throw new IOException();
        } catch (IOException e) {
                System.out.println("Некорректный ввод данных. Проверьте введенную математическую операцию и попробуйте снова.");
                System.exit(0);
        }
    }

    public static boolean isNumeric(String str)
    {
        return (!str.equalsIgnoreCase("0") || !str.equalsIgnoreCase("I") || !str.equalsIgnoreCase("II") || !str.equalsIgnoreCase("III") || !str.equalsIgnoreCase("IV") || !str.equalsIgnoreCase("V") || !str.equalsIgnoreCase("VI") || !str.equalsIgnoreCase("VII") || !str.equalsIgnoreCase("VIII") || !str.equalsIgnoreCase("IX") || !str.equalsIgnoreCase("X"));
    }
    public static boolean isRoman(String str)
    {
        return !(str.matches("[+-]?\\d*(\\.\\d+)?"));
    }
    public static boolean MatchesRange(String str)
    {
        return (Math.abs(parseInt(str))<=10) ;
    }
}
