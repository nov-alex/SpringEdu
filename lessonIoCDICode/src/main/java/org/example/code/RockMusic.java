package org.example.code;

import org.springframework.beans.factory.annotation.Value;

public class RockMusic implements Music {

    @Value("Rock music")
    private String name;

    @Override
    public void playMusic() {
        System.out.println("Playing: " + name);
    }
}
