package org.fernando.structural.facade;

public class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void start() {
        System.out.println("Starting computer...");
        cpu.freeze();
        String bootData = hardDrive.read(0, 1024);
        memory.load(0, bootData);
        cpu.execute();
    }
}
