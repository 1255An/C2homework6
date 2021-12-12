package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> quote = new ArrayList<>(List.of("easy", "come", "easy", "go"));
        System.out.println("Odd numbers: " + getOddNums(nums));
        System.out.println("Even numbers without dublicates: " + getUniqueEvenNums(nums));
        System.out.println("Changed quote without duplicated words: " + getUniqueWords(quote));
        System.out.println("Found " + countDuplicates(quote) + " duplicates.");
    }

    public static List getOddNums(List<Integer> nums) {
        List<Integer> oddNums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                oddNums.add(nums.get(i));
            }
        }
        return oddNums;
    }

    public static List getUniqueEvenNums(List<Integer> nums) {
        Set<Integer> set = new LinkedHashSet<>(nums);
        List<Integer> evenNums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                evenNums.add(nums.get(i));
            }
        }
        return evenNums;
    }

    public static List getUniqueWords(List<String> quote) {
        Set<String> set = new LinkedHashSet<>(quote);
        List<String> newQuote = new ArrayList<>();
        for (int i = 0; i < quote.size(); i++) {
            newQuote.add(quote.get(i));
        }
        return newQuote;
    }

    public static int countDuplicates(List<String> quote) {
        Set<String> uniqueWords = new HashSet<>(quote);
        int count = quote.size() - uniqueWords.size();
        return count;
    }
}






