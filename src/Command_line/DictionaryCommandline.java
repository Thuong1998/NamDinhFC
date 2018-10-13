package Command_line;

public class DictionaryCommandline {
    public  void showAllWords(){
        int cout = 1;
        for(Word elementWord: Dictionary.list_word)
        {
            System.out.println(cout+ "\t|\t"+elementWord.getWord_target()+"\t\t\t|\t"+elementWord.getWord_explain());
            cout++;
        }
    }
    public void dictionaryBasic(){
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromCommandline();
        showAllWords();
    }
}
