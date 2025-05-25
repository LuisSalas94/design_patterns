package org.fernando.behavioral.state;

public class PausedState implements State{
    @Override
    public void play(MediaPlayerContext context) {
        System.out.println("Resuming playback.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayerContext context) {
        System.out.println("Media is already paused.");
    }

    @Override
    public void stop(MediaPlayerContext context) {
        System.out.println("Stopping media from paused state.");
        context.setState(new StoppedState());
    }
}
