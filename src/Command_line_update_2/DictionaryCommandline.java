package Command_line_update_2;

import java.io.IOException;
import java.util.Scanner;

public class DictionaryCommandline {
    public  void showAllWords(){
        int cout = 1;
        System.out.println("No.\t|\t\t\t\t\t\t\t\tEnglish\t\t\t\t\t\t\t\t\t|\t\t\tVietnamese");
        for(Word elementWord: Dictionary.list_word)
        {
            System.out.print( cout + "\t|"+elementWord.getWord_target() );
            for(int i = 1; i< 70 - elementWord.getWord_target().length();i++)
                System.out.print(" ");
            System.out.println("|\t"+elementWord.getWord_explain());
            cout++;
        }
    }
    public void dictionaryBasic(){
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromCommandline();
        showAllWords();
    }
    public void dictionaryAdvanced() throws IOException {
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromFile();
        showAllWords();
        //dm.dictionaryLookup();
    }
    public void dictionarySearcher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu muon tim gan dung:");
        String ds = sc.nextLine();
        int cout = 1;
        for(Word elementWord: Dictionary.list_word)
        {
            if((elementWord.getWord_target().substring(0,ds.length())).equals(ds))
            {
                System.out.print( cout + "\t|"+elementWord.getWord_target() );
                for(int i = 1; i< 70 - elementWord.getWord_target().length();i++)
                    System.out.print(" ");
                System.out.println("|\t"+elementWord.getWord_explain());
                cout++;
            }
        }
    }
}

