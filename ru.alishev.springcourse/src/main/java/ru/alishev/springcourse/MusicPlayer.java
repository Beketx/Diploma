package ru.alishev.springcourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer  {

    private QPOP qpop;
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, QPOP qpop) {
        this.classicalMusic = classicalMusic;
        this.qpop = qpop;
    }
    //IoC зависит, так как просто музыка можно выбирать любую жанру музыки
    //ioc
//    private String name;
//    private int volume;
//
//    public Integer getVolume() {
//        return volume;
//    }
//    public void setVolume(Integer volume) {
//        this.volume = volume;
//    }
//
//    public String getName(){
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer(){}
//
//    public void setMusic(Music music) {
//        this.qpop = qpop;
//    }


    public String playMusic() {
        return "Playing: " + qpop.getSong();
    }

}
