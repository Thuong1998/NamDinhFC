package command_line;

public class DictionaryCommandline {
	public void showAllWords() {
		for(Word elements: Dictionary.list_word)
		{
			System.out.println(elements.getWord_target()+" / "+elements.getWord_explain());
		}
	}
	public void dictionaryBasic()
	{
		DictionaryManagement new_Dictionary = new DictionaryManagement();
		new_Dictionary.insertFromCommandline();
		showAllWords();
	}
}
