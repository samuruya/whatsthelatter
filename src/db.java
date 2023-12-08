package src;

import java.util.LinkedList;

public class db {
    static LinkedList<String> dbw = new LinkedList<>();


    public static void initString(String w) {


        dbw = new LinkedList<>();
        

        // Iterate through each character in the input string
        for (int i = 0; i < w.length(); i++) {
            // Convert the character to a string and add it to the linked list
            dbw.add(String.valueOf(w.charAt(i)));
        }

    }
}
