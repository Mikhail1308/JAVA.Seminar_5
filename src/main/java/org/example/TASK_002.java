/**
 * 1)	Посчитать количество вхождений каждого символа в текст.
 * 2)	Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
 * В противном случае (false).
 */


package org.example;


import java.util.TreeMap;

public class TASK_002 {
    public static void main(String[] args) {
        String strInput = "Opportunity";
        System.out.println(strInput);
        String str = strInput.replaceAll("[^a-zа-яA-ZА-Я]", "");
        TreeMap<Character, Integer> userList = new TreeMap<>();
        int tempCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (userList.containsKey(str.charAt(i))) {
                tempCount = userList.get(str.charAt(i)) + 1;
                userList.put(str.charAt(i), tempCount);
            } else {
                userList.put(str.charAt(i), 1);
            }
        }
        System.out.println(userList.toString().replaceAll("" +
                "[{\\}\\{\\}]", ""));


        char[] carray = strInput.toCharArray();
        System.out.println("В тексте: " + strInput);
        System.out.print("Дублируюиеся символы: ");
        for (int i = 0; i < strInput.length(); i++) {
            for (int j = i + 1; j < strInput.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }
    }
}