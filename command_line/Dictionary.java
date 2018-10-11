package command_line;

import java.util.ArrayList;

public class Dictionary {
	static ArrayList<Word> list_word = new ArrayList<>();
	public static void main(String[] args) {
		DictionaryCommandline dictionary = new DictionaryCommandline();
		dictionary.dictionaryBasic();
	}
}
