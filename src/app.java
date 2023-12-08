package src;

import java.util.*;


public class app {

    static String wrn;
    static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args){
        while (true) {
        flush();
        //thr thing = new thr();
        wrn = Words.getWord();
        db.initString(wrn);

        
        print("the word is: " + wrn);
        LinkedList<String> wordListed = db.dbw; 
        

        Random random = new Random();
        int randomIndex = random.nextInt(wordListed.size());
        String awns = wordListed.get(randomIndex);
        int ri = randomIndex + 1;
        
        for (int i = 5; i > 0; i--) {
            print("" + i + " seconds left");
            try {Thread.sleep(1000);} catch (InterruptedException e) {}
        }

        

        int trys = 3;
        while (true) {
            flush();
            print("" + trys + " left");
            System.out.print("whats the " + ri + " latter of the word \n");

            String uAwns = sc.next();
            if (uAwns.equals(awns)) {
                print("you won!");
                try {Thread.sleep(1000);} catch (InterruptedException e) {}
                break;
            }

            if(trys == 1) break;
            trys = trys - 1;
        }


        flush();
        }
    }

    public static void flush() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void printinln(String s) {
        System.out.print(s);
    }

}