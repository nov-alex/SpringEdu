package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    @Value("Rock music")
    private String name;

    @Override
    public void playMusic() {
        System.out.println("Playing: " + name);
    }
}
