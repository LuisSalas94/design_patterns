package org.fernando.behavioral.state;

public class PlayingState implements State {

    @Override
    public void play(MediaPlayerContext context) {
        System.out.println("Already playing.");
    }

    @Override
    public void pause(MediaPlayerContext context) {
        System.out.println("Pausing media.");
        context.setState(new PausedState());
    }

    @Override
    public void stop(MediaPlayerContext context) {
        System.out.println("Stopping media.");
        context.setState(new StoppedState());
    }
}
