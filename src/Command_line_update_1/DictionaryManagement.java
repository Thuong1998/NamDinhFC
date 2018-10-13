package Command_line_update_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryManagement {
    void insertFromCommandline(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of word");
        int number_of_word = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < number_of_word; i++){
            String target  = sc.nextLine();
            String explain = sc.nextLine();
            Word new_word = new Word();
            new_word.setWord_target(target);
            new_word.setWord_explain(explain);
            Dictionary.list_word.add(new_word);
        }
    }
    void insertFromFile()throws IOException{
        FileReader fr = new FileReader("dictionaries.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){
            for(int i = 0; i< line.length();i++)
            {
                if(line.charAt(i)==9)
                {
                    String target  = line.substring(0, i-1 );
                    String explain = line.substring(i+1, line.length());
                    Word new_word  = new Word();
                    new_word.setWord_target(target);
                    new_word.setWord_explain(explain);
                    Dictionary.list_word.add(new_word);
                }
            }
            line = br.readLine();
        }
        br.close();
        fr.close();
    }

    public void dictionaryLookup() {
        System.out.println("Input :");
        Scanner sc = new Scanner(System.in);
        String word_need_look = sc.nextLine();
        while(word_need_look != null) {
            for(Word element: Dictionary.list_word) {
                if ((element.getWord_target()).equals(word_need_look)) {
                    System.out.println(element.getWord_explain());
                }
            }
            System.out.println("Input :");
            word_need_look = sc.nextLine();
        }
        sc.close();
    }
}
