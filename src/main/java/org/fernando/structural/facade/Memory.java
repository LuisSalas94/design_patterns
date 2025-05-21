package org.fernando.structural.facade;

public class Memory {
    public void load(long position, String data){
        System.out.println("Loading data to memory at position " + position + ": " + data);
    }
}
