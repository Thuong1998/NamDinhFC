package Command_line;

import java.util.Scanner;

public class DictionaryManagement {
    void insertFromCommandline(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong tu can them");
        int number_of_word = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < number_of_word; i++){
            String target  = sc.nextLine(); // nhap tu
            String explain = sc.nextLine(); // nhap nghia
            Word new_word = new Word();
            new_word.setWord_target(target);
            new_word.setWord_explain(explain);
            Dictionary.list_word.add(new_word);
        }
    }
}
