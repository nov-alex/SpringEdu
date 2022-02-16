package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {

    private final String name;

    public ClassicMusic(@Value("Classic music") String name) {
        this.name = name;
    }

    @Override
    public void playMusic() {
        System.out.println("Playing: " + name);
    }
}
