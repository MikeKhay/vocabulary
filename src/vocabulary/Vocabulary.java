package vocabulary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Vocabulary {
    public static void main(String[] args) {

//        IrregularVerb verb = new IrregularVerb("Do", "Did", "Done", "Робити");

        List<Word> words = getWords();

        while (words.size() != 0) {
            Random ran = new Random();
            int index = ran.nextInt(words.size());

            Word word = words.get(index);

            System.out.println(word.getT());

            Scanner in = new Scanner(System.in);
            String s = in.nextLine();

            if (s.equals(word.getW())) {
                System.out.println("true");
                words.remove(index);
            } else {
                System.out.println("false. " + word);
            }
            System.out.println("====================================================");
        }

        System.out.println("LIST IS EMPTY");
    }

    public static List<Word> getWords() {
        List<Word> words = new ArrayList<>();

        words.add(new Word("Hello", "Привіт"));
        words.add(new Word("Dog", "Собака"));
        words.add(new Word("Cat", "Кіт"));

        return words;
    }
}
