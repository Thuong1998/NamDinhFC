package Command_line_update_2;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dictionary {
    static  ArrayList<Word> list_word = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DictionaryCommandline dc = new DictionaryCommandline();
        DictionaryManagement  dm = new DictionaryManagement();
        System.out.println("Nhập từ bàn phím:       :insert from commandline");
        System.out.println("Nhập từ file            :insert from file");
        System.out.println("Xóa từ:                 :del");
        System.out.println("Xem toàn bộ từ điển     :show");
        System.out.println("Tìm từ chính xác        :look");
        System.out.println("Tìm từ gần đúng         :search");
        System.out.println("Lưu từ điển vào file    :export to file");
        System.out.println("Dừng chườn trình        :exit");
        while (sc.hasNext())
        {
            String st = sc.nextLine();
            st = st.toLowerCase();
            switch (st){
                case "insert from file":{
                    dm.insertFromFile();
                    break;
                }
                case "insert from commandline":{
                    dm.insertFromCommandline();
                    break;
                }
                case  "del":{
                    dm.delData();
                    break;
                }
                case "show":{
                    dc.showAllWords();
                    break;
                }
                case "look":{
                    dm.dictionaryLookup();
                    break;
                }
                case "search":{
                    dc.dictionarySearcher();
                    break;
                }
                case "export to file":{
                    dm.dictionaryExportToFile();
                    break;
                }
                case "exit":{
                    return;
                }
                default: {
                    System.out.println("Lệnh vừa nhập không đúng. Vui lòng nhập lại");
                }

            }
        }
//        dc.dictionaryAdvanced();
//        dc.dictionaryBasic();
//        System.out.println("Nhap tu tieng Anh muon xoa");
//        String s = sc.nextLine();
//        dm.delData(s);
//        dc.showAllWords();
//        System.out.println("Ban co muon luu lai du lieu khong? (Y/N)");
//        String save = sc.nextLine();
//        if(save.toUpperCase().equals("Y")){
//            dm.insertFromFile();
//            System.out.println("Du lieu da luu thanh cong");
//        }
//        dm.dictionaryLookup();
//        dc.dictionarySearcher();
//        System.out.println(list_word.size());
//
//
//        for (Word elent: list_word){
//            elent.setWord_target(elent.getWord_target().toLowerCase());
//        }
//        dc.showAllWords();
//        dm.dictionaryExportToFile();
    }

}