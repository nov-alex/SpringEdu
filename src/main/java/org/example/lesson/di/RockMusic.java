package org.example.lesson.di;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RockMusic implements Music {

    private final String name;

    @Override
    public void playMusic() {
        System.out.println("Playing: " + name);
    }
}
