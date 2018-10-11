
package baitaplon;

import java.util.ArrayList;
import java.util.Scanner;

class Word{
    private String word_target, word_explain;

    public Word(String word_target, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
    }

    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
    
}
class Dictionary extends ArrayList<Word> {

    public Dictionary(int initialCapacity) {
        super(initialCapacity);
    }

    public Dictionary() {
    }
    
}
class DictionaryManagement{
public  void insertFromCommandline(Dictionary dtn)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("nh?p s? t? ");
		int numberWord = Integer.parseInt(sc.nextLine());
		for (int i = 0; i<numberWord ;i++)
		{
			String word_target = sc.nextLine();
			String word_explain = sc.nextLine();
			Word newWord = new Word (word_target ,word_explain );
			dtn.add(newWord);
		
					
			
		}
		
	}
}
class DictionaryCommandline{
    public void showAllWords(Dictionary dtn){
           System.out.println("English |     |  Vietnam");
           dtn.forEach((j) -> {
               System.out.println(j.getWord_target() + "  |     |  " + j.getWord_explain());
        });
    }
    }

class DictionaryCommentline{
public void dictionaryBasic(){
    DictionaryManagement t = new DictionaryManagement();
    Dictionary dtn = new Dictionary();
    t.insertFromCommandline(dtn);
    DictionaryCommandline t1=new DictionaryCommandline();
    t1.showAllWords(dtn);
    
}
}
/**
 *
 * @author mac
 */
public class Baitaplon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DictionaryCommentline t = new DictionaryCommentline();
        t.dictionaryBasic();
    }
    
}