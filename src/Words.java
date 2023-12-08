package src;

import java.util.LinkedList;
import java.util.Random;

public class Words {

    public static LinkedList<String> wordBank = init();
    public static String Word = chooseWord();

    public static LinkedList<String> init() {
        LinkedList<String> words = new LinkedList<>();

        words.add("apple");
        words.add("banana");
        words.add("carrot");
        words.add("dog");
        words.add("elephant");

        return words;
    }


    public static String chooseWord() {
        Random random = new Random();
        int randomIndex = random.nextInt(wordBank.size());
        return wordBank.get(randomIndex);
    }


    public static String getWord() {
        Word = chooseWord();
        return Word;
    }

}
