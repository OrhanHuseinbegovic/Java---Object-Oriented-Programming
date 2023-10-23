package PripremaZaQuiz;

public class Zadatak2 {
    public static void main(String[] args){
        String sent = "Orhan Huseinbegović is learning java.";
        printWordsFromSentence(sent);
    }
    public static void printWordsFromSentence(String sentence){
        String[] sentenceArray = sentence.split(" ");
        for (String word : sentenceArray) {
            System.out.println(word);
        }
    }
}
