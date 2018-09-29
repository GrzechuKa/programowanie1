package homework.logicExamples.easy3;

public class Computer {


    private float cpu;
    private int ram;
    private int diskCapacity;

    public Computer(float cpu, int ram, int diskCapacity) {
        this.cpu = cpu;
        this.ram = ram;
        this.diskCapacity = diskCapacity;
    }

    public float getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getDiskCapacity() {
        return diskCapacity;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setDiskCapacity(int diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu = " + cpu +
                ", ram = " + ram +
                ", diskCapacity = " + diskCapacity +
                '}';
    }
}
