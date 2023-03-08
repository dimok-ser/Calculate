package Calculate;

import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) {



        Scanner console = new Scanner(System.in);
        System.out.println("Данный калькулятор выполняет операции сложения, вычитания, умножения и деления с двумя целыми арабскими и римскими числами."+
                "\nВведенные арабские числа должны находится в диапазоне значений от -10 до 10, римские - от 0 до Х."+
                "\nВведите математическую операцию, используя разделитель пробел:");
        String input = console.nextLine();
        String[] mathop = input.split(" ");
        int result = 0;
        int resultrom=0;


        if (!mathop[1].matches("[+-/*]")) {
            InputException.excep();
        }

            String num1 = mathop[0];
            char sign = mathop[1].charAt(0);
            String num2 = mathop[2];

            
            if (InputException.isRoman(num1) || InputException.isRoman(num2)) {
                try {
                    if (sign == '+') {
                        resultrom = RomanToArabicConverter.valueOf(num1).toInt() + RomanToArabicConverter.valueOf(num2).toInt();
                    } else if (sign == '-') {
                        resultrom = RomanToArabicConverter.valueOf(num1).toInt() - RomanToArabicConverter.valueOf(num2).toInt();
                    } else if (sign == '*') {
                        resultrom = RomanToArabicConverter.valueOf(num1).toInt() * RomanToArabicConverter.valueOf(num2).toInt();
                    } else if (sign == '/') {
                        try {
                            resultrom = RomanToArabicConverter.valueOf(num1).toInt() / RomanToArabicConverter.valueOf(num2).toInt();
                        }catch (ArithmeticException e) {
                            InputException.excep();
                        }
                    }
                    if (resultrom<0) {
                        InputException.excep();
                    }
                    String resrom = ArabianToRomanConverter.convertArabicToRoman(resultrom);
                    System.out.println("Результат:");
                    System.out.println(resrom);
                } catch (IllegalArgumentException e) {
                    InputException.excep();
                }

            }

            else if (InputException.isNumeric(mathop[0]) && InputException.isNumeric(mathop[2]))  {
                if (InputException.MatchesRange(mathop[0]) && InputException.MatchesRange(mathop[2])) {
                    try {

                        if (sign == '+') {
                            result = parseInt(num1) + parseInt(num2);
                        } else if (sign == '-') {
                            result = parseInt(num1) - parseInt(num2);
                        } else if (sign == '*') {
                            result = parseInt(num1) * parseInt(num2);
                        } else if (sign == '/') {
                            try {
                                result = parseInt(num1) / parseInt(num2);
                            }catch (ArithmeticException e) {
                                InputException.excep();
                            }
                        }
                        System.out.println("Результат:");
                        System.out.println(result);
                    } catch (NumberFormatException e) {
                        InputException.excep();
                    }
                }
                else {
                    InputException.excep();
                }
            }


    }
}
