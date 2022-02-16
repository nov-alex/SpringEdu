package org.example.code;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class MusicPlayer {

    private final List<Music> musicList;

    public void playMusic() {
        musicList.forEach(Music::playMusic);
    }

}
