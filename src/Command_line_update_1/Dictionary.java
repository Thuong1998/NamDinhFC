package Command_line_update_1;

import java.io.IOException;
import java.util.ArrayList;

public class Dictionary {
    static  ArrayList<Word> list_word = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        DictionaryCommandline dc = new DictionaryCommandline();
        dc.dictionaryAdvanced();
    }
}
