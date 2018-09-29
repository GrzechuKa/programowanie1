package homework.logicExamples.easy3;


public class Easy3 {

    public static void main(String[] args) {

        /*
        Zaimplementuj klasę Computer z trzema polami:
        częstotliwość taktowania procesora (cpu), pamięć (ram), pojemność dysku (diskCapacity).
        Następnie utwórz tablicę obiektów typu Computer, wypełnij ją kilkoma przykładowymi instancjami
        klasy Computer i posortuj algorytmem sortowania przez wstawianie (insertion sort).
        Obiekty klasy Computer powinny być sortowane kolejno wg: cpu, ram, diskCapacity.
         */


        Computer computer1 = new Computer(2.2F, 4, 320);
        Computer computer2 = new Computer(2.4F, 8, 640);
        Computer computer3 = new Computer(2.6F, 6, 960);
        Computer computer4 = new Computer(2.2F, 4, 1028);

        Computer[] arrayComputer = new Computer[4];

        arrayComputer[0] = computer1;
        arrayComputer[1] = computer2;
        arrayComputer[2] = computer3;
        arrayComputer[3] = computer4;
        printComputerArray(arrayComputer);

        insertionSortCpu(arrayComputer);
        printComputerArray(arrayComputer);

        insertionSortRam(arrayComputer);
        printComputerArray(arrayComputer);

        insertionSortDiskCapacity(arrayComputer);
        printComputerArray(arrayComputer);

    }

    public static void insertionSortCpu(Computer array[]) {
        int i = 1;
        while (i < array.length) {
            int j = i;
            while (j > 0 && array[j - 1].getCpu() > array[j].getCpu()) {
                Computer temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j -= 1;
            }
            i += 1;
        }
    }

    public static void insertionSortRam(Computer array[]) {
        int i = 1;
        while (i < array.length) {
            int j = i;
            while (j > 0 && array[j - 1].getRam() > array[j].getRam()) {
                Computer temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j -= 1;
            }
            i += 1;
        }
    }

    public static void insertionSortDiskCapacity(Computer array[]) {
        int i = 1;
        while (i < array.length) {
            int j = i;
            while (j > 0 && array[j - 1].getDiskCapacity() > array[j].getDiskCapacity()) {
                Computer temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j -= 1;
            }
            i += 1;
        }
    }


    public static void printComputerArray(Computer[] arrayComputer) {
        for (Computer c : arrayComputer) {
            System.out.println(c);
        }
        System.out.println();
    }

}


