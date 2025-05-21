package org.fernando.structural.facade;

public class FacadeApp {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        ComputerFacade computerFacade = new ComputerFacade(cpu, memory, hardDrive);
        computerFacade.start();
    }
}
