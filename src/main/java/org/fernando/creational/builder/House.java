package org.fernando.creational.builder;

public class House {
    private String foundation;
    private String walls;
    private String roof;
    private int rooms;
    private int windows;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", rooms=" + rooms +
                ", windows=" + windows +
                '}';
    }
}
