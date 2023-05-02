/**
 * Написать перевод их Римских цифр в арабские:
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * Примеры:
 * 1)	ввод: s = "LVIII"
 * вывод: 58
 * разбор: L = 50, V= 5, III = 3.
 * 2)	ввод: s = "MCMXCIV"
 * вывод: 1994
 * разбор: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

package org.example;

import java.util.Scanner;
public class TASK_003 {
    static int value(char a) {
        if (a == 'm') return 1000;
        else if (a == 'd') return 500;
        else if (a == 'c') return 100;
        else if (a == 'l') return 50;
        else if (a == 'x') return 10;
        else if (a == 'v') return 5;
        else if (a == 'i') return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число римскими цифрами: ");
        String roman = in.nextLine();
        roman = roman.toLowerCase();
        int val = 0;
        int val_next = 0;
        int temp = 0;
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            val = value(roman.charAt(i));
            if (i < roman.length() - 1) {
                val_next = value(roman.charAt(i + 1));
            } else val_next = 0;

            if (val_next == 0) {
                temp = val;
            } else {
                if (val > val_next) temp = val;
                else if (val < val_next) {
                    temp = val_next - val;
                    i++;
                } else if (val == val_next) temp = val;
            }
            result += temp;
        }
        System.out.println("Результат арабскими цифрами: " + result);
    }
}




