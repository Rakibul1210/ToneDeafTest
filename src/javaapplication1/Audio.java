/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author Redoan
 */
        

public class Audio {
           public static synchronized void playSound(final String audioName) {
   new Thread(new Runnable() {
     // final String url;
  // The wrapper thread is unnecessary, unless it blocks on the
  // Clip finishing; see comments.
    public void run() {
      try {

      
      File f = new File("snd/"+audioName+".wav");
    AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());  
    Clip clip = AudioSystem.getClip();
    clip.open(audioIn);
    clip.start();
    
      } catch (Exception e) {
                  System.out.println(e);
                  JOptionPane.showMessageDialog(null,"Audio file not found");
      }
    }
  }).start();
}
   
}
