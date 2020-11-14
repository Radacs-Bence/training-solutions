package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

   private List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public void addItem(String word, List<String> translations){
        boolean isNewWord = true;
        for (DictionaryItem item : dictionaryItems) {
            if (word.equals(item.getWord())){
                isNewWord = false;
                item.addTranslations(translations);
            }
        }
        if (isNewWord){
            dictionaryItems.add(new DictionaryItem(word, translations));
        }
    }

   public List<String> findTranslations(String word) {
        List<String> translation = new ArrayList<>();
        for (DictionaryItem item : dictionaryItems) {
            if (word.equals(item.getWord())){
                for (String english: item.getTranslations()) {
                    translation.add(english);
                }
            }
        }
        return translation;
    }

}
