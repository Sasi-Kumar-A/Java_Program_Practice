package Strings;

import java.util.Scanner;

public class GetTargetWordInSentence {
    static Scanner sc = new Scanner(System.in);
    public static void getTargetWordInSentence(String sentence, String targetWord) {
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.equals(targetWord)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Target word found " + count + " times.");
        } else {
            System.out.println("Target word not found in the sentence.");
        }
    }
    public static void main(String args[]) {
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Enter the target word: ");
        String targetWord = sc.nextLine();
        getTargetWordInSentence(sentence, targetWord);
    }
}