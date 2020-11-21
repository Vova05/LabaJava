package Pract20;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReloadText {
    private final HashMap<String, Integer> wordsMap;
    String[] charPr = {"(", ")", ".", ",", "!", "?", "\"", ":", ";", "<", ">"};
    public ReloadText(){
        wordsMap = new HashMap<>();
    }
    public ArrayList<String> FileToArray(String text){
        ArrayList<String> words = new ArrayList<>();
        String[] buffArray = text.split(" ");
        StringBuilder buffWord;
        int ind;
        for (String word: buffArray) {
            if (!word.equals("—")) {
                buffWord = new StringBuilder(word);
                for (String s : charPr) {
                    ind = buffWord.indexOf(s);
                    if (ind != -1)
                        buffWord.deleteCharAt(ind);
                }
                word = buffWord.toString();
                words.add(word);
            }
        }
        return words;
    }
    public String getMostUsedWord(){
        return this.getMostUsedWordPair().getKey();
    }
    public Map.Entry<String, Integer> getMostUsedWordPair(){
        HashMap.Entry<String, Integer> max = new AbstractMap.SimpleEntry<String, Integer>("", 0);

        for (HashMap.Entry<String, Integer> pair : wordsMap.entrySet())
            if (pair.getValue() > max.getValue())
                max = pair;

        return max;
    }
    public String replace(char replacement, String text){
        return text.replace(' ', replacement);
    }
    public void wordsCounter(ArrayList<String> words){
        for (String word: words){
            word = word.toLowerCase();
            wordsMap.computeIfPresent(word, (key, value) -> value + 1);
            wordsMap.putIfAbsent(word, 1);
        }
    }
}
