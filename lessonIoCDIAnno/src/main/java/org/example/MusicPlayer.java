package org.example;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Component
public class MusicPlayer {

    @Autowired
    private List<Music> musicList;

    public void playMusic() {
        musicList.forEach(Music::playMusic);
    }

}
