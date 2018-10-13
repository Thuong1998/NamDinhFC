package Command_line_update_2;

import java.io.*;
import java.util.Scanner;

public class DictionaryManagement {
    public void addData(){
        Scanner sc = new Scanner(System.in);
        String target  = sc.nextLine();
        String explain = sc.nextLine();
        Word new_word = new Word(target,explain);
        Dictionary.list_word.add(new_word);
    }
    public void delData(){
        Scanner sc = new Scanner(System.in);
        String del_target  = sc.nextLine();
        for(Word elementWord: Dictionary.list_word){
            if((elementWord.getWord_target()).equals(del_target))
            {
                Dictionary.list_word.remove(elementWord);
                System.out.println("Đã xóa thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy từ cần xóa");
    }
    void insertFromCommandline(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong tu muon them tu ban phim");
        int number_of_word = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < number_of_word; i++){
            addData();
        }
        System.out.println("Thêm "+number_of_word+" từ mới thành công");
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
        System.out.println("Thêm thành công từ mới từ file");
    }

    public void dictionaryLookup() {
        System.out.println("Nhập từ muốn tìm kiếm:");
        Scanner sc = new Scanner(System.in);
        String word_need_look = sc.nextLine();
        word_need_look = word_need_look.toLowerCase();
        {
            for(Word element: Dictionary.list_word) {
                if ((element.getWord_target()).equals(word_need_look)) {
                    System.out.print( element.getWord_target() );
                    for(int i = 1; i< 70 - element.getWord_target().length();i++)
                        System.out.print(" ");
                    System.out.println("|\t"+element.getWord_explain());
                    return;
                }
            }
        }
        System.out.println("Từ bạn vừa nhập không có trong từ điển");
    }
    public void dictionaryExportToFile() throws IOException {
        FileWriter fr = new FileWriter("dictionaries.txt");
        BufferedWriter bw = new BufferedWriter(fr);
        for(Word elementWord: Dictionary.list_word){
            bw.write(elementWord.getWord_target()+" \t"+elementWord.getWord_explain()+"\n");
        }
        bw.close();
        fr.close();
        System.out.println("Dữ liệu đã được xuất ra file thành công");
    }
}
