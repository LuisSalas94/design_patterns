package org.fernando.behavioral.state;

public class StoppedState implements State{
    @Override
    public void play(MediaPlayerContext context) {
        System.out.println("Starting media playback.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayerContext context) {
        System.out.println("Cannot pause. Media is stopped.");
    }

    @Override
    public void stop(MediaPlayerContext context) {
        System.out.println("Media is already stopped.");
    }
}
