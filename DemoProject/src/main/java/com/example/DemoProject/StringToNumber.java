package com.example.DemoProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringToNumber {

	private static final Map<String, Integer> wordToNumMap = new HashMap<>();

    static {
        wordToNumMap.put("one", 1);
        wordToNumMap.put("two", 2);
        wordToNumMap.put("three", 3);
        wordToNumMap.put("four", 4);
        wordToNumMap.put("five", 5);
        wordToNumMap.put("six", 6);
        wordToNumMap.put("seven", 7);
        wordToNumMap.put("eight", 8);
        wordToNumMap.put("nine", 9);
        wordToNumMap.put("ten", 10);
        wordToNumMap.put("eleven", 11);
        wordToNumMap.put("twelve", 12);
        wordToNumMap.put("thirteen", 13);
        wordToNumMap.put("fourteen", 14);
        wordToNumMap.put("fifteen", 15);
        wordToNumMap.put("sixteen", 16);
        wordToNumMap.put("seventeen", 17);
        wordToNumMap.put("eighteen", 18);
        wordToNumMap.put("nineteen", 19);
        wordToNumMap.put("twenty", 20);
        wordToNumMap.put("thirty", 30);
        wordToNumMap.put("forty", 40);
        wordToNumMap.put("fifty", 50);
        wordToNumMap.put("sixty", 60);
        wordToNumMap.put("seventy", 70);
        wordToNumMap.put("eighty", 80);
        wordToNumMap.put("ninety", 90);
        wordToNumMap.put("hundred", 100);
        wordToNumMap.put("thousand", 1000);
    }

    public static int wordsToNumber(String input) {
        String[] words = input.toLowerCase().split(" ");
        int total = 0;
        int current = 0;

        for (String word : words) {
            if (wordToNumMap.containsKey(word)) {
                int value = wordToNumMap.get(word);
                System.out.println("value " + value + " current " +current);
                if (value == 100) {
                    current *= value;
                } else if (value == 1000) {
                    current *= value;
                    total += current;
                    current = 0;
                } else {
                    current += value;
                }
            } else {
                System.out.println("Unknown word: " + word);
                return -1;
            }
        }
        System.out.println("total 1 " + total);
        total += current;
        System.out.println("total 2 "+ total);
        return total;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please Write the Words : ");
        String next = s.nextLine();
        System.out.print("Output: " + wordsToNumber(next));
    }
	}

