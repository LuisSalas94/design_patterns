package org.fernando.structural.adapter;

public class AdapterApp {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "come_as_you_are.mp3");
        audioPlayer.play("vlc", "alone.vlc");
        audioPlayer.play("mp4", "faraway.mp4");
    }
}
