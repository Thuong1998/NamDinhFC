package command_line;

import java.util.Scanner;

public class DictionaryManagement {
	public void insertFromCommandline() {
		Scanner sc = new Scanner(System.in);
		int number_of_word = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < number_of_word; i++)
		{
			Word new_word = new Word();
			new_word.setWord_target(sc.nextLine());
			new_word.setWord_explain(sc.nextLine());
			Dictionary.list_word.add(new_word);
		}
		sc.close();
	}
}
