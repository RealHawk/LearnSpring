package ru.realhawk;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    //private Music music;
    private List<Music> playList = new ArrayList<>();
    private String name;
    private int volume;

    //IoC
   // public MusicPlayer(Music music){
   //     this.music = music;
    //}
    public MusicPlayer(){

    }

    public List<Music> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Music> playList) {
        this.playList = playList;
    }

   // public void setMusic(Music music){
    //    this.music = music;
   // }

    public  void playMusic(){
        for (Music melody: this.playList
             ) {
            System.out.println(melody.getSong());

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
