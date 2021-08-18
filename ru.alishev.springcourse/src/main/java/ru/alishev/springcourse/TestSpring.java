package ru.alishev.springcourse;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String [] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
//        QPOP classicalMusic = context.getBean("musicBean", QPOP.class);
////      because of private constructor  QPOP c = new QPOP();
//        System.out.println(classicalMusic.getSong());
//        Music music = context.getBean("musicBean", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstmusicPlayer == secondMusicPlayer;
//
//        firstmusicPlayer.setVolume(10);
//
//        System.out.println(comparison);
//
//        System.out.println(firstmusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
