package Q1;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Palok ",100000);
        SuperVisor superVisor = new SuperVisor("John",200000,"Marketing");
        Director director = new Director("Sundor piccai",500000,"Finance");
        System.out.println(worker);
        System.out.println(superVisor);
        System.out.println(director);
    }
}
