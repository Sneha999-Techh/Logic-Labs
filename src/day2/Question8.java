package day2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        sentence = sentence.toLowerCase();

        String[] words = sentence.split(" ");

        boolean[] visited = new boolean[words.length];

        System.out.println("\nWord Frequency:");
        for (int i = 0; i < words.length; i++) {
            if (visited[i] == false) {
                int count = 1;

                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        visited[j] = true; 
                    }
                }

                System.out.println(words[i] + ": " + count);
            }
        }

        sc.close();
    }
}
