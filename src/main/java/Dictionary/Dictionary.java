package Dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    HashMap<String,String> dictionary;

    Dictionary(){
        this.dictionary=new HashMap<String, String>();
    }

    public String translate(String word){
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }
        return null;
    }
    public void add(String word, String translation){
        this.dictionary.put(word,translation);
    }
    public int amountOfWords(){
        return this.dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<>();
        for (HashMap.Entry<String, String> entry : this.dictionary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            list.add(key + " = " + value);
        }
        return list;
    }
}
