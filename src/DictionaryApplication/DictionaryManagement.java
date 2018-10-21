package DictionaryApplication;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryManagement {
    void insertFromFile()throws IOException{
        FileReader fr = new FileReader("dictionaries.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){
            for(int i = 0; i< line.length();i++)
            {
                if(line.charAt(i)==9)
                {
                    String target  = line.substring(0, i );
                    String explain = line.substring(i+1, line.length());
                    Word new_word  = new Word(target,explain);
                    Dictionary.listWord.add(new_word);
                }
            }
            line = br.readLine();
        }
        br.close();
        fr.close();
        System.out.println("Thêm thành công từ mới từ file");
    }
    public void dictionaryExportToFile() throws IOException {
        FileWriter fr = new FileWriter("dictionaries.txt");
        BufferedWriter bw = new BufferedWriter(fr);
        for(int i = 0 ; i < Dictionary.listWord.size(); i++){
            bw.write(Dictionary.listWord.get(i).getWord_target()+"\t"+Dictionary.listWord.get(i).getWord_explain()+"\n");
        }
        bw.close();
        fr.close();
        System.out.println("Dữ liệu đã được xuất ra file thành công");
    }
}
