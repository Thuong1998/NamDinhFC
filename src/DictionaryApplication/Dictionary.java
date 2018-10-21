/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DictionaryApplication;

import java.util.Vector;

/**
 *
 * @author 20166
 */
public class Dictionary {
    static Vector<Word> listWord = new Vector<>();
    static Vector<String> listWordTarget = new Vector<>();
    public void setListWlistWordTarget(){
        for(int i = 0; i< listWord.size(); i++)
            listWordTarget.add(Dictionary.listWord.get(i).getWord_target());
    }
}
