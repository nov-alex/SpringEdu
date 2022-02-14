package org.example.lesson.di;

import lombok.Setter;

import java.util.List;

@Setter
public class MusicPlayer {

    private List<Music> musicList;

    public void playMusic() {
        musicList.forEach(music -> music.playMusic());
    }

}
