package ru.realhawk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

            ClassicalMusic classicalMusic = context.getBean("classicBean", ClassicalMusic.class);
            System.out.println(classicalMusic.getSong());



        /*boolean comparison = musicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(musicPlayer);
        System.out.println(secondMusicPlayer);
        musicPlayer.setVolume(95);

        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        //System.out.println(testBean.getName());

         */


        context.close();
    }
}
