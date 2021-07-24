package ru.alishev.springcourse;

public class MusicPlayer  {
    private Music music; //IoC зависит, так как просто музыка можно выбирать любую жанру музыки
    //ioc
    private String name;
    private int volume;

    public Integer getVolume() {
        return volume;
    }
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){}

    public void setMusic(Music music) {
        this.music = music;
    }


    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

}
