package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {

    @Value("${jazzMusic.name}")
    private String name;

    @Override
    public void playMusic() {
        System.out.println("Playing: " + name);
    }
}
