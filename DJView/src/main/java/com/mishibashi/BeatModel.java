package com.mishibashi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;

public class BeatModel implements BeatModelInterface, Runnable{
    List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
    List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
    int bpm = 90;
    Thread thread;
    boolean stop = false;
    Clip clip;

    public void initialize(){
        try{
            File resource = new File("clap.wav");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(resource));
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }

    public void on(){
        bpm = 90;
        notifyBPMObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();
    }
    
    public void off(){
        stopBeat();
        stop = true;
    }

    public void run(){
        while (!stop){
            playBeat();
            notifyBeatObservers();
            try{
                Thread.sleep(60000/getBPM());
            }
            catch(Exception e){
                e.getStackTrace();
            }
        }
    }

    public void setBPM(int bpm){
        this.bpm = bpm;
        notifyBPMObservers();
    }

    public int getBPM(){
        return bpm;
    }

    private void playBeat() {
        clip.setFramePosition(0);
        clip.start();
    }

    private void stopBeat() {
        clip.setFramePosition(0);
        clip.stop();
    }

    public void registerObserver(BeatObserver o){
        beatObservers.add(o);
    }
    public void removeObserver(BeatObserver o){
        beatObservers.remove(o);
    }
    public void registerObserver(BPMObserver o){
        bpmObservers.add(o);
    }
    public void removeObserver(BPMObserver o){
        bpmObservers.remove(o);
    }

    public void notifyBeatObservers() {
        for(BeatObserver beatObserver: beatObservers){
            beatObserver.updateBeat();
        }
    }

    public void notifyBPMObservers() {
        for(BPMObserver bpmObserver: bpmObservers){
            bpmObserver.updateBPM();
        }
    }
}
