/**
 * Created by jc303477 on 9/03/15.
 */
public class length {
    public static void main(String args[]) {
        System.out.println("manual testing of wordcounter");
        System.out.println("simple.txt has 5 words");
        String text = textreader.load("simple.txt");
        int numberofwords = countwords(text);
        System.out.println("actual no of words" + numberofwords);

        System.out.println("manual testing of wordcounter");
        System.out.println("multiline.txt has 9 words");
        text = textreader.load("multiline");
        numberofwords = countwords(text);
        System.out.println("actual no of words" + numberofwords);
    }

    public static int countwords(String text) {
        int tally = 0;
        for (char i : text.toCharArray()) {
            if (i == ' ' || i == '\n')
                tally++;


        }
        int numberofwords = tally + 1;
        return numberofwords;

    }
}

