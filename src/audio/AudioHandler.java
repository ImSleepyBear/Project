/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audio;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author mohini
 */

/*
 * add, start and stop audio files
 * make use of both background audio, and audio effects
 */

public class AudioHandler {
    
    private MediaPlayer backgroundAudio;
    private Media backgroundAudioFile;
    
    private MediaPlayer soundEffectAudio;
    private Media soundEffectFile;
    
    public void playBackgroundAudio (){
        backgroundAudioFile = new Media(null);
        backgroundAudio = new MediaPlayer(backgroundAudioFile);
        backgroundAudio.setCycleCount(MediaPlayer.INDEFINITE);
        backgroundAudio.setVolume(0.5);
        backgroundAudio.play();
    }
    
    public void playSoundEffect (){
        soundEffectFile = new Media(null);
        soundEffectAudio = new MediaPlayer(soundEffectFile);
        soundEffectAudio.setVolume(1.5);
        soundEffectAudio.setAutoPlay(true);
    }
}
