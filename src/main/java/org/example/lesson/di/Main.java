package org.example.lesson.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");
        musicPlayer.playMusic();
        context.close();

    }
}
