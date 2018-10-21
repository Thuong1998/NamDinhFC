/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DictionaryApplication;

/**
 *
 * @author 20166
 */
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
public class speakVoice {
    VoiceManager voiceManager;
    Voice voice;
    
    public speakVoice(String text)
    {  
      
        System.setProperty("mbrola.base", "C:/Users/20166/Downloads/NewFolder/mbrola");
        
        voiceManager = VoiceManager.getInstance();
        voice= voiceManager.getVoice("mbrola_us3");
        voice.allocate();
        voice.speak(text);
        voice.deallocate();
    }
    /**
     * @param args the command line arguments
     */  
}
