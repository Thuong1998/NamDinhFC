package Command_line_update_1;

import java.io.IOException;

public class DictionaryCommandline {
    public  void showAllWords(){
        int cout = 1;
        for(Word elementWord: Dictionary.list_word)
        {
            System.out.println(cout+ "\t|"+elementWord.getWord_target().length()+"\t\t"+elementWord.getWord_target()+"\t\t\t|\t"+elementWord.getWord_explain().length()+" "+elementWord.getWord_explain());
            cout++;
        }
    }
    public void dictionaryAdvanced() throws IOException {
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromFile();
        showAllWords();
        dm.dictionaryLookup();
    }
}
