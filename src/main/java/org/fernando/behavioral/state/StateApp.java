package org.fernando.behavioral.state;

public class StateApp {
    public static void main(String[] args) {
        MediaPlayerContext player = new MediaPlayerContext();

        player.play();   // Starting media playback.
        player.pause();  // Pausing media.
        player.play();   // Resuming playback.
        player.stop();   // Stopping media.
        player.pause();  // Cannot pause. Media is stopped.
    }
}
