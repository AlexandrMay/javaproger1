import java.lang.management.ManagementFactory;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("pid: " + ManagementFactory.getRuntimeMXBean().getName());

        int size = 20000000;

        System.out.println("Starting the loop");
        while (true) {
            System.gc();
            Thread.sleep(10);
            Runtime runtime = Runtime.getRuntime();
            long mem = runtime.totalMemory() - runtime.freeMemory();
            System.out.println(mem);
            Object[] array = new Object[size];
            long mem1 = runtime.totalMemory() - runtime.freeMemory();
            System.out.println((mem1 - mem)/size);
            System.out.println("New array of size: " + array.length + " created");
            for (int i = 0; i < size; i++) {
                array[i] = new Object();
            }
            System.out.println("Created " + size + " objects.");
            Thread.sleep(1000);
        }



    }

}
