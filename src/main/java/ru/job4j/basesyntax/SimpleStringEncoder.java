package ru.job4j.basesyntax;

/*
реализовать элементарный алгоритм сжатия строки на основе счетчика повторяющихся символов.
String input = "aaaabbbccd";
String result = "a4b3c2d";
 */
public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result.append(symbol);
                if (counter > 1) {
                    result.append(counter);
                }
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        result.append(symbol);
        if (counter > 1) {
            result.append(counter);
        }
        return result.toString();
    }
}
