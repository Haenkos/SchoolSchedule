package net.haenkos.SchoolScheduler;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        DataStore datastore = new DataStore();

        Block block = datastore.getBlock(3);

        System.out.println(block);
    }
}