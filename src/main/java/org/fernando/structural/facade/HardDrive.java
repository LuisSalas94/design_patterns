package org.fernando.structural.facade;

public class HardDrive {
    public String read(long lba, int size) {
        return "Boot data from LBA " + lba;
    }
}
